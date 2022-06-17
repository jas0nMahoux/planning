package nc.univ.planning.niveau;

import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@Data
@Entity
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    public String code;
    public String libelle;

    public Niveau() {
    }

    public Niveau(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }
}
