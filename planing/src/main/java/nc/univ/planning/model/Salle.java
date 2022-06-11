package nc.univ.planning.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public int capacite;
    public String nom;
    public String code;

    /**
     * Constructeur par défaut
     */
    public Salle(){
    }

    public Salle(int capacite, String nom, String code){
        this.capacite = capacite;
        this.nom = nom;
        this.code = code;
    }

}