public class Cars {
    String name;
    String color;
    float maxSpeed;
    int numberOfGears;
    public Cars(String name,String color,float maxSpeed,int numberOfGears){
        this.name=name;
        this.color=color;
        this.maxSpeed=maxSpeed;
        this.numberOfGears=numberOfGears;

    }
    public static void main(String []args){
        Cars bmw=new Cars("ABC","Black",180.65f,5);
        bmw.getVehicleDetails(bmw);
        Cars tata=new Cars("XYZ","BLue",110.54f,5);
        tata.getVehicleDetails(tata);

    }
public void getVehicleDetails(Cars car){
    System.out.println("name of the car is "+car.name);
    System.out.println("color is "+ car.color);
    System.out.println("Max speed is "+car.maxSpeed);
    System.out.println("Number of Gear of the car" +car.numberOfGears);
    System.out.println("--------------------------------------");
}

    }
