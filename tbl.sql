//做连接查询,只保留左边的全部数据,及右边相关联的数据
select e.id,e.last_name,e.gender,e.email,d.dept_name from tbl_employee e left join tbl_department d on e.dept_id=d.id and e.id=1;

select e.id,e.last_name,e.gender,e.email,d.dept_name from tbl_employee e,tbl_department d where e.dept_id=d.id and e.id=1;

select * from tbl_department;

select * from tbl_employee;

alter table tbl_deparment rename tbl_department;