import java.util.Scanner;

class Palindromik {
    static String palindromik(int sayi){
        String element=String.valueOf(sayi);
        for(int i=0;i<element.length();i++){
            if(Integer.valueOf(element.substring(i, i+1))==Integer.valueOf(element.substring(element.length()-i-1,element.length()-i))){

            }
            else{
                return "no palindromik number";

            }
        }
        return "palindromik number";
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(palindromik(input.nextInt()));
    }
}