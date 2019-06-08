package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	@GetMapping("/f")
	
	public String home() {
		return "pages_annuaire/add_inst_form";
	}

}
