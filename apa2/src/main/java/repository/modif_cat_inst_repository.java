package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.modif_cat_inst;

@Repository
public interface modif_cat_inst_repository  extends JpaRepository <modif_cat_inst,Integer> {

}
