
package com.pidev.Entite;

import java.sql.Blob;
import javafx.scene.image.Image;


public class Annonce {
    private int idAnnonce;
    private User user;
    private String Nom;
    private String Description ;
    private int Prix;
    private String Etat;
    private String images;

    public Annonce(int idAnnonce, User user, String Nom, String Description, int Prix, String Etat, String images) {
        this.idAnnonce = idAnnonce;
        this.user = user;
        this.Nom = Nom;
        this.Description = Description;
        this.Prix = Prix;
        this.Etat = Etat;
        this.images = images;
    }

    public Annonce(User user, String Nom, String Description, int Prix, String Etat, String images) {
        this.user = user;
        this.Nom = Nom;
        this.Description = Description;
        this.Prix = Prix;
        this.Etat = Etat;
        this.images = images;
    }

    public Annonce(int idAnnonce, User user, String Nom, String Description, int Prix, String Etat) {
        this.idAnnonce = idAnnonce;
        this.user = user;
        this.Nom = Nom;
        this.Description = Description;
        this.Prix = Prix;
        this.Etat = Etat;
    }

    public Annonce(User user, String Nom, String Description, int Prix, String Etat) {
        this.user = user;
        this.Nom = Nom;
        this.Description = Description;
        this.Prix = Prix;
        this.Etat = Etat;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public User getUser() {
        return user;
    }

    public String getNom() {
        return Nom;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrix() {
        return Prix;
    }

    public String getEtat() {
        return Etat;
    }

    public String getImages() {
        return images;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Annonce{" + "idAnnonce=" + idAnnonce + ", user=" + user + ", Nom=" + Nom + ", Description=" + Description + ", Prix=" + Prix + ", Etat=" + Etat + ", images=" + images + '}';
    }
    

  }
