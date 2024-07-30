package honux;

public class CommandView implements View {

    private Database db;

    public CommandView(Database db) {
        this.db = db;
    }

    @Override
    public int getSeat() {
        return db.getFreeSeat();
    }

    @Override
    public void stopSeat(int seatNum) {
        db.stopSeat(seatNum);
    }
}
