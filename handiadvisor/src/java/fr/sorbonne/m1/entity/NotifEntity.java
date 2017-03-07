/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.sorbonne.m1.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Thibault Le Grand Emilie Pisu
 */
@Table(name="NOTIF")
@Entity
public class NotifEntity implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="titre")
    private String titre;
    @Column(name="commentaire")
    private String commentaire;
    @Column(name="dateCreation")
    private Date dateCreation;
    @Column(name="statut")
    private String statut;
    
    @Column(name="createurNotif")
    @OneToOne(cascade = CascadeType.ALL)
    private PersonneEntity createurNotif;
    
    @Column(name = "createurNotif")
    @OneToOne(cascade = CascadeType.ALL)
    private LieuEntity lieuConcerne;
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotifEntity)) {
            return false;
        }
        NotifEntity other = (NotifEntity) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.sorbonne.m1.entity.NotifEntity[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the statut
     */
    public String getStatut() {
        return statut;
    }

    /**
     * @param statut the statut to set
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }

    /**
     * @return the createurNotif
     */
    public PersonneEntity getCreateurNotif() {
        return createurNotif;
    }

    /**
     * @param createurNotif the createurNotif to set
     */
    public void setCreateurNotif(PersonneEntity createurNotif) {
        this.createurNotif = createurNotif;
    }

    /**
     * @return the lieuConcerne
     */
    public LieuEntity getLieuConcerne() {
        return lieuConcerne;
    }

    /**
     * @param lieuConcerne the lieuConcerne to set
     */
    public void setLieuConcerne(LieuEntity lieuConcerne) {
        this.lieuConcerne = lieuConcerne;
    }

}
