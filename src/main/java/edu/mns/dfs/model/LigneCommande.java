package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.AffichageCommande;
import edu.mns.dfs.view.AffichageUtilisateur;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichageUtilisateur.class)
    private Integer id;

    @JsonView(AffichageCommande.class)
    private Integer quantite;

    @ManyToOne
    @JsonView(AffichageCommande.class)
    private Article article;

    @ManyToOne
    private Commande commande;
}
