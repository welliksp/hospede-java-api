drop database hoteldb;
drop user hotel_user_db;
create user hotel_user_db with password 'hotel_user_db';
create database hoteldb with template=template0 owner=hotel_user_db;
\connect hoteldb;
alter default privileges grant all on tables to hotel_user_db;
alter default privileges grant all on sequences to hotel_user_db;

create table tb_hotel_guest(
hotel_guest_id integer primary key not null,
hotel_guest_name varchar(50) not null,
hotel_document varchar(20) not null,
hotel_phone varchar(30) not null
);

create table tb_hotel_check(
hotel_check_id integer primary key not null,
hotel_check_guest_id integer not null,
data_start varchar(30),
data_end varchar(30)
);
alter table tb_hotel_check add constraint cat_users_fk
foreign key (hotel_check_guest_id) references tb_hotel_guest(hotel_guest_id);

create sequence tb_hotel_guest_seq increment 1 start 1;
create sequence tb_hotel_check_seq increment 1 start 1;