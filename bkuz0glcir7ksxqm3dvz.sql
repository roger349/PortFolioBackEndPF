-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bkuz0glcir7ksxqm3dvz-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 20, 2023 at 04:36 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bkuz0glcir7ksxqm3dvz`
--

-- --------------------------------------------------------

--
-- Table structure for table `datos_personales`
--

CREATE TABLE `datos_personales` (
  `id_datos_personales` bigint(20) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correo_electronico` varchar(45) NOT NULL,
  `estado_civil` varchar(45) NOT NULL,
  `fecha_nacimiento` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `datos_personales`
--

INSERT INTO `datos_personales` (`id_datos_personales`, `apellido`, `correo_electronico`, `estado_civil`, `fecha_nacimiento`, `nombre`) VALUES
(152, 'Roldan', 'roger349@gmail.com', 'soltero', ' 09/10/77', 'Roger E.');

-- --------------------------------------------------------

--
-- Table structure for table `datos_personales_seq`
--

CREATE TABLE `datos_personales_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `datos_personales_seq`
--

INSERT INTO `datos_personales_seq` (`next_val`) VALUES
(251);

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id_educacion` bigint(20) NOT NULL,
  `condicion` varchar(45) NOT NULL,
  `institucion` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id_educacion`, `condicion`, `institucion`, `titulo`) VALUES
(1, 'curso completo', 'UNSE', 'armado y reparacion de pc'),
(2, 'bachiller completo', 'La Brasa', 'bachiller biologico'),
(3, 'en curso', 'UNSE', 'CPN'),
(4, 'en curso', 'INTI', 'ArgentinaPrograma'),
(202, 'curso completo', 'espn', 'perito mercantil'),
(252, 'curso completo', 'Esc. Nac. °1', 'bachiller biologico');

-- --------------------------------------------------------

--
-- Table structure for table `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(351);

-- --------------------------------------------------------

--
-- Table structure for table `experiencia_laboral`
--

CREATE TABLE `experiencia_laboral` (
  `id_experiencia` bigint(20) NOT NULL,
  `descripcion_puesto` varchar(200) NOT NULL,
  `fecha_inicio` varchar(45) NOT NULL,
  `nombre_empresa` varchar(45) NOT NULL,
  `fecha_fin` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia_laboral`
--

INSERT INTO `experiencia_laboral` (`id_experiencia`, `descripcion_puesto`, `fecha_inicio`, `nombre_empresa`, `fecha_fin`) VALUES
(453, 'desarrollador back end ', '12-12-2021', 'EEEsrlee', ' 09-10-2021'),
(454, 'trainer', '12-12-2022', 'EE3Esrlee', ' 09-10-2022'),
(502, 'trainer', '12-1-2023', 'EE3Esr', ' 09-10-2023'),
(503, 'trainer', '12-1-2023', 'EE3Esr', ' 09-10-2023'),
(504, 'aplicacion ventas', '12-3-2022', 'EE3Esrlee', ' 09-3-2023'),
(604, 'aplicacion ecomerce', '1/1/2022', 'hhh1245', '12/1/2023'),
(605, 'aplicacion contabilidad', '10/2/2022', 'rrrr321', '12/1/2023'),
(652, 'trainner', '1/5/2022', 'yyyyy123', '12/2/2023');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia_laboral_seq`
--

CREATE TABLE `experiencia_laboral_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia_laboral_seq`
--

INSERT INTO `experiencia_laboral_seq` (`next_val`) VALUES
(751);

-- --------------------------------------------------------

--
-- Table structure for table `jornada_laboral`
--

CREATE TABLE `jornada_laboral` (
  `id_jornada` bigint(20) NOT NULL,
  `tipo_jornada` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `jornada_laboral`
--

INSERT INTO `jornada_laboral` (`id_jornada`, `tipo_jornada`) VALUES
(1, 'freelance'),
(2, 'jornada completa'),
(3, 'media jornada');

-- --------------------------------------------------------

--
-- Table structure for table `jornada_laboral_seq`
--

CREATE TABLE `jornada_laboral_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `jornada_laboral_seq`
--

INSERT INTO `jornada_laboral_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `id_proyecto` bigint(20) NOT NULL,
  `descripcion_proyecto` varchar(200) NOT NULL,
  `tipo_proyecto` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`id_proyecto`, `descripcion_proyecto`, `tipo_proyecto`) VALUES
(102, 'desarrollo de aplicacion ecomerce', 'proyecto Personal'),
(103, 'desarrollo de aplicacion ventas', 'proyecto de Empresa'),
(104, 'desarrollo de aplicacion Argentina Programa', 'proyecto de Personal'),
(202, 'aplicacion financiera web', 'proyecto empresa'),
(252, 'aaplicacion social web', 'proyecto personal');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos_seq`
--

CREATE TABLE `proyectos_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos_seq`
--

INSERT INTO `proyectos_seq` (`next_val`) VALUES
(351);

-- --------------------------------------------------------

--
-- Table structure for table `tecnologias`
--

CREATE TABLE `tecnologias` (
  `id_tecnologias` bigint(20) NOT NULL,
  `nombre_tecnologia` varchar(45) NOT NULL,
  `porcentaje_tecnologia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tecnologias`
--

INSERT INTO `tecnologias` (`id_tecnologias`, `nombre_tecnologia`, `porcentaje_tecnologia`) VALUES
(1, 'Html', 50),
(2, 'Css', 50),
(3, 'Javascript', 50),
(5, 'Mysql', 50),
(6, 'Typescript', 50),
(7, 'Bootstrap', 50),
(8, 'Angular', 50),
(9, 'Spring Boot', 50),
(52, 'Java', 50),
(202, 'python', 50);

-- --------------------------------------------------------

--
-- Table structure for table `tecnologias_seq`
--

CREATE TABLE `tecnologias_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tecnologias_seq`
--

INSERT INTO `tecnologias_seq` (`next_val`) VALUES
(301);

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `usuario` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`usuario`, `password`) VALUES
('roger349@gmail.com', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datos_personales`
--
ALTER TABLE `datos_personales`
  ADD PRIMARY KEY (`id_datos_personales`);

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id_educacion`);

--
-- Indexes for table `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD PRIMARY KEY (`id_experiencia`);

--
-- Indexes for table `jornada_laboral`
--
ALTER TABLE `jornada_laboral`
  ADD PRIMARY KEY (`id_jornada`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id_proyecto`);

--
-- Indexes for table `tecnologias`
--
ALTER TABLE `tecnologias`
  ADD PRIMARY KEY (`id_tecnologias`);

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD UNIQUE KEY `password` (`password`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
