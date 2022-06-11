package nc.univ.planning.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String nom;

    public String prenom;

    public int age;

    public String adresse;

    @OneToOne
    @JoinColumn(name = "niveau_id")
    public Niveau niveau;

    /**
     * Constructeur par défaut
     */
    public Eleve(){
    }

    public Eleve(String nom, String prenom, int age, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }
}
