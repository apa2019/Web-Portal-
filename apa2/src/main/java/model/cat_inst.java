package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="cat_inst", schema="annuaire")
public class cat_inst {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id_cat_inst;
	
    @Column(name="designation")
   private String designation;
    
    @Column(name="description")
   private String description;

    

	public int getId_cat_inst() {
		return id_cat_inst;
	}

	public void setId_cat_inst(int id_cat_inst) {
		this.id_cat_inst = id_cat_inst;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
   
   

 
}
