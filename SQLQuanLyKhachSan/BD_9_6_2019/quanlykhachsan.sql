-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 08, 2019 at 06:13 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlykhachsan`
--

-- --------------------------------------------------------

--
-- Table structure for table `caidat`
--

DROP TABLE IF EXISTS `caidat`;
CREATE TABLE IF NOT EXISTS `caidat` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TyLePhuThu` float DEFAULT NULL,
  `SoKhachToiDa` int(11) DEFAULT NULL,
  `NgayBatDau` datetime DEFAULT CURRENT_TIMESTAMP,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `caidat`
--

INSERT INTO `caidat` (`ID`, `TyLePhuThu`, `SoKhachToiDa`, `NgayBatDau`, `Xoa`) VALUES
(1, 0.25, 3, '2019-06-08 00:00:00', 0);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
CREATE TABLE IF NOT EXISTS `hoadon` (
  `MaHD` int(11) NOT NULL AUTO_INCREMENT,
  `MaPhong` int(11) DEFAULT NULL,
  `MaPhieuThue` int(11) DEFAULT NULL,
  `TenKhachHang` varchar(50) DEFAULT NULL,
  `DiaChi` varchar(100) DEFAULT NULL,
  `DonGia` float DEFAULT NULL,
  `SoNgayThue` int(11) DEFAULT NULL,
  `TriGia` float DEFAULT NULL,
  `NgayTao` datetime DEFAULT CURRENT_TIMESTAMP,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`MaHD`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaPhong`, `MaPhieuThue`, `TenKhachHang`, `DiaChi`, `DonGia`, `SoNgayThue`, `TriGia`, `NgayTao`, `Xoa`) VALUES
(1, 1, 1, 'Tuấn Anh', 'Trung Sơn, Suối Nghệ, Châu Đức, BRVT', 246000, 2, 500000, '2019-06-09 01:12:57', 0);

-- --------------------------------------------------------

--
-- Table structure for table `loaikhach`
--

DROP TABLE IF EXISTS `loaikhach`;
CREATE TABLE IF NOT EXISTS `loaikhach` (
  `MaLoai` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoai` varchar(50) DEFAULT NULL,
  `HeSo` float DEFAULT NULL,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`MaLoai`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loaikhach`
--

INSERT INTO `loaikhach` (`MaLoai`, `TenLoai`, `HeSo`, `Xoa`) VALUES
(1, 'Nội địa', 1, 0),
(2, 'Nước ngoài', 1.5, 0);

-- --------------------------------------------------------

--
-- Table structure for table `loaiphong`
--

DROP TABLE IF EXISTS `loaiphong`;
CREATE TABLE IF NOT EXISTS `loaiphong` (
  `MaLoai` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoai` varchar(50) DEFAULT NULL,
  `DonGia` float DEFAULT NULL,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`MaLoai`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loaiphong`
--

INSERT INTO `loaiphong` (`MaLoai`, `TenLoai`, `DonGia`, `Xoa`) VALUES
(1, 'A', 150000, 0),
(2, 'B', 170000, 0),
(3, 'C', 200000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `phieuthuekhachhang`
--

DROP TABLE IF EXISTS `phieuthuekhachhang`;
CREATE TABLE IF NOT EXISTS `phieuthuekhachhang` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MaPhieuThue` int(11) DEFAULT NULL,
  `TenKhachHang` varchar(50) DEFAULT NULL,
  `LoaiKhach` int(11) DEFAULT NULL,
  `CMND` varchar(20) DEFAULT NULL,
  `DiaChi` varchar(100) DEFAULT NULL,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phieuthuekhachhang`
--

INSERT INTO `phieuthuekhachhang` (`ID`, `MaPhieuThue`, `TenKhachHang`, `LoaiKhach`, `CMND`, `DiaChi`, `Xoa`) VALUES
(1, 1, 'Tuấn Anh', 1, '273568742', 'Trung sơn, Vũng Tàu', 0),
(2, 1, 'Phương Linh', 2, '273568754', 'Quận 12, tp.HCM', 0),
(3, 1, 'Cẩm Tú', 2, '273568954', '232, Trung Sơn, Bà Rịa Vũng Tàu', 0);

-- --------------------------------------------------------

--
-- Table structure for table `phieuthuephong`
--

DROP TABLE IF EXISTS `phieuthuephong`;
CREATE TABLE IF NOT EXISTS `phieuthuephong` (
  `MaPhieuThue` int(11) NOT NULL AUTO_INCREMENT,
  `MaPhong` int(11) DEFAULT NULL,
  `NgayThue` datetime DEFAULT CURRENT_TIMESTAMP,
  `TongTien` float DEFAULT NULL,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`MaPhieuThue`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phieuthuephong`
--

INSERT INTO `phieuthuephong` (`MaPhieuThue`, `MaPhong`, `NgayThue`, `TongTien`, `Xoa`) VALUES
(1, 1, '2019-06-09 01:07:59', 123000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

DROP TABLE IF EXISTS `phong`;
CREATE TABLE IF NOT EXISTS `phong` (
  `MaPhong` int(11) NOT NULL AUTO_INCREMENT,
  `TenPhong` varchar(20) DEFAULT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  `TinhTrang` varchar(20) DEFAULT NULL,
  `MaLoai` int(11) DEFAULT NULL,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`MaPhong`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`MaPhong`, `TenPhong`, `GhiChu`, `TinhTrang`, `MaLoai`, `Xoa`) VALUES
(1, '101', 'Không có ghi chú', 'Trống', 1, 0),
(2, '102', 'Không có ghi chú', 'Trống', 2, 0),
(3, '103', 'Không có ghi chú', 'Trống', 3, 0);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Account` varchar(20) DEFAULT NULL,
  `Passwork` varchar(100) DEFAULT NULL,
  `LoaiTaiKhoan` int(11) DEFAULT NULL,
  `TenNguoiDung` varchar(50) DEFAULT NULL,
  `Xoa` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`ID`, `Account`, `Passwork`, `LoaiTaiKhoan`, `TenNguoiDung`, `Xoa`) VALUES
(1, 'admin', 'admin', 1, 'adminstrantor', 0),
(2, 'nhanvien', 'nhanvien', 2, 'Nguyễn Văn Nhân Viên', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
