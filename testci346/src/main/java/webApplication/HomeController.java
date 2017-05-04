package webApplication;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	@RequestMapping(value = "/Index")
	public String index() {
		return "index";
	}
	  
	
	@RequestMapping(value = "/Login")
	public String Login() {
		return "index";
	}
}