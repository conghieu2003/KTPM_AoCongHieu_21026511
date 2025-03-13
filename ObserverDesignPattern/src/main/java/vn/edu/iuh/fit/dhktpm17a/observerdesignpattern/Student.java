package vn.edu.iuh.fit.dhktpm17a.observerdesignpattern;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Observer {

    private String StudentId;
    private String StudentName;
    private String Address;

    @Override
    public void update(String message) {
        System.out.println("Sinh viên " + StudentName + " (MSSV: " + StudentId + ") nhận thông báo: " + message);
    }
    public void showInfo() {
        System.out.println("Mã SV: " + StudentId + " | Tên: " + StudentName + " | Địa chỉ: " + Address);
    }
}
