package HomeWorkSpring;

import org.springframework.stereotype.Component;

@Component ("doctorCard")
public class DoctorCard {
    private String firstName;
    private  String lastName;
    private int numberCabinet;

    private String profile;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getNumberCabinet() {
        return numberCabinet;
    }

    public void setNumberCabinet(int numberCabinet) {
        this.numberCabinet = numberCabinet;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Кабинет " + numberCabinet;
    }
}
