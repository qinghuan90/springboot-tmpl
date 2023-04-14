create table tmpl.ability_info
(
    id           int auto_increment
        primary key,
    module_code  varchar(255) null,
    ability_name varchar(255) null comment '功能名称',
    ability_code varchar(255) null comment '功能编码',
    remark       varchar(255) null comment '描述',
    is_delete    tinyint      null,
    weight       bigint       not null comment '权值',
    create_time  datetime     not null,
    update_time  datetime     null
)
    comment '功能归属组';

create table tmpl.grant_authority_info
(
    id           int auto_increment
        primary key,
    system_code  varchar(255) null,
    service_code varchar(255) null,
    module_code  varchar(255) null,
    role_code    varchar(255) not null,
    auth_value   varchar(255) null comment '权限累加值',
    is_delete    tinyint      null comment '是否删除',
    update_time  datetime     null,
    create_time  datetime     null
);

create table tmpl.module_info
(
    id           int auto_increment
        primary key,
    system_code  varchar(255) null,
    service_code varchar(255) null,
    module_code  varchar(255) null,
    module_name  varchar(255) null,
    module_url   varchar(255) null,
    module_icon  varchar(255) null,
    is_delete    tinyint      null,
    update_time  datetime     null,
    create_time  datetime     null
)
    comment '模块信息';

create table tmpl.rule_info
(
    id          int auto_increment
        primary key,
    system_code varchar(255) null comment '系统编码',
    role_code   varchar(255) not null comment '角色编码',
    role_name   varchar(255) not null comment '角色名称',
    remark      varchar(255) null,
    is_delete   tinyint      null,
    update_time datetime     null,
    create_time datetime     not null
)
    comment '角色信息';

create table tmpl.service_info
(
    id           int auto_increment
        primary key,
    system_code  varchar(255) null,
    service_code varchar(255) null,
    service_name varchar(255) null,
    remark       varchar(255) null,
    is_delete    tinyint      null,
    update_time  datetime     null,
    create_time  datetime     null
)
    comment 'App服务信息';

create table tmpl.system_info
(
    id           int auto_increment
        primary key,
    system_code  varchar(255) not null comment '系统编码',
    sysmte_name  varchar(255) null comment '系统展示名',
    profile      varchar(255) null comment '简介',
    param_system varchar(255) null comment '父级系统编码',
    is_delete    tinyint      null,
    update_time  datetime     null,
    create_time  datetime     not null
);

create table tmpl.user_info
(
    id            int auto_increment
        primary key,
    system_code   varchar(255) null comment '所属系统',
    nick_name     varchar(255) null comment '展示名称',
    code          varchar(255) not null comment '名称编码',
    password      varchar(255) null comment '密码',
    title         varchar(255) null comment '职称',
    tell          varchar(255) null comment '手机号',
    email         varchar(255) null comment '邮箱',
    profile       text         not null comment '个人介绍',
    profile_photo varchar(500) null comment '头像',
    is_delete     tinyint      null,
    update_time   datetime     null,
    create_time   datetime     not null,
    constraint NAME_IDX
        unique (code)
);

create table tmpl.user_role_ref
(
    id          int auto_increment
        primary key,
    system_code varchar(255) null,
    role_code   varchar(255) null,
    user_code   varchar(255) null,
    is_delete   int          null,
    create_time datetime     null,
    create_user varchar(255) null,
    update_time datetime     null,
    update_user varchar(255) null
);