package honux;

public interface Database {
    void init(int maxSeat);
    int getMaxSeat();
    int getFreeSeat();
    void stopSeat(int seatNum);

}
