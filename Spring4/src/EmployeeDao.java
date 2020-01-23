import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;  
public class EmployeeDao {
	 
		//SimpleJdbcTemplate template;  
		  
		public EmployeeDao(SimpleJdbcTemplate template) {  
		        this.template = template;  
		}  
		public int update (Employee e){  
		String query="update employee set name=? where id=?";  
		return template.update(query,e.getName(),e.getId());  
		  
		
}
}
