DROP table IF EXISTS employee;

create table employee(
    id int auto_increment,
    name varchar(250),
    job varchar(30),
    salary Double,
    date date
);

insert into employee (name, job, salary, date)values('Jose','BackendDev', 1600.0, NOW());
insert into employee (name, job, salary, date)values('Juan','FrontendDev', 1800.0, NOW());
insert into employee (name, job, salary, date)values('Pedro','FullstackDev', 2000.0, NOW());