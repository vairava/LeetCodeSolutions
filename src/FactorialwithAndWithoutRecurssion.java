public class FactorialwithAndWithoutRecurssion {

    public static void main(String[] args) {

        int num = 3;

        int facValue = findFactorial(num);
        int recursiveFact = findFactorialRecursively(num);

        System.out.println(facValue);
        System.out.println(recursiveFact);
    }

    private static int findFactorialRecursively(int num) {
        if(num == 0){
            return 1;
        }
        return num * findFactorialRecursively(num -1);
    }

    //5*4*3*2*1

    private static int findFactorial(int num) {

        int fact = 1;
        int newFact = 1;
        if(num == 0){
            return 1;
        }

        for(int i=num;i>0;num--){
           fact *= num;
           i--;
        }

        //////OR//////////////
//        for(int j=1;j<=num;j++){
//            newFact *= j;
//        }
//        System.out.println(newFact);
        return fact;
    }
}
