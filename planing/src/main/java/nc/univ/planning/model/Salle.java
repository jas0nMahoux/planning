package nc.univ.planning.model;

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

}
