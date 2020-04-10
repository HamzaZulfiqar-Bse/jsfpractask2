package ManageBean;

import BackingBean.CarInfo;
import db.DbConnection;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

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

    public List<User> getUser(){
        List<User> users = new ArrayList<user>();
        DbConnection dbConnection = new DbConnection();
        resultset rs = dbConnection.getRecords();
        User user=new user();
        try {
            while (rs.next()) {
                nuser.getName(rs.getString(ColumnLabel:"username" ));
                nuser.getpassword(rs.getString(ColumnLabel:"password"));
                users.add(muser);
            }
        }catch(Exception ex){ ex.printStackTrace();
        }
        return users;

    }
    public LoginBean getLg() {
        return lg;
    }

    public void setLg(LoginBean lg) {
        this.lg = lg;
    }


}
