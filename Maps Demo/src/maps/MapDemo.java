package maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

 

public class MapDemo {

    public static void main(String[] args) {

        Map vehicles = new HashMap<String,Integer>();

    // Add some vehicles.

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());
         

        // Iterate over all vehicles, using the keySet method.
        Set set = vehicles.entrySet();

        Iterator iter = set.iterator();
        
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            System.out.print("Car: "+ mentry.getKey() + " & Avalaible: ");
            System.out.println(mentry.getValue());
         }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the car name: ");
        String searchKey = scan.next();

        if(vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " "
                    + searchKey + " cars!\n");

         

        // Clear all values.
        vehicles.clear();

        // Equals to zero.

        System.out.println("After clear operation, size: " + vehicles.size());

    }

}
