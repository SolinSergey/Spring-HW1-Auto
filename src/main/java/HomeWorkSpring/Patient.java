package HomeWorkSpring;

import org.springframework.stereotype.Component;

@Component ("patient")
public class Patient {
    private String firstName;
    private String lastName;
    private String request;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRequest() {
        return request;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}

