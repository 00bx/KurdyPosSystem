create database ifraz_market;
use ifraz_market;



create table catagories(
id int primary key auto_increment,
naw varchar(200),
chi_tedaya varchar(300)



) ;
create table product(
id int primary key auto_increment,
naw varchar(300),
bry_kala varchar(300),
nrx varchar(300),
jor int,

foreign key(jor) references catagories(id) 



);