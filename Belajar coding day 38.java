import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
  
        boolean a = true;
        boolean b = false;
        boolean c;
        
        //konjungsi (dan)
        c = a && b;
        System.out.println("true && false : "+c);
        
       //disjunsi (atau)
       c = a || b;
        System.out.println("true || false : "+c);
        
        // negasi (bukan)
        System.out.println("false ! true : "+ !b);
      
   

   }
 }
