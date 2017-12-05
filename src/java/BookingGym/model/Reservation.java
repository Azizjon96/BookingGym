package BookingGym.model;

import java.util.Date;
import java.util.Objects;

public class Reservation {
    
    private long r_id_reservation;
    private long r_id_client;
    private String r_hall;
    private Date r_begin_visits;
    private Date r_end_visits;
    private long r_id_tariff;
    private long r_id_status;
    
    public Reservation(){}

    public Reservation(long r_id_reservation, long r_id_client, String r_hall, Date r_begin_visits, Date r_end_visits, long r_id_tariff, long r_id_status) {
        this.r_id_reservation = r_id_reservation;
        this.r_id_client = r_id_client;
        this.r_hall = r_hall;
        this.r_begin_visits = r_begin_visits;
        this.r_end_visits = r_end_visits;
        this.r_id_tariff = r_id_tariff;
        this.r_id_status = r_id_status;
    }

    public long getR_id_reservation() {
        return r_id_reservation;
    }

    public void setR_id_reservation(long r_id_reservation) {
        this.r_id_reservation = r_id_reservation;
    }

    public long getR_id_client() {
        return r_id_client;
    }

    public void setR_id_client(long r_id_client) {
        this.r_id_client = r_id_client;
    }

    public String getR_hall() {
        return r_hall;
    }

    public void setR_hall(String r_hall) {
        this.r_hall = r_hall;
    }

    public Date getR_begin_visits() {
        return r_begin_visits;
    }

    public void setR_begin_visits(Date r_begin_visits) {
        this.r_begin_visits = r_begin_visits;
    }

    public Date getR_end_visits() {
        return r_end_visits;
    }

    public void setR_end_visits(Date r_end_visits) {
        this.r_end_visits = r_end_visits;
    }

    public long getR_id_tariff() {
        return r_id_tariff;
    }

    public void setR_id_tariff(long r_id_tariff) {
        this.r_id_tariff = r_id_tariff;
    }

    public long getR_id_status() {
        return r_id_status;
    }

    public void setR_id_status(long r_id_status) {
        this.r_id_status = r_id_status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.r_id_reservation ^ (this.r_id_reservation >>> 32));
        hash = 89 * hash + (int) (this.r_id_client ^ (this.r_id_client >>> 32));
        hash = 89 * hash + Objects.hashCode(this.r_hall);
        hash = 89 * hash + Objects.hashCode(this.r_begin_visits);
        hash = 89 * hash + Objects.hashCode(this.r_end_visits);
        hash = 89 * hash + (int) (this.r_id_tariff ^ (this.r_id_tariff >>> 32));
        hash = 89 * hash + (int) (this.r_id_status ^ (this.r_id_status >>> 32));
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
        final Reservation other = (Reservation) obj;
        if (this.r_id_reservation != other.r_id_reservation) {
            return false;
        }
        if (this.r_id_client != other.r_id_client) {
            return false;
        }
        if (this.r_id_tariff != other.r_id_tariff) {
            return false;
        }
        if (this.r_id_status != other.r_id_status) {
            return false;
        }
        if (!Objects.equals(this.r_hall, other.r_hall)) {
            return false;
        }
        if (!Objects.equals(this.r_begin_visits, other.r_begin_visits)) {
            return false;
        }
        if (!Objects.equals(this.r_end_visits, other.r_end_visits)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservation{" + "r_id_reservation=" + r_id_reservation + ", r_id_client=" + r_id_client + ", r_hall=" + r_hall + ", r_begin_visits=" + r_begin_visits + ", r_end_visits=" + r_end_visits + ", r_id_tariff=" + r_id_tariff + ", r_id_status=" + r_id_status + '}';
    }
    
    
    
    
}
