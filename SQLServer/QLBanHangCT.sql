use master
go
alter database QLBanHangCT set single_user with rollback immediate
drop database QLBanHangCT

create database QLBanHangCT
go

use QLBanHangCT
go

create table SanPham (
	maSP nchar(10) not null primary key,
	tenSP nvarchar(20),
	donGia float,
	soLuong int
)

create table NhanVien (
	maNV nchar(10) not null primary key,
	tenNV nvarchar(30) ,
	chucVu nvarchar(20),
	luongCoBan float,
	phuCap float
)

create table TaiKhoan (
	maNV nchar(10) not null primary key,
	username nvarchar(20) not null,
	pass nvarchar(30) not null,
	isAdmin bit not null default 0,
	constraint fk_MaNV foreign key (MaNV) references NhanVien(MaNV)
)

create table HoaDon (
	maHD nchar(10) not null primary key,
	maNV nchar(10) not null,
	soDT nchar(10) not null,
	tenKH nvarchar(40),
	ngayLap date,
	diaChi nvarchar(30)
	constraint fk_MaNV_1 foreign key (MaNV) references NhanVien(MaNV),
)

create table ChiTietHoaDon (
	maHD nchar(10) not null ,
	maSP nchar(10) not null ,
	soLuongBan int,
	constraint pk_MaHD_MaSP primary key (maHD, maSP),
	constraint fk_MaHD foreign key (maHD) references HoaDon(maHD),
	constraint fk_MaSP foreign key (maSP) references SanPham(maSP)
)

insert into NhanVien values ('NHANVIEN00', N'Yên Văn Thân', N'Quản Lý Tất Cả', 10000000, 1000000 )
insert into TaiKhoan values ('NHANVIEN00', 'yenthan2004', '123456',1)

select * from NhanVien
select * from TaiKhoan
select * from HoaDon
select * from ChiTietHoaDon
select * from SanPham



