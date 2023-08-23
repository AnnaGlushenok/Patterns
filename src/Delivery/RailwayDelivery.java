package Delivery;

public class RailwayDelivery extends Delivery {
    private int trackSize;
    private boolean hasBallast;

    public int getTrackSize() {
        return trackSize;
    }

    public void setTrackSize(int trackSize) {
        this.trackSize = trackSize;
    }

    public boolean isHasBallast() {
        return hasBallast;
    }

    public void setHasBallast(boolean hasBallast) {
        this.hasBallast = hasBallast;
    }

    public RailwayDelivery() {
        super();
    }
}
