public class greatestThree {
    
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int greatest;

        // Check the first pair
        if (num1 > num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }

        // Compare with the third number
        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);
    }
}
