public class SwapStringsWithoutVairable {

    public static void main(String[] args) {

        String a = "hello";
        String b = "world";

        a = a+b;
        b= a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("After Swapping");
        System.out.println("A :"+a+" B : "+b);

    }
}
