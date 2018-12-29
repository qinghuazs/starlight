drop table if exists user;
create table user(
  id bigint primary key ,
  username varchar(64)  comment '用户名',
  password varchar(255) comment '密码',
  realname varchar(64) comment '真实姓名',
  user_code varchar(255) comment '用户编号',
  seat_phone varchar(20) comment '座机号',
  telephone varchar(20) comment '手机',
  sm_phone varchar(10) comment '短号',
  inner_email varchar(64) comment '内网邮箱',
  outter_email varchar(64) comment '外网邮箱',
  email varchar(64) comment '私人邮箱'
);

