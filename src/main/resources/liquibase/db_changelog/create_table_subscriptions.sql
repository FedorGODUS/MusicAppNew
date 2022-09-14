create table subscriptions
(
    id          bigserial primary key,
    name        varchar not null,
    price       integer not null,
    description varchar not null
);