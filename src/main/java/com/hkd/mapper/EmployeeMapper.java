package com.hkd.mapper;

import com.hkd.entity.Employee;

/**
 * @Author: 张世罡
 * @Date： 2019/7/29
 * @Description: com.hkd.mapper
 * @version: 1.0
 */
public interface EmployeeMapper {
    Employee getEmpById(Integer id);

    Employee getEmpById2(Integer id);

    Employee getEmpById3(Integer id);
}
