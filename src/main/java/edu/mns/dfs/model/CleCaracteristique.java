package edu.mns.dfs.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CleCaracteristique implements Serializable {

    @Column(name="article_id")
    Integer articleID;

    @Column(name="propriete_id")
    Integer proprieteID;
}
