package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.AffichageUtilisateur;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@Setter
public class MoyenPaiment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichageUtilisateur.class)
    private Integer id;
    @JsonView(AffichageUtilisateur.class)
    private String nom ;


}
