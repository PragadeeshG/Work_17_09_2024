create table if not exists mongo_atlas_event_grid(
atlas_schema_code Integer not null,
event_id Integer null,
sequence_id Integer null,
event_name varchar(255) null,
role_id varchar(255) null,
run_indicator Integer null,
event_type varchar(255) null,
approximate_event_duration varchar(255) null,
event_status varchar(255) null,
reduce_atchitectural_complexity varchar(255) null,
scale_operations varchar(255) null,
is_scheduled varchar(255) null,
entity_state varchar(255) null,
constraint mongo_atlas_event_grid_pk primary key(atlas_schema_code));