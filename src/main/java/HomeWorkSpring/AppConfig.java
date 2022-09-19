package HomeWorkSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan
public class AppConfig {
//    @Bean (name = "patientCard")
//    public PatientCard patientCard(){
//        PatientCard patientCard=new PatientCard();
//        return patientCard;
//    }
//
//    @Bean (name = "buildingPlanRequest")
//    public BuildingPlanRequest buildingPlanRequest(){
//        BuildingPlanRequest buildingPlanRequest=new  BuildingPlanRequest();
//        return buildingPlanRequest;
//    }
//
//    @Bean (name = "buildingPlan")
//    public  BuildingPlan buildingPlan(){
//        BuildingPlan buildingPlan=new BuildingPlan();
//        return buildingPlan;
//    }
//
//    @Bean (name="timeTableRequest")
//    public TimeTableRequest timeTableRequest(){
//        TimeTableRequest timeTableRequest=new TimeTableRequest();
//        return timeTableRequest;
//    }
//    @Bean (name = "doctorCard")
//    public DoctorCard doctorCard(){
//        DoctorCard doctorCard=new DoctorCard();
//        return doctorCard;
//    }
//
//    @Bean (name = "timeTable")
//    public  TimeTable timeTable (){
//        TimeTable timeTable=new TimeTable();
//        timeTable.setTimeTable(doctorCard());
//        return timeTable;
//    }
//    @Bean (name = "archive")
//    public Archive archive(){
//        Archive archive = new Archive();
//        archive.setPatientCard(patientCard());
//        return archive;
//    }
//
//    @Bean(name="registry")
//    public Registry registry(){
//        Registry registry=new Registry();
//        registry.setConnectArchiveToRegistry(archive());
//        registry.setConnectTimeTableToRegistry(timeTable(),timeTableRequest());
//        registry.setConnectBuildingPlan(buildingPlan(),buildingPlanRequest());
//        return registry;
//    }
//    @Bean (name = "patient")
//    public Patient patient(){
//        return new Patient();
//    }
//
}
