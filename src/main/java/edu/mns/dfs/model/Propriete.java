package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.AffichagePropriete;
import edu.mns.dfs.view.AffichageUtilisateur;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@EntityListeners(EntityListeners.class)
@Getter
@Setter
public class Propriete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichagePropriete.class)

    private Integer id;

    @JsonView(AffichagePropriete.class)
    private String nom ;

}
