/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author nchaudhry.bscs13seec
 */
public class notes {
     Scanner in = new Scanner(System.in);
  
      private final String input;
      public   String uname;
      
      public notes(){
          System.out.println("please enter your username: \n");
          this.uname = in.nextLine();
          System.out.println("please enter the note you want to save");
          this.input = in.nextLine();
         
          
       
  
      }

    public String getname(){
        return this.uname;
}
    public String getnote(){
        return this.input;
    }
}
