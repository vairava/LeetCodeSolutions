public class CheckPalindrom {

    public static void main(String[] args) {
        String name = "racecar";
        boolean isPlaindrom = true;
        String nameLowerCase = name.toLowerCase(); // Just to be safe

        int j = name.length();
        for(int i=0;i<nameLowerCase.length();i++){
            if(nameLowerCase.charAt(i) != nameLowerCase.charAt(--j)){
                isPlaindrom = false;
                break;
            }
        }

        if(isPlaindrom){

            System.out.println("Yes they are palindrom");
        }
        else{
            System.out.println("Nope not a palindrom");
        }


    }
}
