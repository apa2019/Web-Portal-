package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.detail_rh;
@Repository
public interface detail_rh_repository extends JpaRepository <detail_rh,Integer>  {
	List<detail_rh>  findByCat(int id);
	List<detail_rh>  findAll();
	
}
