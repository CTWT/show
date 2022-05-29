create table tbl_board(
    boardId Long auto_increment,
    title varchar (30) not null,
    content varchar (300) not null,
    name varchar (30) not null,
    read integer default 0,
    primary key (boardId)
);

insert into tbl_board(title, content, name) values ('title1', 'content1', 'name1');
insert into tbl_board(title, content, name) values ('title2', 'content2', 'name2');
insert into tbl_board(title, content, name) values ('title3', 'content3', 'name3');
insert into tbl_board(title, content, name) values ('title4', 'content4', 'name4');
insert into tbl_board(title, content, name) values ('title5', 'content5', 'name5');
insert into tbl_board(title, content, name) values ('title6', 'content6', 'name6');
insert into tbl_board(title, content, name) values ('title7', 'content7', 'name7');
insert into tbl_board(title, content, name) values ('title8', 'content8', 'name8');
insert into tbl_board(title, content, name) values ('title9', 'content9', 'name9');
insert into tbl_board(title, content, name) values ('title10', 'content10', 'name10');
