package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.cat_rh;
@Repository
public interface cat_rh_repository extends JpaRepository <cat_rh,Integer>{
     
}
