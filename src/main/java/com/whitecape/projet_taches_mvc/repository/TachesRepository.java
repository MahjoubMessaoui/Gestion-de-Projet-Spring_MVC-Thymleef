package com.whitecape.projet_taches_mvc.repository;


import com.whitecape.projet_taches_mvc.entites.Taches;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface TachesRepository extends JpaRepository<Taches,Long> {


    @Query("Select p from Taches p where p.nom like:x")


    Page<Taches> chercher(@Param("x") String mc, Pageable pageable);

}
