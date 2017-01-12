create database simpleAppDB;

create table Customer(
	customerId bigint auto_increment,
    fName varchar(50) not null,
    lName varchar(50) not null,
    PRIMARY KEY (customerId)
);

insert into Customer(fName,lName)values('Mike','Marcel');
insert into Customer(fName,lName)values('Scott','Satine');
insert into Customer(fName,lName)values('Andrew','McDonald');
insert into Customer(fName,lName)values('Alby','Morkel');
insert into Customer(fName,lName)values('Scott','Styris');

select * from Customer;
