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
        if (n == 0) {
            tab[0] = true;
        } else {
            remplir(n - 1);
        }
        afficher();
    }

    public void  remplir2(int n) {
        if (n == 1) {
            System.out.println(0);
        } else if(n > 1) {
            //-----
            remplir2(n - 1);
            //****-
            vider2(n-2);
            //---*-
            //ici cache jouable 0 et n-1
            System.out.println(n-1);
            //---**
            remplir2(n - 2);
            //*****
        }
    }

    public void vider2(int n) {
        if (n == 1) {
            System.out.println(0);
        }
        else if(n>1) {
            //*****
            vider2(n - 1);
            //---**
            System.out.println(n -1);
            //---*-
            remplir2(n - 2);
            //****-
            vider2(n-2);
            //*****
        }
    }


    public static void main (String[]args){
            Baguenaudier b1 = new Baguenaudier(4);
            b1.afficher();
            b1.remplir2(3);


    }

}
