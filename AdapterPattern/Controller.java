import java.util.*;
class Controller{
    class Composite{
        HomeEntities homeEntity;
        HomeApplianceAction homeApplianceAction;
        Composite(HomeEntities homeEntity, HomeApplianceAction homeApplianceAction){
            this.homeEntity = homeEntity;
            this.homeApplianceAction = homeApplianceAction;
        }
    };

    ArrayList<Composite> operationSeq = new ArrayList<Composite>();
    Controller(){}
    public void performAction(HomeEntities homeEntity, HomeApplianceAction homeApplianceAction){
        homeEntity.execute(homeApplianceAction);
        Composite composite = new Composite(homeEntity, homeApplianceAction);
        operationSeq.add(composite);
    }

    public void printOperationSequence(){
        for(int i = 0 ; i < operationSeq.size(); i++){
            System.out.println(i + ". " + operationSeq.get(i).homeEntity.getClassName() + " , Action = " +
            operationSeq.get(i).homeApplianceAction);
        }
    }
}
