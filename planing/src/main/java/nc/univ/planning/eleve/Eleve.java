package nc.univ.planning.eleve;

import lombok.Data;
import nc.univ.planning.niveau.Niveau;

import javax.persistence.*;

@Entity
@Data
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String nom;

    public String prenom;

    public int age;

    public String adresse;

    @OneToOne
    @JoinColumn(name = "niveau_id")
    public Niveau niveau;

}
