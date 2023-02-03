
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;




/* @author PastorGuillaume
 * @since Mardi 30 Janvier 2023 au Vendredi 3 Février 2023
 * @params Projet « PLM AIRBUSV1 »
 * @return [Travail individuel, sans utiliser la programmation orientée objet pour l’instant et en générant
 * dorénavant la javadoc]
 * 1/ Votre application doit permettre d’afficher tous les avions (id, programme, phase, type) si
 *	l’utilisateur le souhaite.
 * Trouver plusieurs moyens de les afficher (j’en ai trouvé 5)
 * Vous devez gérer les saisies erronées ?
 * */

//  public class Planes {
//	public static final Integer [] ID  = {1, 2, 3, 4, 5, 6 };
//	public static final String [] PROGRAM = {"A320", "A400M", "A380", "A300", "A350", "A330neo"};
//	public static final String [] PHASE  = {"Feasibility Study", "Design", "Definition", "Construction", "In Service", "Closed"};
//	public static final String [] TYPE = {"Freight", "Transport", "Passenger", "Military", "Business Aircraft", "Cargo"};


public class Planes {

	public static void main(String[] args){


		System.out.println("Bonjour, voici l'application qui permer d'afficher les avions de la compagnie AIRBUS.");	
		System.out.println("Faites votre choix dans le menu et sélectionner un numéro :");
		System.out.println("1 : Afficher tous les avions de la liste.");
		System.out.println("2 : Afficher tous les avions contenant un mot clé dans le programme"); 
		System.out.println("3 : Ajouter ou supprimer une pièce pour un avion donné"); 
		System.out.println("4 : Afficher un avion avec les infos détaillés de chaque pièces"); 
		System.out.println("5 : Quitter l'application, au revoir.");
		Scanner scan = new Scanner(System.in);
		//On vide la ligne avant d'en lire une autre
		// scan.nextLine();

		HashMap<String, ArrayList<String>> program= new HashMap<>();
		program.put("1", new ArrayList(Arrays.asList("A320", "PLM_AIRBUS_IN_SERVICE", "Passenger")));
		program.put("\n2", new ArrayList(Arrays.asList("A400M", "PLM_AIRBUS_DEFINITION", "Military")));
		program.put("\n3", new ArrayList(Arrays.asList("A350", "PLM_AIRBUS_IN_FEASIBILITY", "Passenger")));
		program.put("\n4", new ArrayList(Arrays.asList("A380", "PLM_AIRBUS_IN_STOPPED", "Passenger")));
		program.put("\n5", new ArrayList(Arrays.asList("A350", "PLM_AIRBUS_IN_SERVICE", "Transport")));
		program.put("\n6", new ArrayList(Arrays.asList("A300", "PLM_AIRBUS_DEFINITION", "Cargo")));
		//Scanner scan = new Scanner(System.in);
		int planes = scan.nextInt();
		System.out.println(program); 

		// Insertion d'une clé existante avec une nouvelle valeur
		//String newValue = (String)program.put("7" ,"A330", "Aircraft");

		// Affichage de la nouvelle map
		System.out.println("La nouvelle map avec ajout est : \n" + program);


		int choices =0;
		switch (choices) {
		case 1:
			System.out.println("Afficher tous les avions de la liste.");
			break;
		case 2:
			System.out.println(" Afficher tous les avions contenant un mot clé dans le programme");
			break;
		case 3:
			System.out.println("Ajouter ou supprimer une pièce pour un avion donné");
			break;	
		case 4:
			System.out.println("Afficher un avion avec les infos détaillés de chaque pièces");
			break;		
		case 5:
			System.out.println("Quitter l'application, au revoir.");
			break;					
		}


		// Saisie par mot clé affichant tous les avions	

		List<String> result = new ArrayList<>();
		for (String i : result ) {
			if (i.startsWith("A")) {
				result .add(i);
			}
		}
		System.out.println(result );
		
		

		// Suppression d'un élément dans la liste
		 System.out.println("Avant la suppression : " +program);
		 ArrayList<String> elmentSupprime = program.remove("3");
		 System.out.println("L'élément supprimé est " +elmentSupprime);
		 System.out.println("Avant la suppression de " +elmentSupprime+ " : \n"+program);

	}
}		


//		HashMap<Integer, String> program = new HashMap<>();
//		program.put(1, "A320");
//		program.put(2, "A400M");
//		program.put(3, "A380");
//		program.put(4, "A300");
//	    System.out.println(program); 
//				 ArrayList<String> program = new ArrayList<String>();
//				    program.add("A320");
//				    program.add("A400M");
//				    program.add("A380");
//				    program.add("A350");
//				    program.add("A300");
//				    program.add("A330Neo");
//				    System.out.println(program);  
//				  
//			    for(int i = 0 ; i < program.size(); i++) {
//		    	 System.out.println(program.get(i));
//			    }	 
//		    
//		    ArrayList<String> phase = new ArrayList<String>();
//		    phase.add("Feasibility Study");
//		    phase.add("Design");
//		    phase.add("Definition");
//		    phase.add("Construction");
//		    phase.add("In Service");
//		    phase.add("Closed");
//			System.out.println(phase);   


//		System.out.println("Bonjour, voici l'application qui permer d'afficher les avions de la compagnie AIRBUS.");
//		Scanner scan = new Scanner(System.in);
//		int choices;
//		while(scan.hasNextInt() == false)	scan.next();
//	nbMenu = scan.nextInt();
//		ArrayList<String>  order = new ArrayList<String>();
//		for(int i = 0 ; i < choices ; i ++) {
//
//	}

































