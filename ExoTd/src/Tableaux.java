
public class Tableaux {
    public static boolean palindromeAux(Character []t, int i,int j){
        /*if(i>=j){
            return true;
        }*/
        if(i==j){
            return true;
        }
        if(i==j-1){
            return t[i]==t[j];
        }
        if(t[i]!=t[j]){
            return false;
        }
        else{
            return palindromeAux(t,i+1,j-1);
        }
    }

    public static Character[] toCharacterArray( String s ) {

        if ( s == null ) {
            return null;
        }

        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len ; i++) {
            array[i] = s.charAt(i);;
        }

        return array;
    }

    public static boolean palindrome(Character []t){
        return palindromeAux(t,0,t.length-1);
    }

    public static void main(String[] args){
        String str = "ikki";
        Character[] charArray = toCharacterArray(str);

        System.out.println(palindrome(charArray));


    }
}
