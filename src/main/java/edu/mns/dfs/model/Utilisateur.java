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

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    public Utilisateur(){

    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonView(AffichageUtilisateur.class)
    private Integer id;

    @JsonView({AffichageUtilisateur.class, AffichageCommande.class})
    private String login;

    @JsonView(AffichageUtilisateur.class)
    private String password;

    @OneToMany(mappedBy = "client")
    private List<Commande> listeCommande ;

    @ManyToMany
    private List<MoyenPaiment> listeMoyenPaiement ;

}
