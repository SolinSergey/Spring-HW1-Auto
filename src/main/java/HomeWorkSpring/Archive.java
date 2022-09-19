package HomeWorkSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component ("archive")
public class Archive {

    private PatientCard patientCard;
    Patient patient;

    public Archive() {
        System.out.println("Создали архив");
    }


    @Autowired
    public void setPatientCard(PatientCard patientCard){
        this.patientCard=patientCard;
    }


    public void setPatientRequest(Patient patient) {
        System.out.println("В архив поступил запрос от регистратуры на поиск карточки пациента: " + patient.getFirstName() + " " + patient.getLastName());
        this.patient = patient;
    }

    public PatientCard getPatientCard() {
        System.out.println("Карточка пациента отправлена в регистратуру");
        patientCard.setFirstName(patient.getFirstName());
        patientCard.setLastName(patient.getLastName());
        patientCard.setAddress("г. Магадан, ул. Колхозная, д.13");
        patientCard.setPhoneNumber("+74951234567");
        return this.patientCard;
    }
}
