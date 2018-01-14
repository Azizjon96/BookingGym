package BookingGym.model;

import java.util.Objects;

public class Admin {
    private int a_id;
    private String a_login;
    private String a_pass;
    
    public Admin(){}

    public Admin(int a_id, String a_login, String a_pass) {
        this.a_id = a_id;
        this.a_login = a_login;
        this.a_pass = a_pass;       

    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_login() {
        return a_login;
    }

    public void setA_login(String a_login) {
        this.a_login = a_login;
    }

    public String getA_pass() {
        return a_pass;
    }

    public void setA_pass(String a_pass) {
        this.a_pass = a_pass;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.a_id ^ (this.a_id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.a_login);
        hash = 79 * hash + Objects.hashCode(this.a_pass);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (this.a_id != other.a_id) {
            return false;
        }
        if (!Objects.equals(this.a_login, other.a_login)) {
            return false;
        }
        if (!Objects.equals(this.a_pass, other.a_pass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clients{" + "a_id=" + a_id + ", a_login=" + a_login + ", a_pass=" + a_pass + '}';
    }
 
}
