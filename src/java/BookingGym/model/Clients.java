package BookingGym.model;

import java.util.Objects;

public class Clients {
    private int c_id_client;
    private String c_surname;
    private String c_name;
    private String c_lastname;
    private String c_phone;
    
    public Clients(){}

    public Clients(int c_id_client, String c_surname, String c_name, String c_lastname, String c_phone) {
        this.c_id_client = c_id_client;
        this.c_name = c_name;
        this.c_surname = c_surname;       
        this.c_lastname = c_lastname;
        this.c_phone = c_phone;
    }

    public int getC_id_client() {
        return c_id_client;
    }

    public void setC_id_client(int c_id_client) {
        this.c_id_client = c_id_client;
    }

    public String getC_surname() {
        return c_surname;
    }

    public void setC_surname(String c_surname) {
        this.c_surname = c_surname;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_lastname() {
        return c_lastname;
    }

    public void setC_lastname(String c_lastname) {
        this.c_lastname = c_lastname;
    }

    public String getC_phone() {
        return c_phone;
    }

    public void setC_phone(String c_phone) {
        this.c_phone = c_phone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.c_id_client ^ (this.c_id_client >>> 32));
        hash = 79 * hash + Objects.hashCode(this.c_surname);
        hash = 79 * hash + Objects.hashCode(this.c_name);
        hash = 79 * hash + Objects.hashCode(this.c_lastname);
        hash = 79 * hash + Objects.hashCode(this.c_phone);
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
        final Clients other = (Clients) obj;
        if (this.c_id_client != other.c_id_client) {
            return false;
        }
        if (!Objects.equals(this.c_surname, other.c_surname)) {
            return false;
        }
        if (!Objects.equals(this.c_name, other.c_name)) {
            return false;
        }
        if (!Objects.equals(this.c_lastname, other.c_lastname)) {
            return false;
        }
        if (!Objects.equals(this.c_phone, other.c_phone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clients{" + "c_id_client=" + c_id_client + ", c_surname=" + c_surname + ", c_name=" + c_name + ", c_lastname=" + c_lastname + ", c_phone=" + c_phone + '}';
    }
 
}
