class App{
    public static void main(String args[]){
        MallardDuck mallduck = new MallardDuck();
        System.out.println("printing properties of MallardDuck object \n");
        System.out.println("fly ? " + (mallduck.getDuckFly()) + "\n");
        System.out.println("Sound ? " + (mallduck.getDuckSound()).toString() + "\n");
        System.out.println("Color ? " + (mallduck.getDuckColor()).toString() + "\n");
        System.out.println("who am i ? " + mallduck.who_am_i() + "\n");
        Duck genDuck = (Duck) mallduck;
        System.out.println("who am i ? " + genDuck.who_am_i() + "\n");
    }
}
