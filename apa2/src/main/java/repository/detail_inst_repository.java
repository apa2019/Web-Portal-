package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.detail_inst;
@Repository
public interface detail_inst_repository extends JpaRepository <detail_inst,Integer> {
	List<detail_inst>  findByCat(int id);
	List<detail_inst>  findAll();
	
}
