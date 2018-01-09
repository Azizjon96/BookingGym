
package BookingGym.model;

/**
 *
 * @author Azizjon
 */
public class Statuses {
    private int s_id_status;
    private boolean s_processing;
    private boolean s_approved;
    private boolean s_failure;
   
    public Statuses(){}

    public Statuses(int s_id_status, boolean s_processing, boolean s_approved, boolean s_failure) {
        this.s_id_status = s_id_status;
        this.s_processing = s_processing;
        this.s_approved = s_approved;
        this.s_failure = s_failure;
    }

    public int getS_id_status() {
        return s_id_status;
    }

    public void setS_id_status(int s_id_status) {
        this.s_id_status = s_id_status;
    }

    public boolean isS_processing() {
        return s_processing;
    }

    public void setS_processing(boolean s_processing) {
        this.s_processing = s_processing;
    }

    public boolean isS_approved() {
        return s_approved;
    }

    public void setS_approved(boolean s_approved) {
        this.s_approved = s_approved;
    }

    public boolean isS_failure() {
        return s_failure;
    }

    public void setS_failure(boolean s_failure) {
        this.s_failure = s_failure;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.s_id_status ^ (this.s_id_status >>> 32));
        hash = 29 * hash + (this.s_processing ? 1 : 0);
        hash = 29 * hash + (this.s_approved ? 1 : 0);
        hash = 29 * hash + (this.s_failure ? 1 : 0);
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
        final Statuses other = (Statuses) obj;
        if (this.s_id_status != other.s_id_status) {
            return false;
        }
        if (this.s_processing != other.s_processing) {
            return false;
        }
        if (this.s_approved != other.s_approved) {
            return false;
        }
        if (this.s_failure != other.s_failure) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Statuses{" + "s_id_status=" + s_id_status + ", s_processing=" + s_processing + ", s_approved=" + s_approved + ", s_failure=" + s_failure + '}';
    }
    
    
}
