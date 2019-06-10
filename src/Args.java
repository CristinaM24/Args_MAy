public class Args {
    public static void main(String[] args) {
        if(args.length>0) {
            System.out.println("Hello " + args[0] + "!");
        }else {
            System.out.println("Hello world");   //// din sus dreapta configurare - argumente - programs arguments
        }
        int[] arr={1,2,3,4};
        int sum=sum(arr);
        System.out.println(sum);
        System.out.println(sum(new int[]{1,2,3,4}));
        int sumWithVarArgs=sumWithVarArrgs(1,2,3,4,5);
        System.out.println(sumWithVarArrgs());
        min(1,2,3,4,5);
        min();

        //int sum=sum(new int[]{1,2,3,4});
    }

    static int sum(int[] numere) {
        int sum=0;
        for(int x:numere) {
            sum+=x;
        }
        return sum;
    }
    static int sumWithVarArrgs(int ... numere) {
        int sum=0;
        for(int x:numere) {
            sum+=x;
        }
        return sum;

    }
    static  void  min(int ...numere) {
        if(numere.length==0) {
            System.out.println("Empty array");
        } else {
            int min=numere[0];
            for(int x:numere) {
                if(x<min) min=x;
            }
            System.out.println("Minimul "+min);
        }
    }
}
