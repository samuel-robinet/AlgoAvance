public class Hanoi {

    public void resoudreAux(int n, int i, int j){
        if(n==1){
            System.out.println(i+"-->"+j);
        }
        else{
            int k=6-i-j;
            resoudreAux(n-1,i,k);
            System.out.println(i+"-->"+j);
            resoudreAux(n-1,k,j);

        }
    }
    public void resoudre(int n){
        resoudreAux(n,1,3);
    }

    public static void main(String[] args){
        Hanoi h1= new Hanoi();
        //h1.resoudreAux(4,2,1);
        h1.resoudre(3);
    }
}
