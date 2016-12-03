/*
+---------------------------------------------------------------------------------------------------+
|     For Singleton class, Constructors are private, so this class cannot be inherited              |
|   In order to make this class inheritable, make the Constructor public and adopt some             |
|   alternative means to make this class Singleton                                                  |
|                                                                                                   |
|                                                                                                   |
|   This Implementation is Thread safe as the class is loaded before any thread can get access      |
|   to static method. Using synchronized keyword is also avoided which could lead to performance    |
|   issues                                                                                          |
+---------------------------------------------------------------------------------------------------+ 
*/                                                                                                   
                                                                                                     
class Singleton{                                                                                     
    /*Create the class instance at the load time itself*/
    public static Singleton singletonInstance = new Singleton();
    private Singleton(){
            System.out.println("Singleton Constructor called");
        }

    /* class is loaded as soon any static method is called using clasname*/
     public static Singleton getInstance(){
        return singletonInstance;
     }

     public  void isInstanceAlive(){
         System.out.println("Singleton instance is alive");
     }

}
