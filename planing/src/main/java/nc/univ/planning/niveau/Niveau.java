package nc.univ.planning.niveau;

import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@Entity
@Data
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String code;
    public String libelle;

}
