 insert into country (countries) values ('India');
 insert into country (countries) values('USA');
 
 insert into state (state_name,country_id) values('Kerala',1);
 insert into state (state_name,country_id) values('California',2);
 
 insert into city (city_name,state_id) values('Kottayam',1);
 insert into city (city_name,state_id) values('Los Angeles',2);
 
 insert into pincode (pin,city_id) values(686001,1);
 insert into pincode (pin,city_id) values(685000,2);
 