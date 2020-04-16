package casestudy;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Set;
	import java.util.TreeMap;

	
	public class Main {

		public static void main(String[] args) throws ParseException
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			ProjectUtils p=new ProjectUtils();
	Map<Project, Employee> map=p.loadProjects();
	System.out.println("Display by Id");
	p.displayByProjectID(map);
	System.out.println("Display by Domain");
	p.displayByProjectDomain(map);

		}

	}
