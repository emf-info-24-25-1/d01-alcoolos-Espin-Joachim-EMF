package app;

public class Application {
    public static void main(String[] args) {
        Ami ami1 = new Ami("Axel", 3);
        Ami ami2 = new Ami("Romeo", 2);
        Ami ami3 = new Ami("Joachim", 6);

        System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBiereRestantes() + " bières.");
        System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBiereRestantes() + " bières.");
        System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBiereRestantes() + " bières.");

        ami1.boitUneBierre();
        ami2.boitUneBierre();
        ami3.boitUneBierre();

        System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBiereRestantes() + " bières.");
        System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBiereRestantes() + " bières.");
        System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBiereRestantes() + " bières.");
    }
}
