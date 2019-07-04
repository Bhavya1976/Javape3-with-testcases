package main.java.com.stackroute.pe3;

public class UserDefinedException{
public static String userException(String str){
    int result = 0;                                                      // Somewhere to store a result.
    int arraySize = 3;
    int badSize = -1;                                                  // A negative size to generate NegativeArraySizeException.
    int[] array = null;
    String msg="";
    // Define an integer array variable.

    for(int choice = 0; choice<3 ; ++choice)
        try {
            switch(choice) {
                case 0:
                    result = array[0];                                            // Generates a NullPointerException.
                    break;
                case 1:
                    array = new int[badSize];                                     // Generates a NegativeArraySizeException.
                    break;
                case 2:
                    array = new int[arraySize];
                    result = array[arraySize];                                    // Generates an ArrayIndexOutOfBoundsException.
                    break;
            }
        }
    catch(NullPointerException e) {                                  // Catch the NullPointerException:

            str="NullPointerException Exception caught." ;

        }
    catch(NegativeArraySizeException e) {                            // Catch the NegativeArraySizeException:

            str="NegativeArraySizeException Exception caught.";
        }
    catch(ArrayIndexOutOfBoundsException e) {                        // Catch the ArrayIndexOutOfBoundsException:

            str="ArrayIndexOutOfBoundsException Exception caught.";


        }
    return str;
}
}

