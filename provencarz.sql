-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2024 at 12:14 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `provencarz`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `catid` int(11) NOT NULL,
  `catipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`catid`, `catipo`) VALUES
(1, 'Campero'),
(2, 'Automovil'),
(3, 'Camionetas'),
(4, 'SUV');

-- --------------------------------------------------------

--
-- Table structure for table `datospersonales`
--

CREATE TABLE `datospersonales` (
  `datid` int(11) NOT NULL,
  `usuid` int(11) DEFAULT NULL,
  `datapellido` varchar(255) DEFAULT NULL,
  `datcorreo` varchar(255) DEFAULT NULL,
  `datelefono` varchar(255) DEFAULT NULL,
  `datipoid` varchar(255) DEFAULT NULL,
  `datnombre` varchar(255) DEFAULT NULL,
  `datnumeroid` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datospersonales`
--

INSERT INTO `datospersonales` (`datid`, `usuid`, `datapellido`, `datcorreo`, `datelefono`, `datipoid`, `datnombre`, `datnumeroid`) VALUES
(1, 1, 'Posso', 'felipe@gmail.com', '3188098720', 'CC', 'Felipe', '1000972867'),
(2, 2, 'Vasquez', 'andres@gmail.com', '3165489731', 'CC', 'Andres', '1888444555'),
(3, 3, 'Mendez', 'camila@gmail.com', '3016549537', 'CC', 'Camila', '1023984753'),
(4, 4, 'Cuervo', 'martha@gmail.com', '3029486512', 'CC', 'Martha', '84213567'),
(5, 5, 'Morales', 'juan@gmail.com', '3164651837', 'CC', 'Juan', '94312984'),
(6, 6, 'LopezNuevo', 'julian@gmail.com', '3154568913', 'CC', 'Julian', '1064453891');

-- --------------------------------------------------------

--
-- Table structure for table `rol`
--

CREATE TABLE `rol` (
  `rolid` int(11) NOT NULL,
  `roltipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rol`
--

INSERT INTO `rol` (`rolid`, `roltipo`) VALUES
(1, 'Cliente'),
(2, 'Vendedor'),
(3, 'VendedorCliente');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `usuid` int(11) NOT NULL,
  `usulogin` varchar(255) DEFAULT NULL,
  `usupassword` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`usuid`, `usulogin`, `usupassword`) VALUES
(1, 'felipe@gmail.com', 'Felipe123'),
(2, 'andres@gmail.com', 'Andres123'),
(3, 'camila@gmail.com', 'Camila123'),
(4, 'martha@gmail.com', 'Martha123'),
(5, 'juan@gmail.com', 'Juan123'),
(6, 'julian@gmail.com', 'Julian123');

-- --------------------------------------------------------

--
-- Table structure for table `usuario_rol`
--

CREATE TABLE `usuario_rol` (
  `rolid` int(11) NOT NULL,
  `usuid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario_rol`
--

INSERT INTO `usuario_rol` (`rolid`, `usuid`) VALUES
(1, 5),
(1, 6),
(2, 3),
(2, 4),
(3, 1),
(3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `vehiculo`
--

CREATE TABLE `vehiculo` (
  `catid` int(11) DEFAULT NULL,
  `datid` int(11) DEFAULT NULL,
  `vehprecio` int(11) DEFAULT NULL,
  `vehestado` varchar(255) DEFAULT NULL,
  `vehmarca` varchar(255) DEFAULT NULL,
  `vehmodelo` varchar(255) DEFAULT NULL,
  `vehplaca` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vehiculo`
--

INSERT INTO `vehiculo` (`catid`, `datid`, `vehprecio`, `vehestado`, `vehmarca`, `vehmodelo`, `vehplaca`) VALUES
(1, 1, 50500500, 'Nuevo', 'Prueva1', '2022', 'AAA444'),
(1, 1, 10100100, 'Usado', 'Jeep', '1999', 'ASD654'),
(2, 3, 50000000, 'Nuevo', 'Mazda', '2024', 'AZT428'),
(1, 1, 15000100, 'Usado', 'RangeRover', '2001', 'DFB123'),
(1, 1, 5000000, 'Nuevo', 'Ford', '2021', 'IKU519'),
(3, 3, 60100000, 'Nuevo', 'Prado', '2023', 'ION516'),
(2, 2, 30000000, 'Usado', 'Chevrolet', '2016', 'IVV081'),
(1, 1, 32000000, 'Nuevo', 'Mazda', '2021', 'LLL111'),
(1, 1, 60500100, 'Nuevo', 'Prueba', '2023', 'LLL333'),
(4, 4, 321000000, 'Usado', 'Honda', '2021', 'NUI384'),
(3, 3, 50500000, 'Nuevo', 'Mazda', '2024', 'OKP261'),
(4, 4, 189000000, 'Usado', 'Jeep', '2020', 'UUI918');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`catid`);

--
-- Indexes for table `datospersonales`
--
ALTER TABLE `datospersonales`
  ADD PRIMARY KEY (`datid`),
  ADD KEY `FKssbd5oofntny5bdvvn2y57osk` (`usuid`);

--
-- Indexes for table `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`rolid`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usuid`);

--
-- Indexes for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD PRIMARY KEY (`rolid`,`usuid`),
  ADD KEY `FKcurc7bfx1qawy8oh83gex3p6y` (`usuid`);

--
-- Indexes for table `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`vehplaca`),
  ADD KEY `FK4sxf3llopagv3km53ei2fx4y0` (`catid`),
  ADD KEY `FKtjw2puyp34f1q9okat8v05o4m` (`datid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `catid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `datospersonales`
--
ALTER TABLE `datospersonales`
  MODIFY `datid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `rol`
--
ALTER TABLE `rol`
  MODIFY `rolid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usuid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `datospersonales`
--
ALTER TABLE `datospersonales`
  ADD CONSTRAINT `FKssbd5oofntny5bdvvn2y57osk` FOREIGN KEY (`usuid`) REFERENCES `usuario` (`usuid`);

--
-- Constraints for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK2x48tydow30ynfud4j59pwddu` FOREIGN KEY (`rolid`) REFERENCES `rol` (`rolid`),
  ADD CONSTRAINT `FKcurc7bfx1qawy8oh83gex3p6y` FOREIGN KEY (`usuid`) REFERENCES `usuario` (`usuid`);

--
-- Constraints for table `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `FK4sxf3llopagv3km53ei2fx4y0` FOREIGN KEY (`catid`) REFERENCES `categoria` (`catid`),
  ADD CONSTRAINT `FKtjw2puyp34f1q9okat8v05o4m` FOREIGN KEY (`datid`) REFERENCES `datospersonales` (`datid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
