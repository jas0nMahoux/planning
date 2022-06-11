package nc.univ.planning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TP Final : Spring BOOT
 *
 * @author GNAVIT Anthony
 * @author MAHOUX Jason
 */

@SpringBootApplication
public class PlanningApplication {
	/**
	 * La consultation des salles
	 * La création d’une nouvelle salle
	 * La modification d’une salle existante
	 * La suppression d’une salle existante
	 * La consultation des élèves
	 * La création d’un nouvel élève
	 * La modification d’un élève existant
	 * La suppression d’un élève
	 * La consultation des cours
	 * La création d’un cours
	 * La modification d’un cours
	 * La suppression d’un cours
	 */
	public static void main(String[] args) {
		SpringApplication.run(PlanningApplication.class, args);

		System.out.println("Initialisation du contexte applicatif");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
	}

}
