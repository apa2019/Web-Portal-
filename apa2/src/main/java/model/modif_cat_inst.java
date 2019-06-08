package model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="modif_cat_inst", schema="annuaire")
public class modif_cat_inst {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id_modif_cat_inst;
	
    @Column(name="designation")
   private String designation;
    
    @Column(name="description")
   private String description;
  
    @Column(name="type_modif")
    private int type_modif;
    
    @Column(name="valide")
    private int valide;
    
    @Column(name="date_modif")
    private Date date_modif;
    
    @Column(name="cat")
	 private int cat;
    
    @Column(name="user")
	 private int user;

	public int getId_modif_cat_inst() {
		return id_modif_cat_inst;
	}

	public void setId_modif_cat_inst(int id_modif_cat_inst) {
		this.id_modif_cat_inst = id_modif_cat_inst;
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

	public int getType_modif() {
		return type_modif;
	}

	public void setType_modif(int type_modif) {
		this.type_modif = type_modif;
	}

	public int getValide() {
		return valide;
	}

	public void setValide(int valide) {
		this.valide = valide;
	}

	public Date getDate_modif() {
		return date_modif;
	}

	public void setDate_modif(Date date_modif) {
		this.date_modif = date_modif;
	}

	public int getCat() {
		return cat;
	}

	public void setCat(int cat) {
		this.cat = cat;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}
    
    

}
