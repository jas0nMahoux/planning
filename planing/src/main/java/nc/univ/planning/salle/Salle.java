package nc.univ.planning.salle;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public int capacite;
    public String nom;
    public String code;

    public Salle(){}

    public Salle(int capacite, String nom, String code){
        this.capacite = capacite;
        this.nom = nom;
        this.code = code;
    }
}
