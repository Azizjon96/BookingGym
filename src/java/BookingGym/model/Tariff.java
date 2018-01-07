package BookingGym.model;

import java.util.Objects;

public class Tariff {
    
    private int t_id_tariff;
    private String r_cost;
    private String t_number_visits;
    private String t_number_days;
    private String t_name;
    
    public Tariff(){}

    public Tariff(int t_id_tariff, String r_cost, String t_number_visits, String t_number_days, String t_name) {
        this.t_id_tariff = t_id_tariff;
        this.r_cost = r_cost;
        this.t_number_visits = t_number_visits;
        this.t_number_days = t_number_days;
        this.t_name = t_name;
    }

    public long getT_id_tariff() {
        return t_id_tariff;
    }

    public void setT_id_tariff(int t_id_tariff) {
        this.t_id_tariff = t_id_tariff;
    }

    public String getR_cost() {
        return r_cost;
    }

    public void setR_cost(String r_cost) {
        this.r_cost = r_cost;
    }

    public String getT_number_visits() {
        return t_number_visits;
    }

    public void setT_number_visits(String t_number_visits) {
        this.t_number_visits = t_number_visits;
    }

    public String getT_number_days() {
        return t_number_days;
    }

    public void setT_number_days(String t_number_days) {
        this.t_number_days = t_number_days;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (this.t_id_tariff ^ (this.t_id_tariff >>> 32));
        hash = 71 * hash + Objects.hashCode(this.r_cost);
        hash = 71 * hash + Objects.hashCode(this.t_number_visits);
        hash = 71 * hash + Objects.hashCode(this.t_number_days);
        hash = 71 * hash + Objects.hashCode(this.t_name);
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
        final Tariff other = (Tariff) obj;
        if (this.t_id_tariff != other.t_id_tariff) {
            return false;
        }
        if (!Objects.equals(this.r_cost, other.r_cost)) {
            return false;
        }
        if (!Objects.equals(this.t_number_visits, other.t_number_visits)) {
            return false;
        }
        if (!Objects.equals(this.t_number_days, other.t_number_days)) {
            return false;
        }
        if (!Objects.equals(this.t_name, other.t_name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tariff{" + "t_id_tariff=" + t_id_tariff + ", r_cost=" + r_cost + ", t_number_visits=" + t_number_visits + ", t_number_days=" + t_number_days + ", t_name=" + t_name + '}';
    }
    
    
    
}
