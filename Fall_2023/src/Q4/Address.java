package Q4;

import java.util.ArrayList;
import java.util.Comparator;

public class Address {
    String building_number, area, city;
    int zip_code;
    Address(String building_number, String area, String city, int zip_code){
        this.building_number = building_number;
        this.area = area;
        this.city = city;
        this.zip_code = zip_code;
    }
    int getZip_code(){
        return zip_code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "building_number='" + building_number + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", zip_code=" + zip_code +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
//Task 1: Create an empty Arraylist of Address type

        ArrayList<Address> list = new ArrayList<>();

/*
Task 2: Add the following objects in the Arraylist
"19/A","Dhanmondi","Dhaka",1209
"2/A","Tejgaon","Dhaka",1215
"65","Nirala","Khulna",9100
*/
        list.add(new Address("19/A", "Dhanmondi", "Dhaka", 1209));
        list.add(new Address("2/A", "Tejgaon", "Dhaka", 1215));
        list.add(new Address("65", "Nirala", "Khulna", 9100));

/*
Task 3: Add the below object at index 1 of the Arraylist
"215","Aamtola","Barishal",8200
*/
        list.add(1, new Address("215", "Aamtola", "Barishal", 8200));
/*
Task 4: Set the object at index 2 to
"36","Gulshan","Dhaka",1212
*/
        list.set(2, new Address("36", "Gulshan", "Dhaka", 1212));
/*
Sort the arraylist in, ascending order of zip codes using a
comparator for comparing objects of Address class [You can also
define the Comparator as a separate class if you want]
*/
        list.sort(new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
                return Integer.compare(o1.getZip_code(),o2.getZip_code());
            }
        });

   /*
Task 5: Delete the object at index 2
*/
       list.remove(2);




        //// to prove it works
        for (Address address : list) {
            System.out.println(address);
        }


    }

}


