package vn.edu.iuh.fit.dhktpm17a.observerdesignpattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Class implements Subject {
    private String ClassId;
    private String ClassName;
    private List<Observer> students;

    public Class (String ClasName){
        this.ClassName = ClasName;
        this.students = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : students) {
            observer.update(message);
        }
    }

    public void sendAnnouncement(String message) {
        System.out.println("Lớp trưởng gửi thông báo: " + message);
        notifyObservers(message);
    }
}
