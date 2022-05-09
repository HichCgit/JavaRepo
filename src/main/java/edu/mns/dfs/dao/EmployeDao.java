package edu.mns.dfs.dao;

import edu.mns.dfs.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeDao extends JpaRepository<Employe,Integer> {

    @Query("SELECT COUNT(U) FROM Employe U WHERE U.administrateur = 1")
    Integer FindAdmin();

}
