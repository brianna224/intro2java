/***********************************
 * Brianna Patrick
 * Lab08
 * 03/17/21
 **********************************/
package Lab8;

public class Array {
    public static void main(String[] args) {
        String[] tokens = args[0].split(",");
        String[] customerName = new String[8];
        for (int i = 0; i < tokens.length; i++) {
            customerName[i] = tokens[i];
        }

        displayNames(customerName);

        /***************************************
         * moving the elements summer and morty
         ****************************************/

        String temp = customerName[4];
        customerName[4] = customerName[6];
        customerName[6] = temp;
        String temp1 = customerName[5];
        customerName[5] = customerName[7];
        customerName[7] = temp1;

        /***************************************
         * adding the elements rick and jessica
         ***************************************/
        customerName[4] = "Rick";
        customerName[5] = "Jessica";

        displayNames(customerName);

        /*********************************************************
         * reverse customer names then display the returned result
         **********************************************************/
        String[] reversedNames = reverseNames(customerName);
        displayNames(reversedNames);

        reverseNames2(customerName);

        /***********************************************************************************************************************************
         * create a for loop to check for "Rick", if found, remove it, and shift the remaining elements up leaving null at the last position
         ***********************************************************************************************************************************/
        for (int i = 0; i < customerName.length; i++) {
            if(customerName[i] != null) {
                if(customerName[i].equals("Rick")) {
                    for(int j = i; j < customerName.length - 1; j++) {
                        customerName[j] = customerName[j + 1];
                    }
                }
            }
        }
        customerName[6] = null;
        customerName[7] = null;
        displayNames(customerName);
    }

    public static void displayNames(String[] names) {
        for (String e:names) {
            System.out.println(e);
        }
        System.out.println("");
    }

    public static String[] reverseNames(String[] names) {
        String[] result = new String[names.length];

        for (int i = 0, j = result.length - 1; i < names.length; i++, j--) {
            result[j] = names[i];
        }
        return result;
    }

    public static void reverseNames2(String[] names) {
        String temp = names[0];
        for (int i = 0, k = 1; i < names.length - k; i++, k++) {
            temp = names[names.length - k];
            names[names.length - k] = names[i];
            names[i] = temp;
        }

        displayNames(names);
    }
}
