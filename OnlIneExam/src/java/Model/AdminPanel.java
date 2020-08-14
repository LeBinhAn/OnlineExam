/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author lebinhan
 */
public class AdminPanel {
   public String execute(){
    
    HttpServletRequest request=ServletActionContext.getRequest();
    HttpSession session=request.getSession();
    String _session =(String)session.getAttribute("login");
    
    if((_session!=null) && (!_session.equals(""))){
	return "SUCCESS";
    }   
    else{
	return "FAILED";
    }
   } 
}
