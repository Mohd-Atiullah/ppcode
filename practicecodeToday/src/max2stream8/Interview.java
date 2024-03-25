package max2stream8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {
public static void main(String[] args) {
	List<Employee> emplist=new ArrayList<>();
	createddata(emplist);
Map<String, List<Employee>>	 empMap=emplist.stream().collect(Collectors.groupingBy(Employee::getCity));
empMap.forEach((key,value)->{
	System.out.println("city: "+key+ " Employee" +value);
});
}

private static List<Employee> createddata(List<Employee> emplist) {
	Employee emp=new Employee();
	emp.setName("Laxman");
	emp.setCity("Banglor");
	emp.setId("1");
	Employee emp2=new Employee();
	emp2.setName("Kalyan");
	emp2.setCity("Puna");
	emp2.setId("2");
	
	Employee emp3=new Employee();
	emp3.setName("Rahul");
	emp3.setCity("Noida");
	emp3.setId("3");
	
	Employee emp4=new Employee();
	emp4.setName("Amit");
	emp4.setCity("Delhi");
	emp4.setId("4");
	emplist.add(emp);
	emplist.add(emp2);
	emplist.add(emp3);
	emplist.add(emp4);
	return emplist;
}
}
