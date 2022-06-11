package nc.univ.planning.cours;

import lombok.Data;
import nc.univ.planning.eleve.Eleve;
import nc.univ.planning.niveau.Niveau;
import nc.univ.planning.salle.Salle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Data
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Date dateDebut;

    public Date dateFin;

    @OneToOne
    @JoinColumn(name = "niveau_id")
    public Niveau niveau;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    public Salle salle;

    public ArrayList<Eleve> eleves;

}
