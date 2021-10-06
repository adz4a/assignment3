public abstract class CarDecorator implements Car {

    Car temporaryCar;

    public CarDecorator(Car temporaryCar) {
        this.temporaryCar = temporaryCar;
    }

    @Override
    public String getDescription() {
        return temporaryCar.getDescription();
    }

    @Override
    public double getCost() {
        return temporaryCar.getCost();
    }

}
