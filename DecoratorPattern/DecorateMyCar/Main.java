class Main{
    public static void main(String args[]){
        Car mycar = new CustomizedCar("Red", "Ambassador");
        HeadLights HL1 = new HeadLights("HeadLights1", 250);
        mycar = HL1.attachComponnet(mycar);
        HeadLights HL2 = new HeadLights("HeadLights2", 350);
        mycar = HL2.attachComponnet(mycar);
        SteeringWheel sw1 = new SteeringWheel("SteeringWheel1", 2500);
        mycar = sw1.attachComponnet(mycar);
        Stereo stero = new Stereo("Stereo", 9500);
        mycar = stero.attachComponnet(mycar);
        System.out.println("CustomizedCar Cost = " + CustomizedCar.getCost(mycar));
    }

}
