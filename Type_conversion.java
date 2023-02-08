
public class Type_conversion {
    public static void main(String[] args)
     {
        //byte b = 127;
        //System.out.println(b); -- output 127 --
        // tr ying toput 257 insted of 127 the we get error --- INCOMPATIBLE ---
        // byte b = 257;

        // int a = 257;         //we had recived the value bec we lie in the range of byte 
        // byte k =(byte) a;      // this is performing modulus operation behind 
        // System.out.println(k);       // ooutput = 1 


        // float f = 5.6f;            // THIS TYPE OF CASTING WILL REQUIRED IN OOPS CONCEPT 
        // int t =(int)f;            // in this type of conversion we might loose the data 
        // System.out.println(t);    // bec it will not print the value after decimal point ( converting to integer)


        byte a = 10;
        byte b = 30;      //when we multiply byte multiply by byte it cross the range of byte so java  will promote to integer 
        int result = a*b;
        System.out.println(result);
        // This is called type promotion 

    }
    
}

/*
 * eg byte =127;  --- Range define we can go beyond this no 
 * int a = 12 ;
 * b =a ; ----incorrect----CASTING----  we cant do this bec it is not allowed 
 * a = b; ----correct----CONVERSION---- we cant do this --- this is implicit --- in this we are trying to conver inter value into byte value 
 * for conversion we cna implement tjis 
 * b = (byte)a; ---converting--- wehen we do explicit conversion then it is called casting  
 *  float f = 5.6f;
 * int x = (int)f;  in this conversion we will losse POINT VALUES 
 *  x = 5 we will get
 * 
 */