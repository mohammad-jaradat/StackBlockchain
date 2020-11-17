/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain2;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;

/**
 *
 * @author mjaradat
 */
public class Utiltiy {
    
        public static String generateData(String base) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    public static void printInfo(String studentName,String studentId,int sum){
       try{
        System.out.println("My name is: "+ studentName+" studentID:"+studentId);
        System.out.println("The summation is: "+ sum); 
        System.out.println("Serial: "+ generateData(studentId+sum)); 
        }catch(Exception e){
        }
    }
    
}
