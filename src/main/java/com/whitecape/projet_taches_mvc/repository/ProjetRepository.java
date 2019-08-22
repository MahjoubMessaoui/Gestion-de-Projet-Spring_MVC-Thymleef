package com.whitecape.projet_taches_mvc.repository;

import com.whitecape.projet_taches_mvc.entites.Projet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {

    @Query("Select p from Projet p where p.desig like:x")


    Page<Projet> chercher(@Param("x") String mc, Pageable pageable);

}
