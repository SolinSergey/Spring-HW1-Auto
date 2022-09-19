package HomeWorkSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("buildingPlan")
public class BuildingPlan {

    public BuildingPlan() {
        System.out.println("Создали план здания");
    }

    int floor;

    public void setBuildingPlanPosition(BuildingPlanRequest buildingPlanRequest){
        this.floor=2;
    }
    public int getFloor(){
        return this.floor;
    }
}
