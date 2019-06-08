package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cat_rh", schema="annuaire")
public class cat_rh {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id_cat_rh;
	
    @Column(name="designation")
   private String designation;
    
    @Column(name="description")
   private String description;

	public int getId_cat_rh() {
		return id_cat_rh;
	}

	public void setId_cat_rh(int id_cat_rh) {
		this.id_cat_rh = id_cat_rh;
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
