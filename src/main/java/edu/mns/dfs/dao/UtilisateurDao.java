package edu.mns.dfs.dao;

import edu.mns.dfs.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurDao  extends JpaRepository<Utilisateur,Integer> {

    @Query("SELECT U.id, COUNT(*) FROM Utilisateur U GROUP BY U.id")
    Integer NbrUtilisateur();



}
