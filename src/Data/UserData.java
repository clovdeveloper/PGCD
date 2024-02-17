package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserData {
static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static int getInteger(String message){
        String data="";
        int result=0,i=0;
        while(i==0){
            try{
                System.out.println(message);
                data=in.readLine();
                result=Integer.parseInt(data);
                i=1;
            }catch(IOException e){
                e.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("vous n avez pas saisi un entier");
            }
            }
        return result;
        }
    public static float getRealNumber(String message){
        String data="";
        float result=0,i=0;
        
        while(i==0){
            try{
                System.out.println(message);
                data=in.readLine();
                result=Float.parseFloat(data);
                i=1;
            }catch(IOException e){
                e.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("vous n avez pas saisi un reel");
            }
        }
        return result;   
    }
    public static String getString(String message){
        String data="";
        int i=0;
        
        while(i==0){
            try{
                System.out.println(message);
                data=in.readLine();
                i=1;
            }catch(IOException e){
                e.printStackTrace();
            }catch(NumberFormatException ex){
               
            }
        }
        
        return data;
    }
		
}

