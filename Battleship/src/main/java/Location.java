import java.util.Objects;

public class Location implements Comparable<Location> {

    private int row;
    private int column;

    public Location(int row, int column){
        this.row = row;
        this.column = column;
    }


    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location locatie = (Location) o;
        return row == locatie.row && column == locatie.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {
        String res = "";
        String letters = "ABCDEFGHIJ";
        res += letters.charAt(getRow() - 1) + "-" + (getColumn() + 1);
        return res;
    }

    @Override
    public int compareTo(Location other) {
        return this.toString().compareTo(other.toString());
    }
}
