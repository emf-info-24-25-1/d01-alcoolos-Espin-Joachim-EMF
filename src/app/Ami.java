package app;

public class Ami {
    private final String nom;
    private int biereRestentes;

    public Ami(String nom, int biereRestentes) {
        this.nom = nom;
        this.biereRestentes = biereRestentes;
    }

    public String getNom() {
        return nom;
    }

    public int getBiereRestantes() {
        return biereRestentes;
    }

    public void boitUneBierre() {
        if (biereRestentes > 0) {
            biereRestentes--;
            System.out.println(nom + " a bu une bière, il lui reste " + biereRestentes);
        } else {
            System.out.println(nom + "est deja saoul, il ne peut donc plus boire de bière !");
        }
    }

}


