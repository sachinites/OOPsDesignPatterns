import java.util.*;

public class Wife{
    private String wifeName;
    private String complexion;
    private int weight;
    private String education;
    private ArrayList<Decorators> decorators;

    Wife(String wifeName, String complexion, int weight, String education){
        this.wifeName = wifeName;
        this.complexion = complexion;
        this.weight = weight;
        this.education = education;
        decorators = new ArrayList<Decorators>();
    }

    public void setwifename(String wifename){
        this.wifeName = wifename;
    }

    public void setComplexion(String complexion){
        this.complexion = complexion;
    }

    public void setWeight(int  weight){
        this.weight = weight;
    }

    public void setEducation(String education){
        this.education = education;
    }

    public String getComplexion(){
        return complexion;
    }

    public int getWeight(){
        return weight;
    }

    public String getEducation(){
        return  education;
    }

    public String getwifename(){
        return wifeName;
    }

    public void addDecorator(Decorators d){
        decorators.add(d);
    }
    public void removeDecorator(Decorators d){
        decorators.remove(d);
    }

    public static void printWifeAttributes(Wife wife){
        System.out.println("\n==============================");
        System.out.println("Name           =  " + wife.getwifename());
        System.out.println("Complexion     =  " + wife.getComplexion());
        System.out.println("Weight         =  " + wife.getWeight());
        System.out.println("Education      =  " + wife.getEducation());
        System.out.println("DecoratorList : \n");
        for(int i = 0 ;i < wife.decorators.size(); i++){
            System.out.println("    Decorator " + i + " " + wife.decorators.get(i).getDecoratorName()+ " , Cost = " +
            wife.decorators.get(i).getDecoratorCost());
        }
    }
}

