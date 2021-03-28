package test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import examples.dao.EmployeeDao;
import examples.entity.Employee;
import examples.service.EmployeeService;

public class ClientDao {
	public static void main(String args[]) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) factory.getBean("employeeDao");
		List<String> ls = employeeDao.getAllStr();
		List<Date> lsdates = employeeDao.getAllDateStr();
		List<Map<String, Object>> lsmap = employeeDao.getAll(null);
		System.out.println(ls.toString());
		System.out.println(lsdates.toString());
		System.out.println(lsmap.toString());
//		Employee employee = new Employee();
//		String id = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
//		employee.setId(id);
//		employee.setEmpno("A001");
//		employee.setSalary(new BigDecimal(5000));
//		employee.setBirthday(new Date());
//		employee.setName("scott");
//		employee.setAge(25);
//		//调用minidao方法
//		employeeDao.insert(employee);
		
		
//		//自定义分页方法（官方分页因为通用机制，有性能牺牲，数据量大建议自定义分页）
//		EmployeeService employeeService = (EmployeeService) factory.getBean("employeeService");
//		MiniDaoPage<Employee> page = employeeService.getPageAll(null, 2, 5);
//		for(Employee e:page.getResults()){
//			System.out.println(e.getId() + "  " +e.getEmpno());
//		}
	}
}
