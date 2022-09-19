package HomeWorkSpring;

import HomeWorkSpring.TimeTableRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("timeTable")
public class TimeTable {
    DoctorCard doctorCard;

    public TimeTable() {
        System.out.println("Создана доска информации");
    }


    @Autowired
    public void setTimeTable (DoctorCard doctorCard){
        this.doctorCard=doctorCard;
    }


    public void setDoctorRequest (TimeTableRequest timeTableRequest){
        System.out.println("Запрошена информация о враче и о том, где он принимает");
        doctorCard.setProfile(timeTableRequest.profile);
        doctorCard.setFirstName("Учкудук");
        doctorCard.setLastName("Мерзкий");
        doctorCard.setNumberCabinet(213);
    }
    public DoctorCard getDoctorCard (){
        return doctorCard;
    }
}
