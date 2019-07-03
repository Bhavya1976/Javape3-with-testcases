package main.java.com.stackroute.pe3;
import java.io.FileNotFoundException;


public class StringException {
    public static void firstException(String msg) {
            msg = "this is not found  bound to execute";
            System.out.println(msg);
        }

        public static void main(String[] args) throws Exception {
            try {
                                                                   // Suppose here you are looking for any resource for eg.File
                                                                  // If program is unable to find fil
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                throw new Exception("File not found");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                // This block will get get executed whether exception occures or
                // not.
                System.out.println("i will get printed");
            }

        }
    }

