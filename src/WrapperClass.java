import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        int x=10;
        Integer y=new Integer(10);
        y=10;
        x=y;
        String s="10";
        y=Integer.valueOf(s);
        x=Integer.valueOf(s);
        x=Integer.MAX_VALUE;
        x=Integer.MIN_VALUE;
        Float f=10.5f;
        Double d=12.5;
        Short sh=10;
        Boolean b=true;
        char c='s';
        Character character=c;
        c=Character.valueOf('c');

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] array = str.split(" ");
        int [] intArray= new int[array.length];
        for (int i=0; i<array.length; i++) {
            intArray[i]=Integer.valueOf(array[i]);
        }

    }
}
