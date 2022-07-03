
import com.email.durgesh.Email;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jai Deep
 */
public class emailsender {
public static void main (String[] args){    
try {  
    
        Email email=new Email("myhospitalmanagementsystem@gmail.com","vijvucfcpmymbouj");
        //from
        email.setFrom("myhospitalmanagementsystem@gmail.com", "My Hospital Management System");
        email.setSubject("INDUS DIAGNOSTIC CENTER");
        email.setContent("Dear ", "text/html");
        email.addRecipient("jaideepp247@gmail.com");
        
        email.send();
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
}}
