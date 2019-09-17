package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import repository.cat_inst_repository;
import repository.cat_rh_repository;
import repository.detail_inst_repository;
import repository.detail_rh_repository;
import model.cat_inst;
import model.cat_rh;
import model.detail_inst;
import model.detail_rh;



@RestController
public class AnnuaireController {
	
	@Autowired
	cat_rh_repository cat_rh_repository;
	@Autowired
	cat_inst_repository cat_inst_repository;
	
	@Autowired
	detail_inst_repository detail_inst_repository;
	@Autowired
	detail_rh_repository detail_rh_repository;

	
	
	public ModelAndView View(List<cat_inst> l1,List<cat_rh> l2,String type, int id) {
		  ModelAndView modelAndView = new ModelAndView();
		  modelAndView.addObject("cat_inst",l1);
		  modelAndView.addObject("cat_rh",l2);
	      modelAndView.addObject("ID",id);
	      modelAndView.addObject("type",type);
		  modelAndView.setViewName("pages_annuaire/index");
		  return modelAndView;
	}
	
	@GetMapping("/")
    public ModelAndView Annuaire(){ 
       ModelAndView view= View(cat_inst_repository.findAll(),cat_rh_repository.findAll(),"inst",0);
       view.addObject("cat",cat_inst_repository.findOne(1));
       view.addObject("detail",detail_inst_repository.findByCat(1));
       return view;
    }
	
	
	   @GetMapping("/detail/{id}/inst")
	   public ModelAndView Annuaire2(@PathVariable String id){
		   int Id = Integer.parseInt(id);
		   ModelAndView view= View(cat_inst_repository.findAll(),cat_rh_repository.findAll(),"inst",Id-1);
	       view.addObject("cat",cat_inst_repository.findOne(Id));
	       view.addObject("detail",detail_inst_repository.findByCat(Id));
	       return view;
		   
	    }
	   
	   @GetMapping("/detail/{id}/rh")
	   public ModelAndView Annuaire3(@PathVariable String id){
		  int Id = Integer.parseInt(id);
		   ModelAndView view= View(cat_inst_repository.findAll(),cat_rh_repository.findAll(),"rh",Id-1);
	       view.addObject("cat",cat_rh_repository.findOne(Id));
	       view.addObject("detail",detail_rh_repository.findByCat(Id));
	       return view;
	    }
	    
	   
	   @GetMapping("/inst/{id}")
	   public detail_inst getRessource1(@PathVariable String id )
	   {
		   int D = Integer.parseInt(id);
		   return detail_inst_repository.findOne(D);
	   }
	   
	   @GetMapping("/rh/{id}")
	   public detail_rh getRessource2(@PathVariable String id)
	   {
		   int D = Integer.parseInt(id);
		   return detail_rh_repository.findOne(D);
	   }
}
