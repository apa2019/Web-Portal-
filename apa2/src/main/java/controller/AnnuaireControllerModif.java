package controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import model.cat_inst;
import model.cat_rh;
import model.detail_inst;
import model.detail_rh;
import repository.cat_inst_repository;
import repository.cat_rh_repository;
import repository.detail_inst_repository;
import repository.detail_rh_repository;

@RestController
public class AnnuaireControllerModif {

	@Autowired
	cat_rh_repository cat_rh_repository;
	@Autowired
	cat_inst_repository cat_inst_repository;
	
	@Autowired
	detail_inst_repository detail_inst_repository;
	@Autowired
	detail_rh_repository detail_rh_repository;
	
	
	public ModelAndView modifView()
	{
		  ModelAndView modelAndView = new ModelAndView();
		  modelAndView.addObject("cat_inst",cat_inst_repository.findAll());
		  modelAndView.addObject("cat_rh",cat_rh_repository.findAll());
		  modelAndView.setViewName("pages_annuaire/modif");
		  return modelAndView;
	}
	
	
	  @GetMapping("/modif")
	  public ModelAndView Modif(){
	  ModelAndView modelAndView = modifView();
	  return modelAndView;
	  }
	  
	  @GetMapping("modif/inst/{id}")
	   public List<detail_inst> getRessource1(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   return detail_inst_repository.findByCat(D);
	   }
	   
	   @GetMapping("modif/rh/{id}")
	   public List<detail_rh> getRessource2(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   return detail_rh_repository.findByCat(D);
	   }
	   
	   @GetMapping("delete_inst/{id}")
	   public void  deleteRessource1(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   cat_inst_repository.delete(D);
	   }
	   
	   @GetMapping("delete_rh/{id}")
	   public void  deleteRessource2(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   cat_rh_repository.delete(D);
	   }
	   
	   
	   
	   @GetMapping("/cat_inst_form")
		public ModelAndView Modif3(){
		  ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("cat",new cat_inst());
		  modelAndView.setViewName("pages_annuaire/add_inst_form");
		  return modelAndView;
		}
	   
	   @GetMapping("/cat_rh_form")
		public ModelAndView Modif4(){
		  ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("cat",new cat_rh());
		  modelAndView.setViewName("pages_annuaire/add_rh_form");
		  return modelAndView;
		}
	   
	  
	   @PostMapping("/modif/inst")
		public ModelAndView Modif2(@ModelAttribute(name="cat") cat_inst cat, Model model) {
		   cat_inst_repository.save(cat);
		   ModelAndView modelAndView = modifView();
		   return modelAndView;
			}
	  
	   @PostMapping("/modif/rh")
		public ModelAndView Modif5(@ModelAttribute(name="cat") cat_rh cat, Model model) {
		
		   cat_rh_repository.save(cat);
		   ModelAndView modelAndView = modifView();
		   return modelAndView;
		    
			}
	   
	   @GetMapping("modif/{id}/cat_inst")
	   public ModelAndView modifCatInst(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   ModelAndView modelAndView = new ModelAndView();
		   modelAndView.addObject("cat",cat_inst_repository.findOne(D));
		   modelAndView.setViewName("pages_annuaire/add_inst_form");
		   return modelAndView;
	   }
	   
	   @GetMapping("modif/{id}/cat_rh")
	   public ModelAndView modifCatRH(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   ModelAndView modelAndView = new ModelAndView();
		   modelAndView.addObject("cat",cat_rh_repository.findOne(D));
		   modelAndView.setViewName("pages_annuaire/add_rh_form");
		   return modelAndView;
	   }
	   
	   @GetMapping("delete_detail/inst/{id}")
	   public void  deleteDetailInst(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   cat_rh_repository.delete(D);
	   }
}

