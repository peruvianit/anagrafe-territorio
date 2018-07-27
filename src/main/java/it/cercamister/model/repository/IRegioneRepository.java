package it.cercamister.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.cercamister.model.entity.RegioneEntity;

@Repository
public interface IRegioneRepository extends JpaRepository<RegioneEntity, Long>  {
}
