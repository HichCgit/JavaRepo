package edu.mns.dfs.controller;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.dao.ArticleDao;
import edu.mns.dfs.model.Article;
import edu.mns.dfs.view.AffichageCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ArticleController {

    ArticleDao articleDao;

    @Autowired
    public ArticleController (ArticleDao articleDao){
        this.articleDao = articleDao;
    }

    @PostMapping("/article")
    @JsonView(AffichageCommande.class)
    public String ajouterArticle(@RequestBody Article article){

        articleDao.save(article);

        return "article ajouter";
    }
}
