public class Baguenaudier {
    boolean[] tab;

    public Baguenaudier(int taille){
        tab = new boolean[taille];
    }

    public void afficher() {
        String a = "";
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]){
                a = a+ "*";
            } else {
                a = a + "-";
            }

        }
        System.out.println(a);
    }

    public void remplir(int n) {
        if (n == 1) {
            tab[0] = true;
        } else {
            remplir(n - 1);
        }
        afficher();
    }



    public static void main (String[]args){
            Baguenaudier b1 = new Baguenaudier(4);
            b1.afficher();
            b1.remplir(3);


    }

}
