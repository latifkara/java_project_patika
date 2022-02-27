public class PalindromNumber {

    public static boolean isPalindromaNumber(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        for(;temp != 0;){
            lastNumber = temp % 10;
            System.out.println("last number : "+lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println("reverse number : "+ reverseNumber);
        }
        return number == reverseNumber;
    }
    public static void main(String[] args) {
        System.out.println(isPalindromaNumber(121));;

    }
}
