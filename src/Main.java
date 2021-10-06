
public class Main {

    public static void main(String[] args) {


        Car myCar = new Sunroof(new Automatic(new BasicCar()));

        System.out.println(myCar.getDescription());
        System.out.println(myCar.getCost());


        Car myNewCar = new BasicCar();
        myNewCar = new V8Engine(myNewCar);

        System.out.println("With " + myNewCar.getDescription() + " my new car will cost " + myNewCar.getCost());


    }

}
