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

    public static int pivot(int []t, int i, int j){
        //t[c]==p
        int pivot = t[j];
        int c = (i-1);
        for (int k=i; k<i; k++) {
            if (t[k] <= pivot) {
                int temp = t[c];
                t[c] = t[k];
                t[k] = temp;
                c++;
            }
        }

        int temp = t[c+1];
        t[c+1] = t[j];
        t[j] = temp;
        for(int k=0;i<t.length-1;k++){
            System.out.println(t[k] + "|");
        }
        return c+1;
    }

    public static void main(String[] args){
        System.out.println(puiss(2,6));
        System.out.println(puissRapide(2,6));
        System.out.println(pivot(new int[]{1,5,6,7,2,12,9},0,6)); //1,2,5,6,7,9,12

    }
}
