package nc.univ.planning.model;

import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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

    public Niveau(Long id, String code, String libelle){
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }
}
