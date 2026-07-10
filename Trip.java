public class Trip {
    private String pickup;
    private String dropOff;
    private String status;

    public Trip(String pickup, String dropOff) {
        this.pickup = pickup;
        this.dropOff = dropOff;
        this.status = "requested";
    }

    public String getPickup() {
        return pickup;
    }

    public String getDropOff() {
        return dropOff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

