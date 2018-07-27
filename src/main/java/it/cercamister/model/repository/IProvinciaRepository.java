package it.cercamister.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.cercamister.model.entity.ProvinciaEntity;

@Repository
public interface IProvinciaRepository extends JpaRepository<ProvinciaEntity, Long>  {
	
	public List<ProvinciaEntity> findByCodRegOrderByDesPrv(@Param("codReg") String codiceRegione);
}