import java.util.HashMap;
import java.util.Map;

public class Fleet {


    private String name;
    private Map<String, ShipLocation> ships;

    public Fleet() {
        ships = new HashMap<>();

    }



    public boolean place(String shipName, ShipLocation shipLocation){
        if (!ships.containsKey(shipName)){
            ships.put(shipName, shipLocation);
            return true;
        }
        return false;
    }


    public String getPlace(String shipName){
        if(ships.containsKey(shipName)){
            return ships.get(shipName).toString();
        }
        return "";
    }

    public boolean isHit(Location l){
        for (String name: ships.keySet()) {
            if (ships.get(name).hit(l)){
                return true;
            }
        }
        return false;
    }
}
