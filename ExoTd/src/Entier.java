import static javafx.application.Platform.exit;

public class Entier {
    public static int factorielle(int n){
        if(n==1){
            return 1;
        }
        else{
            return factorielle(n-1)*n;

        }
    }

    public static boolean pair(int n){
        if(n==1){
            return false;
        }
        else{
            if (pair(n - 1)) {
                return false;
            }else{
                return true;
            }
        }
    }
    public static int sommeEntier(int a,int b){
        if (b==0){
            return a;
        }
        else{
            if(b<0){
                return sommeEntier(a,b+1)-1;
            }
            else if(a<0){
                return sommeEntier(a+1,b)-1;
            }
            else{
                return 1+sommeEntier(a,b-1);
            }

        }
    }

    public static int multiplaction(int a,int b){
        if(b==0||a==0){
            return 0;
        }
        if (b==1){
            return a;
        }else{
            return a+multiplaction(a,b-1);
            }
    }

    public static int puissance(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }else{
            return puissance(x,n-1)*x;
        }
    }
    public static long pgcd(long a, long b) {
        long r = a % b;
        if (r == 0){
            return b;
        }
        else{
            return pgcd(b, r);
        }

    }

    public static void main(String[] args){
        int a=factorielle(3);
        System.out.println(a);
        System.out.println(pair(7));
        System.out.println(sommeEntier(-5,15));
        System.out.println(multiplaction(3,0));
        System.out.println(puissance(5,4));
        System.out.println(pgcd(119,544));

    }
}
