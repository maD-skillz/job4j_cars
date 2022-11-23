create table if not exists auto_user (
    id serial primary key,
    login text not null,
    password text not null
);

create table if not exists auto_post (
    id serial primary key,
    text text not null,
    created timestamp not null,
    auto_user_id int not null references auto_user(id)
);