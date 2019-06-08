package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.detail_inst;
import model.detail_rh;
import model.modif_cat_inst;
import repository.cat_inst_repository;
import repository.cat_rh_repository;
import repository.detail_inst_repository;
import repository.detail_rh_repository;
import repository.modif_cat_inst_repository;

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
	
	@Autowired
	modif_cat_inst_repository modif_cat_inst_repository;
	
	@GetMapping("/modif")
	public ModelAndView Modif(){
	  ModelAndView modelAndView = new ModelAndView();
	  modelAndView.addObject("cat_inst",cat_inst_repository.findAll());
	  modelAndView.addObject("cat_rh",cat_rh_repository.findAll());
	  modelAndView.setViewName("pages_annuaire/modif");
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
	   
	   @GetMapping("/formulaire")
		public ModelAndView Modif3(){
		  ModelAndView modelAndView = new ModelAndView();
		 // modelAndView.addObject("modif",);
		  modelAndView.setViewName("pages_annuaire/add_inst_form");
		  return modelAndView;
		}
	   
	   @PostMapping("/modif/inst")
	   
		public ModelAndView Modif2(@Valid modif_cat_inst modif, BindingResult Result){
			  ModelAndView modelAndView = new ModelAndView();
			  modif_cat_inst inst=new  modif_cat_inst();
			  inst.setDesignation(modif.getDesignation());
			  modif_cat_inst_repository.save(inst);
			  modelAndView.setViewName("pages_annuaire/modif");
			  return modelAndView;
			}
}
