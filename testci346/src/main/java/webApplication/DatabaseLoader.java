package webApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//Database is hardcoded into the java program tried connecting a mysql database but had troble
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;
	

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
		
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new EmployeeModel("1", "Employee", "one", null, null));
		this.repository.save(new EmployeeModel("2", "Worker", "two", null, null));
		this.repository.save(new EmployeeModel("3", "Man", "three", null, null));
		
	}
}