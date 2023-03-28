package creational.Prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();

        //Use the clone method to get the Employee object
        Employees empNew = (Employees) emp.clone();
        Employees empNew1 = (Employees) emp.clone();
        List<String> list = empNew.getEmpList();
        list.add("John");
        List<String> list1 = empNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emp.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
