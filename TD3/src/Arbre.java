public class Arbre {
    private int val;
    private Arbre filsG;
    private Arbre filsD;


    boolean estVide(){
        return filsG==null;
    }

    public Arbre(int val, Arbre filsG, Arbre filsD) {
        this.val = val;
        this.filsG = filsG;
        this.filsD = filsD;
    }

    public  Arbre() {
    }

    public Arbre(int val) {
        this.val = val;
        this.filsG =new Arbre();
        this.filsD =new Arbre();
    }

    public boolean estFeuille(){
        return (filsG.estVide()&&filsD.estVide());
    }
    public boolean chercheNoeudInterne(int x){
        if(estVide() || estFeuille()){
          return false;
        }
        if(val==x){
            return true;
        }
        else{
            return filsG.chercheNoeudInterne(x) || filsD.chercheNoeudInterne(x);
        }
    }
    public boolean chercheFeuille(int x) {
        if (estVide()) {
            return false;
        }
        if (estFeuille()){
            return (val==x);
        }

        return filsG.chercheFeuille(x) || filsD.chercheFeuille(x);

    }

    public static void main(String[] args){
        Arbre A1 = new Arbre(1,new Arbre(2),new Arbre(3));

        Arbre A2 = new Arbre(1,new Arbre(2,new Arbre(4), new Arbre(5)),new Arbre(3,new Arbre(6),new Arbre(7)));
        System.out.println(A1.chercheNoeudInterne(1));

        System.out.println(A1.chercheFeuille(3));

        System.out.println(A2.chercheNoeudInterne(0));

        System.out.println(A2.chercheFeuille(1));

    }
}
