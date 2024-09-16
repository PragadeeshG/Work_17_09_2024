create table if not exists mongo_atlas_database(
atlas_schema_code Integer not null,
master_schema_effcetive Integer null,
master_schema_effcetive_date varchar(255) null,
master_schema_size varchar(255) null,
master_schema_db_stat varchar(255) null,
serverless_indicator Integer null,
elastic varchar(255) null,
always_on_security varchar(255) null,
performance_advice varchar(255) null,
native_tooling varchar(255) null,
automated_data_tiring varchar(255) null,
constraint mongo_atlas_database_pk primary key(atlas_schema_code));