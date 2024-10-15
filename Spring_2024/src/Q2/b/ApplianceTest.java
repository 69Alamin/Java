package Q2.b;

import java.util.ArrayList;
import java.util.Comparator;

public class ApplianceTest {
    public static void main(String[] args) {
        ArrayList<Appliance> list=new ArrayList<>();
        list.add(new Appliance("Television","Entertainment",150));
        list.add(new Appliance("Washing machine","Laundary",2000));
        list.add(new Appliance("Refrigerator","Kitchen",100));

        for(Appliance e:list)
        {
            if(e.category.equals("Kitchen"))
                System.out.println(e.toString());
        }

        list.sort(new Comparator<Appliance>() {
            @Override
            public int compare(Appliance o1, Appliance o2) {
                return Double.compare(o2.powerConsumption,o1.powerConsumption);
            }
        });

        System.out.println("\nAppliance with highest power consumption:");
        System.out.println(list.get(0));

        System.out.println("\nAppliance with lowest power consumption:");
        System.out.println(list.get(list.size() - 1));

    }





}
