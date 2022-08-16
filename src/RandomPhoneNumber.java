import java.util.Random;

public class RandomPhoneNumber {


    public static void main(String[] args) {

        System.out.println(getRandomPhoneNumber());
    }


    /*
    Write a program that creates and prints a random phone number of the form XXX-XXX-XXXX.
    Include the dashes in the output. Do not let the first three digits contain an 8 or 9
    (but don't be more restrictive than that), and make sure that the second set of three
     digits is no greater than 742.
    */
    public static String getRandomPhoneNumber() {

        Random random = new Random();
        //first part
        String firstPart = "";
        int CurrentRandomNumber;
        while (firstPart.length() < 3) {
            firstPart += random.nextInt(8);
        }

        //second part
        String secondPart = "";
        while (secondPart.length() < 3) {

            switch (secondPart.length()) {
                case 0:
                    secondPart += random.nextInt(8);
                    break;
                case 1:
                    if (secondPart == new String("7")) {
                        secondPart += random.nextInt(5);
                    } else {
                        secondPart += random.nextInt(10);
                    }
                    break;
                case 2:
                    if (secondPart == new String("74")) {
                        secondPart += random.nextInt(3);
                    } else {
                        secondPart += random.nextInt(10);
                    }
            }
        }

        //third part
        String thirdPart = "";
        while (thirdPart.length() < 4) {
            thirdPart += random.nextInt(10);
        }
        return firstPart + "-" + secondPart + "-" + thirdPart;
    }

}
