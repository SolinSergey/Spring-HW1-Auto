package HomeWorkSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component ("registry")
public class Registry{
    Archive archive;
    TimeTableRequest timeTableRequest;
    TimeTable timeTable;

    BuildingPlan buildingPlan;
    BuildingPlanRequest buildingPlanRequest;

    public Registry() {
        System.out.println("Создана регистратура");
    }

    @Autowired
    public void setConnectArchiveToRegistry(Archive archive){
        this.archive=archive;
    }

    @Autowired
    public void setConnectTimeTableToRegistry(TimeTable timeTable,TimeTableRequest timeTableRequest){
        this.timeTableRequest=timeTableRequest;
        this.timeTable=timeTable;
    }
    @Autowired
    public void setConnectBuildingPlan(BuildingPlan buildingPlan,BuildingPlanRequest buildingPlanRequest){
        this.buildingPlanRequest=buildingPlanRequest;
        this.buildingPlan=buildingPlan;

    }

    public void setRequestFromPatient(Patient patient) {
        patient.setFirstName("Николай");
        patient.setLastName("Басков");
        patient.setRequest("Голос стал козлиным");
        archive.setPatientRequest(patient);
        System.out.println(archive.getPatientCard().toString());
        Date currentDate = new Date();
        timeTableRequest.currentDate=currentDate;
        timeTableRequest.profile="Терапевт";
        timeTable.setDoctorRequest(timeTableRequest);
        DoctorCard doctorCard= timeTable.getDoctorCard();
        System.out.println(doctorCard.toString());
        buildingPlanRequest.numberCabinets=doctorCard.getNumberCabinet();
        buildingPlan.setBuildingPlanPosition(buildingPlanRequest);
        System.out.println("Пациенту необходимо пройти в кабинет №"+doctorCard.getNumberCabinet()
                +", который расположен на "+buildingPlan.getFloor()+" этаже");
    }
}
