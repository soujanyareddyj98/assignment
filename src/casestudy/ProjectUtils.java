package casestudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ProjectUtils 
{
	public  Map<Project,Employee> loadProjects() throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Map<Project, Employee> map=new LinkedHashMap<Project,Employee>();
		map.put(new Project(15,"AWS",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(822,"ram",22000.00,"ram@gmail.com"));
		map.put(new Project(17,"Java",sdf.parse("16-04-2020"),sdf.parse("22-04-2020")),new Employee(455,"sree",23000.00,"sree@gmail.com"));
		map.put(new Project(13,"CMD",sdf.parse("16-04-2020"),sdf.parse("23-04-2020")),new Employee(677,"sam",30000.00,"sam@gmail.com"));
		map.put(new Project(19,"IOT",sdf.parse("16-04-2020"),sdf.parse("23-04-2020")),new Employee(778,"rishi",42000.00,"rishi@gmail.com"));
		map.put(new Project(11,"DotNet",sdf.parse("16-04-2020"),sdf.parse("23-04-2020")),new Employee(919,"mounika",52000.00,"mouni@gmail.com"));
		map.put(new Project(12,"Testing",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(233,"jessica",52000.00,"jessica@gmail.com"));
		map.put(new Project(21,"Developer",sdf.parse("16-04-2020"),sdf.parse("23-04-2020")),new Employee(566,"deepthi",52000.00,"deepthi@gmail.com"));
		map.put(new Project(50,"Python",sdf.parse("16-04-2020"),sdf.parse("24-04-2020")),new Employee(756,"shravya",52000.00,"shraya@gmail.com"));
		map.put(new Project(23,"DataWarehousing",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(986,"krishna",52000.00,"krishna@gmail.com"));
		map.put(new Project(24,"INT",sdf.parse("16-04-2020"),sdf.parse("27-04-2020")),new Employee(899,"ashwini",52000.00,"ashwini@gmail.com"));
		return map;
	}

public void displayByProjectID(Map<Project,Employee> map)
{
	TreeMap<Project, Employee> tmap=new TreeMap<Project,Employee>(map);
	tmap.entrySet().stream().forEach(t->System.out.println(t));
}
	
public void displayByProjectDomain(Map<Project,Employee> map)
{

	Set<Map.Entry<Project, Employee>> entryset=map.entrySet();
	Comparator<Map.Entry<Project, Employee>> projectcmp=new Comparator<Map.Entry<Project,Employee>>() {
		
		@Override
		public int compare(Entry<Project, Employee> o1, Entry<Project, Employee> o2) 
		{
			
			return o1.getKey().getDomain().compareTo(o2.getKey().getDomain());
		}
	};
	entryset.stream().sorted(projectcmp).forEach(t->System.out.println(t));;
	//TreeMap<Project, Employee> tdmap=new TreeMap<Project,Employee>(map);
	//tdmap.entrySet().stream().forEach(t->System.out.println(t));
}
}
