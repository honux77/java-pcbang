package honux;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SimpleMemoryDatabase implements Database{

    private Map<Integer, Boolean> mdb;
    private LinkedList<Integer> freeList;

    @Override
    public void init(int maxSeat) {
        mdb = new HashMap<>();
        freeList = new LinkedList<>();
        for (int i = 1; i <= maxSeat; i++) {
            mdb.put(i, false);
            freeList.add(i);
        }
    }

    @Override
    public int getMaxSeat() {
        return mdb.size();
    }

    @Override
    public int getFreeSeat() {
        if (freeList.size() == 0) {
            return -1;
        }
        int numSeat = freeList.removeFirst();

        return ;
    }

    @Override
    public void stopSeat(int seatNum) {

    }
}
