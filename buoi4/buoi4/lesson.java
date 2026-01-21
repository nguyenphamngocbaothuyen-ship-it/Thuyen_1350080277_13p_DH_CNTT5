

public class lesson {
public static void Main(String[] args) {
//Bai Circle
    Circle cir = new Circle(2.0, "green");
    cir.display();
//Bai Rectangle
    Rectangle rect = new Rectangle(3, 4);
    rect.display();
//Bai Emloyee
    Employee emp = new Employee(1350080034, "Dung", "Nguyen The", 50000);
    emp.display();
//Bai Acount
    Account acc1 = new Account("12345A", "A", 2000);
    Account acc2 = new Account("6789B", "B", 500);

    acc1.display();
    acc2.display();

    acc1.transferTo(acc2, 200);

    System.out.println("=======================");
    acc1.display();
    acc2.display();
//Bai Date
    Date date = new Date(16, 2, 2025);
    System.out.println("Date: " + date.toString());
    System.out.println("co phai la nam nhuan: " + date.isLeapYear());
    }
}

