import java.util.*;

public class CompareObject implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        if(e1.empId<e2.empId)
            return 1;
        else if(e1.empId > e2.empId)
            return -1;
        else
            return 0;
    }


    public static void main(String args[]){
        List<Employee> emp = new ArrayList();
        Employee e1 = new Employee(12,"Vinesh");
        Employee e2 = new Employee(1,"Vinay");
        Employee e3 = new Employee(13,"Vin");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);


        Collections.sort(emp,new CompareObject());
        Iterator<Employee> itr = emp.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class Employee{
    int empId;
    String name;
    public Employee(int empId,String name){
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString()
    {

        return this.empId + " " + this.name ;
    }
}
