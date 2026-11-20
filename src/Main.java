/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME:  max
*****************************************************************************************************
*/


    public class Main {

    public static void main(String[] args) {


        // 1. add
        int twoSum = add(4, 8);
        System.out.println(twoSum);
        // 2. add
        int fourSum = addFour(4, 8, 9, 1);
        System.out.println(fourSum);
        // 3. morningGreeting
        String morningMessage = morningGreeting("Cody Fox");
        System.out.println(morningMessage);
        // 4. afternoonGreeting
        String afternoonMessage = afternoonGreeting("Max Miller");
        System.out.println(afternoonMessage);
        // 5. triple
        String tripleText = triple("yeahbuddy");
        System.out.println(tripleText);
        // 6. half
        double halfOfNumber = half(4);
        System.out.println(halfOfNumber);
        // 7. roundPositiveValueToNearestInteger
        int roundedPositive = roundPosToInt(9.89);
        System.out.println(roundedPositive);
        // 8. roundNegativeValueToNearestInteger
        int roundedNegative = roundNegToInt(-5.8);
        System.out.println(roundedNegative);
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int addFour(int firstNum, int secondNum, int thirdNumber, int fourthNumber) {
        return firstNum + secondNum + thirdNumber + fourthNumber;
    }

    public static String morningGreeting(String personName) {
        return "早上好， " + personName + "!";
    }

    public static String afternoonGreeting(String personName) {
        return "下午好， " + personName + "!";
    }

    public static String triple(String text) {
        return text + text + text;
    }

    public static double half(int number) {
        return number / 2.0;
    }

    public static int roundPosToInt(double posVal) {
        return (int) (posVal + 0.5);
    }

    public static int roundNegToInt(double negVal) {
        return (int) (negVal - 0.5);
    }
}
