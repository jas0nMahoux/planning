package nc.univ.planning.model;

import lombok.Data;
import nc.univ.planning.model.Niveau;

import javax.persistence.*;

@Entity
@Data
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String nom;

    public String prenom;

    public int age;

    public String adresse;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "niveau_id")
    public Niveau niveau;

    public Eleve() {

    }

    public Eleve(String nom, String prenom, int age, String adresse, Niveau niveau) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.niveau = niveau;
    }
}
