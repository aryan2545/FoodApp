create table users(id  Serial primary key,username varchar(50),password varchar(50));
create table menu(id Serial primary key,name varchar(50),price int);
create table orders(id  Serial primary key,user_id int ,foreign key(user_id)  references users(id),food_id int ,foreign key (food_id)references menu(id));
insert into menu(name,price) values('Burger',99),('pizza',49),('sandwich',150),('pastry',50);
select * from menu;

