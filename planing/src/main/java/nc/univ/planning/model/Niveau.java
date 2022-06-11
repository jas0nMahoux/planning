package nc.univ.planning.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Niveau {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String code;
    public String libelle;

    /**
     * Constructeur par défaut
     */
    public Niveau(){
    }

    public Niveau(String code, String libelle){
        this.code = code;
        this.libelle = libelle;
    }
}