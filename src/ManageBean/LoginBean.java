package ManageBean;

import BackingBean.CarInfo;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class LoginBean {
   private LoginBean lg;
    public LoginBean(){
        lg = new LoginBean();
    }
    public String users(){
       System.out.println(lg.getusername());
        System.out.println(lg.getpassword());

        return "";
    }

    public LoginBean getLg() {
        return lg;
    }

    public void setLg(LoginBean lg) {
        this.lg = lg;
    }


}
