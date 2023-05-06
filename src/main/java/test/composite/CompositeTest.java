package test.composite;

public class CompositeTest {

    public static void main(String[] args) {
        Employee CEO = new Employee("num1","CEO",3000);

        Employee headSales = new Employee("jack","lev2",2000);
        Employee headMarket = new Employee("tom","lev2",2000);

        Employee clerk1 = new Employee("marin","lev3",1000);
        Employee clerk2 = new Employee("tony","lev3",1000);

        CEO.add(headSales);
        CEO.add(headMarket);

        headSales.add(clerk1);
        headMarket.add(clerk2);


        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }


}
