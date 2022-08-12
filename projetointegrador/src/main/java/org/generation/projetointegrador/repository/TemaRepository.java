package org.generation.projetointegrador.repository;

import java.util.List;

import org.generation.projetointegrador.model.TemaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface TemaRepository extends JpaRepository<TemaModel, Long> {

	public List<TemaModel> findAllByDescricaoContainingIgnoreCase(@Param ("descrição") String descricao);
=======
public interface TemaRepository  extends JpaRepository<TemaModel, Long> {

	public List<TemaModel> findAllByDescricaoContainingIgnoreCase (@Param ("descrição") String descricao);

>>>>>>> d5622626cc3a5698bc01fe1ae3983e0725807c90
}
