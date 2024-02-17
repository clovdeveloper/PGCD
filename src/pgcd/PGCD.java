
package pgcd;


import Data.UserData;

public class PGCD {

   
    public static void main(String[] args) {

       int a= UserData.getInteger("Entrer le premiere nombre");
        int b= UserData.getInteger("Entrer le deuxieme nombre");
        System.out.println("Leur PGCD est"+pgcd(a, b));
        
        
    }
    
  private static int pgcd(int a,int b){

     if(a !=0 && b != 0){
         while(a!=b){
             if(a>b)
                 a=a-b;
             else
                 b=b-a;
         }
         return a;
     }  else {
         throw new IllegalArgumentException("veuillez entre des nombres different de zero");

     }
    }
}


    

