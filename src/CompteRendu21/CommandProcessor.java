package CompteRendu21;

class CommandProcessor implements Runnable {
    private String productName;
    private int iterations;

    public CommandProcessor(String productName, int iterations) {
        this.productName = productName;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            // Simulez le traitement des commandes pour le produit spécifié
            System.out.println("Traitement de la commande pour " + productName);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Thread " + Thread.currentThread().getName() +
                           " a terminé. Temps total : " + totalTime + " millisecondes");
    }
}

