class Main{
    public static void main(String args[]){
        Singleton singletonInstance = Singleton.getInstance(); // static variabled get loaded on first call to static
        singletonInstance.isInstanceAlive();
        singletonInstance = Singleton.getInstance(); // this will not load the static variables again
        singletonInstance.isInstanceAlive();
    }
}
