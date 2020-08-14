   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Model.LoginAuthenticator;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author lebinhan
 */

public class LoginActionSupport extends ActionSupport {
    private String SUCCESS = "SUCCESS";
    private String FAILED = "FAILED";
    private String id;
    private String password;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public LoginActionSupport() {
    }
    
    public String execute() throws Exception {
        LoginAuthenticator loginAuthenticator = new LoginAuthenticator();
        if (loginAuthenticator.checkLogin(id, password) > 0){
            return SUCCESS;
        }
        return FAILED;
    }
    
}
