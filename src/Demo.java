import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số từ 2 đến 8");
//        int num = Integer.parseInt(scanner.nextLine());
//        switch (num)
//        {
//            case 2:
//                System.out.println("Thứ 2");
//                break;
//            case 3:
//                System.out.println("Thứ 3");
//                break;
//            case 4:
//                System.out.println("Thứ 4");
//                break;
//            case 5:
//                System.out.println("Thứ 5");
//                break;
//            case 6:
//                System.out.println("Thứ 7");
//                break;
//            case 8:
//                System.out.println("Chủ nhật");
//                break;
//            default:
//                break;
//        }
        System.out.println("Nhập nguyên âm hoặc phụ âm");
        char input = scanner.nextLine().charAt(0);
        switch (input)
        {
            case 'a', 'i', 'u', 'e', 'o':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
