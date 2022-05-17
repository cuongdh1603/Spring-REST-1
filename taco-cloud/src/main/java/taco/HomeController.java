package taco;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat form = new SimpleDateFormat(pattern);
		String fdate = form.format(date);
		
		model.addAttribute("fdate",fdate);
		System.out.println(fdate);
		return "home";
	}
}
