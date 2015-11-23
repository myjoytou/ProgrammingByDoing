public class LetterToYourself {
    
    private static void printAddress() {
        /**
         * Divide things into module.
         * First print the horizontal line using the "-" character.
         * 
         */
        int width = 70;
        int height = 15;
        int addressOffsetHeight = 5;
        int addressOffsetLength = 25;
        /*
        String name = "Vivek Kumar";
        String addressLine1 = "Postal Park";
        Stirng addressLine2 = "Patna";*/
        String [] nameAdress = {"Vivek Kumar", "Postal Park", "Patna"};
        /*
            Top horizontal lines
         */
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        /*
            Down lines
         */
        int addressLineCount = 0;
        for (int i = 0; i < height; i++) {
            System.out.print("|");
            for (int j = 0; j < width - addressOffsetLength; j++) {
                System.out.print(" ");

            }
            if (addressLineCount < 3 && i > (height - addressOffsetHeight)) {
                System.out.print(nameAdress[addressLineCount]);
                int remainingSpace = nameAdress[addressLineCount].length();
                for (int k = 0; k < addressOffsetLength - remainingSpace; k++) {
                    System.out.print(" ");
                }
                addressLineCount++;
            }
            else {
                for (int k = 0; k < addressOffsetLength; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        // for (int j = 0; j < width; j++) {
        //         System.out.print(" ");
        // }
        // System.out.println("+");


        /*
            Bottom horizontal lines
         */
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
    public static void main(String [] args) {
        printAddress();
    }
}
