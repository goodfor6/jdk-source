package test2.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Employee leader = new Employee("market","zhangSan");
        Employee employee = new Employee("market","liSi");
        Employee employee1 = new Employee("development","jack");
        leader.add(employee);
        leader.add(employee1);

        System.out.println(leader);
        for(Employee e:leader.getSubordinates()){
            System.out.println(e);
        }
    }
}
