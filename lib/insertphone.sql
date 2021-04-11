USE phone;#使用数据库

drop table if exists t_phone;

create table t_phone(
    `id`int primary key auto_increment,
    `name`varchar(10) not null ,
    `desiger`varchar(10) not null,
    `price`varchar(10) not null ,
    `sales` int(11) not null ,
    `stock` int(11) not null ,#库存
    `img_path` varchar(200) not null

);

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机1','雷军','1999',0,0,'static/img/小米手机1.png');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机1s','雷军','1999',0,0,'static/img/小米手机1s.png');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机1青春版','雷军','1999',0,0,'static/img/小米手机1青春版.png');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机2','雷军','1999',100,1000,'static/img/小米手机2.png');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机2s','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机2a','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米手机3','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米4','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米4c','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米4i','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米5','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米5sPlus','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米5c','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米6','雷军','2499',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米8','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米8se','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米8青春版','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米8屏幕指纹版','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米8探索版','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米9','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米9se','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米9pro','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米10','雷军','3999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米10pro','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米10青春版','雷军','1999',100,1000,'static/img/default.jpg');
insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米10u','雷军','1999',100,1000,'static/img/default.jpg');

insert into t_phone(`name`,`desiger`,`price`,`sales`,`stock`,`img_path`)
values ('小米11','雷军','1999',100,1000,'static/img/default.jpg');





















