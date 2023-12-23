import java.util.Comparator;

public class SortByRow implements Comparator<Location> {
    @Override
    public int compare(Location o1, Location o2) {
        int equaleRow = Integer.compare(o2.getRow(), o1.getRow());
                if(equaleRow != 0){
                    return equaleRow;
                }
         return Integer.compare(o2.getColumn(), o1.getColumn());
    }
}
