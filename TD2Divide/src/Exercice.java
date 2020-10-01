public class Exercice {
    public static int puiss(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }else{
            return puiss(x,n-1)*x;
        }
    }
    public static int puissRapide(int x, int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
           int temp=puissRapide(x,n/2);
           return temp*temp;
       }
       else{
           int temp1=puissRapide(x,n/2); // ou (n-1)
           return temp1*temp1*x;// *x en plus car on a coupé en dessous.. du coup pour rattraper ça on fait ça
        }

    }

    public static void main(String[] args){
        System.out.println(puiss(2,6));
        System.out.println(puissRapide(2,6));
    }
}
