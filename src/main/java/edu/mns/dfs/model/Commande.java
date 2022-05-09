package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.AffichageCommande;
import edu.mns.dfs.view.AffichageUtilisateur;
import edu.mns.dfs.view.AffichageligneCommande;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichageCommande.class)
    private Integer id;

    @JsonView(AffichageCommande.class)
    private Date datePaiement;

    @ManyToOne
    @JsonView({AffichageCommande.class,AffichageUtilisateur.class})
    private Utilisateur client;

    @OneToMany(mappedBy = "commande")
    @JsonView({AffichageCommande.class , AffichageligneCommande.class})
    private List<LigneCommande> listeLigneCommande ;
}
