package cn.itsource.fastgo.mapper;

import cn.itsource.fastgo.domain.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className EmployeeMapper
 * @description TODO
 * @date 2019/5/15  22:37
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
