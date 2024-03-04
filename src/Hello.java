import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        String fullName2 = "ABC";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String fullName = scanner.nextLine();
        System.out.println(fullName);
        int age = scanner.nextInt();
        boolean sex = Boolean.parseBoolean(scanner.nextLine());
        if (age > 18)
        {
            System.out.println("Ok");
        }
    }
}
