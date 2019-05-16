package cn.itsource.fastgo.service;

import cn.itsource.fastgo.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className IEmployeeService
 * @description TODO
 * @date 2019/5/15  22:38
 */
public interface IEmployeeService extends IService<Employee> {

    Employee login(String username, String password);
}
