package nc.univ.planning.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Data
@Entity
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Date debut;

    public Date fin;

    @OneToOne
    @JoinColumn(name = "niveau_id")
    public Niveau niveau;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    public Salle salle;

    public ArrayList<Eleve> eleves;

    /**
     * Constructeur par défaut
     */
    public Cours(){
    }

    public Cours(Date debut, Date fin){
        this.debut = debut;
        this.fin = fin;
    }
}