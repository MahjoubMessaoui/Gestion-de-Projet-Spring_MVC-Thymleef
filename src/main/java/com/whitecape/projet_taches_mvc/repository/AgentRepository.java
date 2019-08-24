package com.whitecape.projet_taches_mvc.repository;

import com.whitecape.projet_taches_mvc.entites.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {
}
