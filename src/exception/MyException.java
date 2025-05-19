package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ConcurrentModificationException;

public class MyException extends RuntimeException{

    private String errorCode;
    //tier layer tupe
    //1    00    10


    //400--> client side exception
    //500--> server side exception
    private String message;

    public void myMethod1() throws IOException{
        try{
            myMethod2();
        } catch(Exception e){

        }
    }
    public void myMethod2() throws IOException{
        myMethod3();
    }
    public void myMethod3() throws IOException{
        myMethod();
    }

    public void myMethod() throws IOException{
        try{
            throw new FileNotFoundException("File not found");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(ConcurrentModificationException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //exception popped
            //close resouces
            //release locks
        }
    }
}
