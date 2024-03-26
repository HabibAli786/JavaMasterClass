public class callEmployee {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "29/05/1999", "01/03/2022");
        SalariedEmployee joe = new SalariedEmployee("Joe", "29/05/1999", "01/03/2022", 35000);

        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("Pay = " + tim);


        System.out.println("Age = " + joe.getAge());
        System.out.println("Joe Paycheck = " + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/09/1999", "03/02/2021", 20);

        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());

    }
}
