-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Янв 03 2018 г., 09:02
-- Версия сервера: 5.5.25
-- Версия PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `db_bookinggym`
--

-- --------------------------------------------------------

--
-- Структура таблицы `clients`
--

CREATE TABLE IF NOT EXISTS `clients` (
  `c_id_client` int(11) NOT NULL AUTO_INCREMENT,
  `c_surname` varchar(20) NOT NULL,
  `c_name` varchar(20) NOT NULL,
  `c_lastname` varchar(20) NOT NULL,
  `c_phone` varchar(30) NOT NULL,
  PRIMARY KEY (`c_id_client`),
  UNIQUE KEY `id-client_2` (`c_id_client`),
  KEY `id-client` (`c_id_client`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Дамп данных таблицы `clients`
--

INSERT INTO `clients` (`c_id_client`, `c_surname`, `c_name`, `c_lastname`, `c_phone`) VALUES
(1, 'Сысоев', 'Виссарион', 'Николаевич', '87777777777'),
(2, 'Корнилов ', 'Юстиниан ', 'Всеволодович', '86666666666'),
(3, 'Шашков ', 'Вальтер ', 'Натанович', '85555555555'),
(4, 'Анисимов ', 'Мечислав ', 'Иванович', '84444444444'),
(5, 'Меркушева ', 'Альбина ', 'Александровна', '83332223331'),
(6, 'Попова ', 'Амелия ', 'Оскаровна', '89990009990');

-- --------------------------------------------------------

--
-- Структура таблицы `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `r_id_reservation` int(11) NOT NULL AUTO_INCREMENT,
  `r_id_client` int(11) NOT NULL,
  `r_hall` varchar(100) NOT NULL,
  `r_begin_visits` datetime NOT NULL,
  `r_end_visits` datetime NOT NULL,
  `r_id_tariff` int(11) NOT NULL,
  `r_id_status` int(11) NOT NULL,
  PRIMARY KEY (`r_id_reservation`),
  KEY `id-tariff` (`r_id_tariff`),
  KEY `id-status` (`r_id_status`),
  KEY `id-status_2` (`r_id_status`),
  KEY `id-status_3` (`r_id_status`),
  KEY `id-status_4` (`r_id_status`),
  KEY `id-client` (`r_id_client`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Дамп данных таблицы `reservation`
--

INSERT INTO `reservation` (`r_id_reservation`, `r_id_client`, `r_hall`, `r_begin_visits`, `r_end_visits`, `r_id_tariff`, `r_id_status`) VALUES
(1, 1, '1', '2018-01-03 00:00:00', '2018-02-03 00:00:00', 1, 1),
(2, 2, '2', '2018-01-04 00:00:00', '2018-03-04 00:00:00', 2, 2),
(3, 3, '2', '2018-02-10 00:00:00', '2018-03-10 00:00:00', 1, 3),
(4, 4, '1', '2018-01-01 00:00:00', '2018-03-01 00:00:00', 2, 4),
(5, 5, '3', '2018-01-02 00:00:00', '2018-02-02 00:00:00', 1, 5),
(6, 6, '3', '2018-01-03 00:00:00', '2018-03-03 00:00:00', 2, 6);

-- --------------------------------------------------------

--
-- Структура таблицы `statuses`
--

CREATE TABLE IF NOT EXISTS `statuses` (
  `s_id_status` int(11) NOT NULL AUTO_INCREMENT,
  `s_processing` tinyint(1) NOT NULL,
  `s_approved` tinyint(1) NOT NULL,
  `s_failure` tinyint(1) NOT NULL,
  PRIMARY KEY (`s_id_status`),
  KEY `id-status` (`s_id_status`),
  KEY `id-status_2` (`s_id_status`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Дамп данных таблицы `statuses`
--

INSERT INTO `statuses` (`s_id_status`, `s_processing`, `s_approved`, `s_failure`) VALUES
(1, 1, 0, 0),
(2, 0, 1, 0),
(3, 0, 1, 0),
(4, 0, 0, 1),
(5, 1, 0, 0),
(6, 0, 1, 0);

-- --------------------------------------------------------

--
-- Структура таблицы `tariff`
--

CREATE TABLE IF NOT EXISTS `tariff` (
  `t_id_tariff` int(11) NOT NULL AUTO_INCREMENT,
  `r_cost` varchar(100) NOT NULL,
  `t_number_visits` varchar(100) NOT NULL,
  `t_number_days` varchar(100) NOT NULL,
  `t_name` text NOT NULL,
  PRIMARY KEY (`t_id_tariff`),
  UNIQUE KEY `price` (`r_cost`),
  UNIQUE KEY `price_2` (`r_cost`),
  UNIQUE KEY `price_3` (`r_cost`),
  UNIQUE KEY `price_4` (`r_cost`),
  UNIQUE KEY `price_5` (`r_cost`),
  KEY `id-tariffa` (`t_id_tariff`),
  KEY `id-tariffa_2` (`t_id_tariff`),
  KEY `id-tariffa_3` (`t_id_tariff`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `tariff`
--

INSERT INTO `tariff` (`t_id_tariff`, `r_cost`, `t_number_visits`, `t_number_days`, `t_name`) VALUES
(1, '1500', '12', '30', 'Тариф1'),
(2, '2800', '24', '60', 'Тариф2');

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_3` FOREIGN KEY (`r_id_status`) REFERENCES `statuses` (`s_id_status`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservation_ibfk_4` FOREIGN KEY (`r_id_client`) REFERENCES `clients` (`c_id_client`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservation_ibfk_5` FOREIGN KEY (`r_id_tariff`) REFERENCES `tariff` (`t_id_tariff`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
