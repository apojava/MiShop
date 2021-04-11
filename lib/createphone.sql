DROP DATABASE IF EXISTS phone;#如果phone数据库存在，先删除

CREATE DATABASE phone;#创建phone数据库

USE phone;#使用数据库

CREATE TABLE t_user(
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `username` VARCHAR(20) NOT NULL UNIQUE,
    `password` VARCHAR(32) NOT NULL,
    `email` VARCHAR(200),
    `type` INT(10)
);

INSERT INTO t_user(`username`,`password`,`email`,`type`)
VALUES('shystart','123456','shystart@126.com','0');

INSERT INTO t_user(`username`,`password`,`email`,`type`)
VALUES('lqlstart','123456','lqlstart@126.com','0');

INSERT INTO t_user(`username`,`password`,`email`,`type`)
VALUES('admin','admin','admin@126.com','0');#插入用户

SELECT *
from t_user;#查询用户
