
create database hoteldb with template=template0 owner=hotel_user_db;
\connect hoteldb;
alter default privileges grant all on tables to hotel_user_db;
alter default privileges grant all on sequences to hotel_user_db;

create table tb_hotel_guest (
hotel_guest_id integer primary key not null,
hotel_guest_name varchar(50) not null,
hotel_document varchar(20) not null,
hotel_phone varchar(20)
);
create table tb_hotel_check_in(
hotel_check_in_id integer primary key,
hotel_check_in_phone float,
hotel_check_in_aditional boolean,
hotel_check_in_data_start timestamp,
hotel_check_in_data_end timestamp
);

create sequence tb_hotel_guest_seq increment 1 start 1;
create sequence tb_hotel_check_in_seq increment 1 start 1;
