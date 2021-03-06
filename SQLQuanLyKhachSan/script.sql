USE [master]
GO
/****** Object:  Database [quanlykhachsan]    Script Date: 08-Jun-19 11:35:17 PM ******/
CREATE DATABASE [quanlykhachsan]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'quanlykhachsan', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\quanlykhachsan.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'quanlykhachsan_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\quanlykhachsan_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [quanlykhachsan].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [quanlykhachsan] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [quanlykhachsan] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [quanlykhachsan] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [quanlykhachsan] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [quanlykhachsan] SET ARITHABORT OFF 
GO
ALTER DATABASE [quanlykhachsan] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [quanlykhachsan] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [quanlykhachsan] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [quanlykhachsan] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [quanlykhachsan] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [quanlykhachsan] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [quanlykhachsan] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [quanlykhachsan] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [quanlykhachsan] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [quanlykhachsan] SET  DISABLE_BROKER 
GO
ALTER DATABASE [quanlykhachsan] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [quanlykhachsan] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [quanlykhachsan] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [quanlykhachsan] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [quanlykhachsan] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [quanlykhachsan] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [quanlykhachsan] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [quanlykhachsan] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [quanlykhachsan] SET  MULTI_USER 
GO
ALTER DATABASE [quanlykhachsan] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [quanlykhachsan] SET DB_CHAINING OFF 
GO
ALTER DATABASE [quanlykhachsan] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [quanlykhachsan] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
USE [quanlykhachsan]
GO
/****** Object:  Table [dbo].[CaiDat]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaiDat](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TyLePhuThu] [float] NULL,
	[SoKhachToiDa] [int] NULL,
	[NgayBatDau] [date] NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_CaiDat] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[MaPhong] [int] NULL,
	[MaPhieuThue] [int] NULL,
	[TenKhachHang] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](50) NULL,
	[DonGia] [float] NULL,
	[SoNgayThue] [int] NULL,
	[TriGia] [float] NULL,
	[NgayTao] [date] NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiKhach]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhach](
	[MaLoai] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NULL,
	[HeSo] [float] NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_LoaiKhach] PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoai] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NULL,
	[DonGia] [float] NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_LoaiPhong] PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuThueKhachHang]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuThueKhachHang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaPhieuThue] [int] NULL,
	[TenKhachHang] [nvarchar](50) NULL,
	[LoaiKhach] [int] NULL,
	[CMND] [nchar](20) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_PhieuThueKhachHang] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuThuePhong]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuThuePhong](
	[MaPhieuThue] [int] IDENTITY(1,1) NOT NULL,
	[MaPhong] [int] NULL,
	[NgayThue] [date] NULL,
	[TongTien] [float] NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_PhieuThuePhong] PRIMARY KEY CLUSTERED 
(
	[MaPhieuThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [int] IDENTITY(1,1) NOT NULL,
	[TenPhong] [nvarchar](50) NULL,
	[GhiChu] [nvarchar](100) NULL,
	[TinhTrang] [nvarchar](20) NULL,
	[MaLoai] [int] NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_Phong] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 08-Jun-19 11:35:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Account] [nchar](10) NULL,
	[Passwork] [nvarchar](50) NULL,
	[LoaiTaiKhoan] [int] NULL,
	[TenNguoiDung] [nvarchar](50) NULL,
	[Xoa] [bit] NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[CaiDat] ON 

INSERT [dbo].[CaiDat] ([ID], [TyLePhuThu], [SoKhachToiDa], [NgayBatDau], [Xoa]) VALUES (1, 0.25, 3, CAST(N'2019-06-08' AS Date), 0)
SET IDENTITY_INSERT [dbo].[CaiDat] OFF
SET IDENTITY_INSERT [dbo].[LoaiKhach] ON 

INSERT [dbo].[LoaiKhach] ([MaLoai], [TenLoai], [HeSo], [Xoa]) VALUES (1, N'Nội địa', 1, 0)
INSERT [dbo].[LoaiKhach] ([MaLoai], [TenLoai], [HeSo], [Xoa]) VALUES (2, N'Nước ngoái', 1.5, 0)
SET IDENTITY_INSERT [dbo].[LoaiKhach] OFF
SET IDENTITY_INSERT [dbo].[LoaiPhong] ON 

INSERT [dbo].[LoaiPhong] ([MaLoai], [TenLoai], [DonGia], [Xoa]) VALUES (1, N'A', 150000, 0)
INSERT [dbo].[LoaiPhong] ([MaLoai], [TenLoai], [DonGia], [Xoa]) VALUES (2, N'B', 170000, 0)
INSERT [dbo].[LoaiPhong] ([MaLoai], [TenLoai], [DonGia], [Xoa]) VALUES (3, N'C', 200000, 0)
SET IDENTITY_INSERT [dbo].[LoaiPhong] OFF
USE [master]
GO
ALTER DATABASE [quanlykhachsan] SET  READ_WRITE 
GO
