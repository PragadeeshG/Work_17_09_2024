create table if not exists mongo_atlas_app_service(
atlas_schema_code Integer not null,
data_dictionary Integer null,
number_of_instances Integer null,
metadata varchar(255) null,
query_plan Integer null,
optimizable char null,
performance_tunable char null,
service_name varchar(255) null,
service_code varchar(255) null,
data_engine varchar(255) null,
underlying_machine varchar(255) null,
continuous_backups varchar(255) null,
workload_isolation varchar(255) null,
multi_region_multi_cloud_support varchar(255) null,
constraint mongo_atlas_app_service_pk primary key(atlas_schema_code));