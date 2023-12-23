import java.util.*;

public class ShipLocation {

    private String name;
    private Set<Location> location;


    public ShipLocation(String name) {
        this.name = name;
        location = new HashSet<Location>();
    }
    public boolean hit(Location l){
        if(location.contains(l)){
            location.remove(l);
            location.add(new Location(-1, -1));
            return true;
        }
        location.add(l);
        return false;
    }
    public int length(){
        List<Location> sorterdLocation = new ArrayList(location);
        Collections.sort(sorterdLocation);
        if(sorterdLocation.get(0).getColumn() == sorterdLocation.get(sorterdLocation.size()).getColumn()){
            return sorterdLocation.get(sorterdLocation.size()).getRow() - sorterdLocation.get(0).getRow();
        }
        return sorterdLocation.get(sorterdLocation.size()).getColumn() - sorterdLocation.get(0).getColumn();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipLocation that = (ShipLocation) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        String res = name + " (";

        for (Location l : location) {
            res+= l.toString() + ", ";
        }
        res = res.substring(0, res.length() -1) + ")";
        return res;
    }
}
