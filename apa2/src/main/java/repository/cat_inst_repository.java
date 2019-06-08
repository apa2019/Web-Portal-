package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.cat_inst;
@Repository
public interface cat_inst_repository extends JpaRepository<cat_inst,Integer> {

}
