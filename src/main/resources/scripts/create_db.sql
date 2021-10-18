-- CREATE SCHEMA IF NOT EXISTS theaters CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- USE theaters;
USE heroku_25abbf17d34c1f5;

CREATE TABLE IF NOT EXISTS `theater`
(
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `version` BIGINT NOT NULL,
    `code` BINARY(16) NOT NULL,
    `name` VARCHAR(128) NOT NULL,
    `enabled` bit(1) NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    UNIQUE KEY UK_theater_code (code)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE IF NOT EXISTS `auditorium`
(
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `version` BIGINT NOT NULL,
    `code` BINARY(16) NOT NULL,
    `name` VARCHAR(128) NOT NULL,
    `theater_id` BIGINT NOT NULL,
    CONSTRAINT `FK_auditorium_theater` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`id`),
    PRIMARY KEY (`id`),
    UNIQUE KEY UK_auditorium_code (code)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE IF NOT EXISTS `seat`
(
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `version` BIGINT NOT NULL,
    `code` BINARY(16) NOT NULL,
    `row` VARCHAR(16) NOT NULL,
    `column` VARCHAR(16) NOT NULL,
    `auditorium_id` BIGINT NOT NULL,
    CONSTRAINT `FK_seat_auditorium` FOREIGN KEY (`auditorium_id`) REFERENCES `auditorium` (`id`),
    PRIMARY KEY (`id`),
    UNIQUE KEY UK_seat_code (code)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;