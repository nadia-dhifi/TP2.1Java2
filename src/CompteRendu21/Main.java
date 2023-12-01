package CompteRendu21;

public class Main {
	 public static void main(String[] args) {
	        // Créez deux instances de la classe CommandProcessor pour les produits A et B
	        CommandProcessor processorA = new CommandProcessor("Produit A", 5);
	        CommandProcessor processorB = new CommandProcessor("Produit B", 3);

	        // Affectez un nom distinct à chaque instance en utilisant setName()
	        Thread threadA = new Thread(processorA);
	        Thread threadB = new Thread(processorB);

	        threadA.setName("Thread Produit A");
	        threadB.setName("Thread Produit B");

	        // Définissez la priorité des threads
	        threadA.setPriority(Thread.MAX_PRIORITY);
	        threadB.setPriority(Thread.MIN_PRIORITY);

	        // Démarrez les deux threads
	        threadA.start();
	        threadB.start();

	        // Attendre la fin de l'exécution des threads
	        try {
	            threadA.join();
	            threadB.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}



