package it.peruvianit.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.peruvianit.model.entity.ComuneEntity;

@Repository
public interface IComuneRepository extends JpaRepository<ComuneEntity, Long>  {
	public List<ComuneEntity> findByCodPrvOrderByDesCom(@Param("codPrv") String codiceProvincia);
}
