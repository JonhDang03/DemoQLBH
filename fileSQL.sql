USE [master]
GO
/****** Object:  Database [QL_MYPHAMM]    Script Date: 16/08/2024 3:10:20 CH ******/
CREATE DATABASE [QL_MYPHAMM]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QL_MYPHAMM', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\QL_MYPHAMM.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QL_MYPHAMM_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\QL_MYPHAMM_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [QL_MYPHAMM] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QL_MYPHAMM].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QL_MYPHAMM] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET ARITHABORT OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QL_MYPHAMM] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QL_MYPHAMM] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QL_MYPHAMM] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET  ENABLE_BROKER 
GO
ALTER DATABASE [QL_MYPHAMM] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QL_MYPHAMM] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QL_MYPHAMM] SET  MULTI_USER 
GO
ALTER DATABASE [QL_MYPHAMM] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QL_MYPHAMM] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QL_MYPHAMM] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QL_MYPHAMM] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QL_MYPHAMM] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QL_MYPHAMM] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QL_MYPHAMM] SET QUERY_STORE = ON
GO
ALTER DATABASE [QL_MYPHAMM] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [QL_MYPHAMM]
GO
/****** Object:  Table [dbo].[ChiTietHD]    Script Date: 16/08/2024 3:10:21 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHD](
	[Mahoadon] [int] NOT NULL,
	[MaSP] [int] NOT NULL,
	[TenSp] [nvarchar](100) NULL,
	[SoLuong] [int] NULL,
	[GiaBan] [real] NULL,
	[makhuyenmai] [int] NULL,
	[tongkhuyenmai] [decimal](18, 0) NULL,
	[thanhtien] [decimal](18, 0) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 16/08/2024 3:10:21 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[Mahoadon] [int] IDENTITY(1,1) NOT NULL,
	[Makhach] [int] NULL,
	[Tenkhach] [nvarchar](100) NULL,
	[Ngaylap] [date] NULL,
	[Tongsl] [int] NULL,
	[Tongtien] [decimal](18, 0) NULL,
	[Trangthai] [nvarchar](100) NULL,
	[tienkhachtra] [decimal](18, 0) NULL,
	[tientralai] [decimal](18, 0) NULL,
	[isdelete] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Mahoadon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 16/08/2024 3:10:21 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[Makhach] [int] IDENTITY(1,1) NOT NULL,
	[Tenkhach] [nvarchar](100) NOT NULL,
	[Ngaysinh] [date] NOT NULL,
	[Diachi] [nvarchar](100) NOT NULL,
	[Sdt] [nvarchar](100) NOT NULL,
	[Diemtichluy] [int] NULL,
	[Anhkh] [nvarchar](150) NULL,
	[isdelete] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Makhach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 16/08/2024 3:10:21 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[makhuyenmai] [int] IDENTITY(1,1) NOT NULL,
	[tenkhuyenmai] [nvarchar](100) NOT NULL,
	[ngaybatdau] [date] NOT NULL,
	[ngayketthuc] [date] NOT NULL,
	[giatri] [real] NOT NULL,
	[isdelete] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[makhuyenmai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 16/08/2024 3:10:21 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [int] IDENTITY(1,1) NOT NULL,
	[TenSP] [nvarchar](100) NOT NULL,
	[LoaiSP] [nvarchar](100) NOT NULL,
	[GiaBan] [real] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[makhuyenmai] [int] NULL,
	[anhsp] [nvarchar](150) NULL,
	[isdelete] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 16/08/2024 3:10:21 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[Mataikhoan] [int] NOT NULL,
	[TenTk] [nvarchar](50) NULL,
	[Mk] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Mataikhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (1, 1, N'Christian Louboutin Lip Colour', 2, 1E+07, 5, CAST(2000000 AS Decimal(18, 0)), CAST(18000000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (1, 7, N'Son L’Oreal Color Riche by Chopard', 2, 1E+07, 5, CAST(2000000 AS Decimal(18, 0)), CAST(18000000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (2, 1, N'Christian Louboutin Lip Colour', 1, 1E+07, 5, CAST(1000000 AS Decimal(18, 0)), CAST(9000000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (2, 2, N'Nước hoa nam Dior Sauvage Eau de Toilette', 2, 5000000, 9, CAST(500000 AS Decimal(18, 0)), CAST(9500000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (2, 7, N'Nước hoa nam Dior Sauvage Eau de Toilette', 1, 1E+07, 5, CAST(1000000 AS Decimal(18, 0)), CAST(9000000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (2, 10, N'Nước hoa nam Dior Sauvage Eau de Toilette', 5, 120000, 10, CAST(30000 AS Decimal(18, 0)), CAST(570000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (2, 8, N'Nước hoa nam Dior Sauvage Eau de Toilette', 3, 350000, 10, CAST(52500 AS Decimal(18, 0)), CAST(997500 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (4, 10, N'Nước hoa nam Bleu de Chanel', 1, 120000, 10, CAST(6000 AS Decimal(18, 0)), CAST(114000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (4, 12, N'test', 1, 100000, 10, CAST(5000 AS Decimal(18, 0)), CAST(95000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (5, 12, N'test', 10, 100000, 10, CAST(50000 AS Decimal(18, 0)), CAST(950000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (5, 11, N'abc', 1, 12, NULL, CAST(0 AS Decimal(18, 0)), CAST(12 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (6, 1, N'Christian Louboutin Lip Colour', 1, 1E+07, 5, CAST(1000000 AS Decimal(18, 0)), CAST(9000000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (6, 5, N'Son Hold Live Mousse Velvet Lipstick', 3, 1500000, 9, CAST(225000 AS Decimal(18, 0)), CAST(4275000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (6, 10, N'Nước hoa nam Bleu de Chanel', 5, 120000, 10, CAST(30000 AS Decimal(18, 0)), CAST(570000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (7, 11, N'abc', 5, 12, NULL, CAST(0 AS Decimal(18, 0)), CAST(60 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (7, 12, N'test', 8, 100000, 10, CAST(40000 AS Decimal(18, 0)), CAST(760000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (8, 9, N'Nước hoa nam Power Eau de Toilette', 3, 500000, 10, CAST(75000 AS Decimal(18, 0)), CAST(1425000 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (9, 11, N'abc', 1, 12, NULL, CAST(0 AS Decimal(18, 0)), CAST(12 AS Decimal(18, 0)))
INSERT [dbo].[ChiTietHD] ([Mahoadon], [MaSP], [TenSp], [SoLuong], [GiaBan], [makhuyenmai], [tongkhuyenmai], [thanhtien]) VALUES (9, 12, N'test', 10, 100000, 10, CAST(50000 AS Decimal(18, 0)), CAST(950000 AS Decimal(18, 0)))
GO
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (1, 1, N'Đặng Văn Mùi', CAST(N'2023-04-01' AS Date), 4, CAST(36000000 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(40000000 AS Decimal(18, 0)), CAST(4000000 AS Decimal(18, 0)), 0)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (2, 2, N'Lê Thị Bích Trâm', CAST(N'2023-04-04' AS Date), 12, CAST(29067500 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(30000000 AS Decimal(18, 0)), CAST(932500 AS Decimal(18, 0)), 0)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (3, 3, N'Nguyẽn Đình Nhật', CAST(N'2023-04-20' AS Date), 2, CAST(100000 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(200000 AS Decimal(18, 0)), CAST(100000 AS Decimal(18, 0)), 0)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (4, 4, N'Vũ Đức Tài', CAST(N'2023-05-03' AS Date), 2, CAST(209000 AS Decimal(18, 0)), N'Chưa Thanh Toán', CAST(0 AS Decimal(18, 0)), CAST(0 AS Decimal(18, 0)), 1)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (5, NULL, N'Mùi', CAST(N'2023-05-04' AS Date), 11, CAST(950012 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(0 AS Decimal(18, 0)), CAST(0 AS Decimal(18, 0)), 1)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (6, 7, N'Lê Gia Linh', CAST(N'2023-05-04' AS Date), 9, CAST(13845000 AS Decimal(18, 0)), N'Chưa Thanh Toán', CAST(0 AS Decimal(18, 0)), CAST(0 AS Decimal(18, 0)), NULL)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (7, 9, N'test', CAST(N'2023-05-04' AS Date), 13, CAST(760060 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(800000 AS Decimal(18, 0)), CAST(399400 AS Decimal(18, 0)), NULL)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (8, 6, N'Lê Ngọc Trâm', CAST(N'2023-05-04' AS Date), 3, CAST(1425000 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(0 AS Decimal(18, 0)), CAST(0 AS Decimal(18, 0)), NULL)
INSERT [dbo].[HoaDon] ([Mahoadon], [Makhach], [Tenkhach], [Ngaylap], [Tongsl], [Tongtien], [Trangthai], [tienkhachtra], [tientralai], [isdelete]) VALUES (9, 9, N'test', CAST(N'2023-05-05' AS Date), 11, CAST(950012 AS Decimal(18, 0)), N'Đã Thanh Toán', CAST(950012 AS Decimal(18, 0)), CAST(0 AS Decimal(18, 0)), 1)
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (1, N'Đặng Văn Mùi', CAST(N'2003-09-10' AS Date), N'Thanh Hóa', N'0862454136', 1000, N'C:\Anh\anhtram1.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (2, N'Lê Thị Bích Trâm', CAST(N'2007-02-09' AS Date), N'Trà Vinh', N'0866812336', 1000, N'C:\Anh\anhtram1.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (3, N'Nguyễn Đình Nhật', CAST(N'2003-04-25' AS Date), N'Thanh Hóa', N'0353123363', 110, N'C:\Anh\anhKH5.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (4, N'Vũ Đức Tài', CAST(N'2003-10-10' AS Date), N'Hà Nội', N'092288357', 130, N'C:\Anh\anhKH6.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (5, N'Phạm Bảo Uyên', CAST(N'2007-04-25' AS Date), N'Nghệ An', N'0244452336', 10, N'C:\Anh\anhKH1.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (6, N'Lê Ngọc Trâm', CAST(N'2004-02-10' AS Date), N'Hà Nội', N'0837491294', 210, N'C:\Anh\anhKH2.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (7, N'Lê Gia Linh', CAST(N'2005-02-10' AS Date), N'Thanh Hóa', N'0716263716', 110, N'C:\Anh\anhKH3.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (8, N'Lê Thảo Trang', CAST(N'2006-02-10' AS Date), N'Thái Nguyên', N'0938737283', 100, N'C:\Anh\anhKH4.jpg', 0)
INSERT [dbo].[KhachHang] ([Makhach], [Tenkhach], [Ngaysinh], [Diachi], [Sdt], [Diemtichluy], [Anhkh], [isdelete]) VALUES (9, N'test', CAST(N'2005-02-10' AS Date), N'Thái Nguyên', N'123434242', 30, N'C:\Anh\anhKH3.jpg', 0)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
GO
SET IDENTITY_INSERT [dbo].[KhuyenMai] ON 

INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (1, N'Vì Yêu Mà Đến', CAST(N'2020-10-10' AS Date), CAST(N'2025-10-10' AS Date), 20, 0)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (2, N'Valentine', CAST(N'2023-02-14' AS Date), CAST(N'2023-02-14' AS Date), 10, 1)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (3, N'Ngày đặc biệt', CAST(N'2021-02-09' AS Date), CAST(N'2030-02-09' AS Date), 5, 0)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (4, N'10/10', CAST(N'2023-10-10' AS Date), CAST(N'2023-10-10' AS Date), 5, 1)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (5, N'Ưu Đãi Sản Phẩm đặc biệt', CAST(N'2023-01-01' AS Date), CAST(N'2033-01-01' AS Date), 10, 0)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (6, N'Tết Nguyên Đán', CAST(N'2022-12-10' AS Date), CAST(N'2023-01-10' AS Date), 10, 1)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (7, N'Kỉ niệm ICTU', CAST(N'2001-12-14' AS Date), CAST(N'2025-12-14' AS Date), 23, 0)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (8, N'Vì ICTU', CAST(N'2023-12-14' AS Date), CAST(N'2023-12-15' AS Date), 20, 1)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (9, N'Sản phẩm son', CAST(N'2023-09-01' AS Date), CAST(N'2033-09-01' AS Date), 5, 0)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (10, N'Sản phẩm nước hoa', CAST(N'2023-09-01' AS Date), CAST(N'2033-09-01' AS Date), 5, 0)
INSERT [dbo].[KhuyenMai] ([makhuyenmai], [tenkhuyenmai], [ngaybatdau], [ngayketthuc], [giatri], [isdelete]) VALUES (11, N'Sale 9/9', CAST(N'2023-09-09' AS Date), CAST(N'2033-09-09' AS Date), 5, 0)
SET IDENTITY_INSERT [dbo].[KhuyenMai] OFF
GO
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (1, N'Christian Louboutin Lip Colour', N'Son', 1E+07, 2, 5, N'C:\Anh\anhSon5.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (2, N'Son L’Oreal Color Riche by Chopard', N'Son', 5000000, 20, 9, N'C:\Anh\anhSon1.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (3, N'Son Clé de Peau Beauté Lipstick', N'Son', 1250000, 50, 9, N'C:\Anh\anhSon2.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (4, N'Son Guerlain Gold and Diamonds', N'Son', 3500000, 40, 9, N'C:\Anh\anhSon4.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (5, N'Son Hold Live Mousse Velvet Lipstick', N'Son', 1500000, 41, 9, N'C:\Anh\anhSon3.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (6, N'Givenchy Le Rouge Sheer Velvet 39', N'Son', 500000, 100, 9, N'C:\Anh\anhSon6.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (7, N'Nước hoa nam Dior Sauvage Eau ', N'Nước hoa', 1E+07, 5, 5, N'C:\Anh\nuochoa2.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (8, N'Nước hoa nam VERSACE POUR ', N'Nước hoa', 350000, 50, 10, N'C:\Anh\nuochoa3.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (9, N'Nước hoa nam Power Eau de Toilette', N'Nước hoa', 500000, 97, 10, N'C:\Anh\nuochoa4.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (10, N'Nước hoa nam Bleu de Chanel', N'Nước hoa', 120000, 183, 10, N'C:\Anh\nuochoa1.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (11, N'abc', N'a1', 12, 12, NULL, N'C:\Anh\nuochoa1.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (12, N'test', N'Nước hoa', 100000, 200, 10, N'C:\Anh\nuochoa1.png', 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (13, N'sona1', N'son', 100000, 2, 1, N'C:\Anh\anhSon4.png', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [makhuyenmai], [anhsp], [isdelete]) VALUES (14, N'11a', N'1', 1111, 1, 1, N'C:\Users\dangm\OneDrive\Tài liệu\NetBeansProjects\QLBanMP_Nhom5\src\Pictures\rsz_1addanh.jpg', 0)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
GO
INSERT [dbo].[TaiKhoan] ([Mataikhoan], [TenTk], [Mk]) VALUES (1, N'admin', N'123')
INSERT [dbo].[TaiKhoan] ([Mataikhoan], [TenTk], [Mk]) VALUES (2, N'user1', N'123')
INSERT [dbo].[TaiKhoan] ([Mataikhoan], [TenTk], [Mk]) VALUES (3, N'user2', N'123')
GO
ALTER TABLE [dbo].[ChiTietHD]  WITH CHECK ADD  CONSTRAINT [fk_mahd] FOREIGN KEY([Mahoadon])
REFERENCES [dbo].[HoaDon] ([Mahoadon])
GO
ALTER TABLE [dbo].[ChiTietHD] CHECK CONSTRAINT [fk_mahd]
GO
ALTER TABLE [dbo].[ChiTietHD]  WITH CHECK ADD  CONSTRAINT [fk_masp] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietHD] CHECK CONSTRAINT [fk_masp]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [fk_makhach] FOREIGN KEY([Makhach])
REFERENCES [dbo].[KhachHang] ([Makhach])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [fk_makhach]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [fk_makm] FOREIGN KEY([makhuyenmai])
REFERENCES [dbo].[KhuyenMai] ([makhuyenmai])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [fk_makm]
GO
USE [master]
GO
ALTER DATABASE [QL_MYPHAMM] SET  READ_WRITE 
GO
