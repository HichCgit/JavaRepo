package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.AffichageCommande;
import edu.mns.dfs.view.AffichageUtilisateur;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employe extends Utilisateur{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean administrateur;

    @OneToMany(mappedBy = "gestionnaire")
    @JsonView(AffichageUtilisateur.class)
    private List<Article> listeArticleAgerer ;
}
