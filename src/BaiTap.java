import java.util.Scanner;

public class BaiTap
{
    public static void main(String[] args)
    {
        CheckDivisible();
    }

    //Bài 1
    static void Hello()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        System.out.println("Xin chào " + scanner.nextLine());
    }

    //Bài 2
    static void CurrencyRate()
    {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số tiền USD ");
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("Đổi sang VND là " + (input * rate));
    }

    //Bài 3
    //Cách 2: Nối chuỗi
    //Tách ra 3 số hàng trăm, hàng chục, hàng đơn vị
    //Tạo chuỗi rỗng
    //switch(hangTram) => stringBanDau += "case hangTram"
    //switch(hangChuc) => stringBanDau += "case hangChuc"
    //switch(hangDonVi) => stringBanDau += "case hangDonVi"
    //=> print stringBanDau
    static void NumToText()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer that has at max 3 digits");
        int input = Integer.parseInt(scanner.nextLine());
        int hundreds = input / 100;
        System.out.println("Hundred " + hundreds);
        int tens = input % 100 / 10;
        System.out.println("Tens " + hundreds);
        int ones = input % 10;
        System.out.println("Ones " + hundreds);

        if (input >= 10 && input < 20)//Check if input is in between 10 and 20 => Special reading
        {
            switch (input)
            {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Forteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else//If not in between 10 and 20 => Has the same reading pattern
        {
            switch (hundreds)//Check the digit at hundreds unit
            {
                case 0://If hundreds == 0 => Two or one digits number
                    switch (tens)//Check tens unit digit
                    {
                        case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                        {
                            System.out.println(TensToText(tens) + " " + OnesToText(ones));
                            break;
                        }
                        default://Tens == 0 => One digit number
                            System.out.println(OnesToText(ones));
                            break;
                    }
                    break;
                case 1:
                    System.out.println("One hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 2:
                    System.out.println("Two hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 3:
                    System.out.println("Three hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 4:
                    System.out.println("Four hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 5:
                    System.out.println("Five hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 6:
                    System.out.println("Six hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 7:
                    System.out.println("Seven hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 8:
                    System.out.println("Eight hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
                case 9:
                    System.out.println("Nine hunderd " + TensToText(tens) + " " + OnesToText(ones));
                    break;
            }
        }
    }

    static String TensToText(int num)
    {
        switch (num)
        {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    static String OnesToText(int num)
    {
        return switch (num)
        {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }

    //Bài 4
    static void CalcPeriArea()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Chu vi là " + (a + b * 2));
        System.out.println("Diện tích là " + (a * b));
    }

    //Bài 5
    static void CalcAverageMark()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        float math = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm Lý");
        float physics = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm Hóa");
        float chemistry = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm Văn");
        float literature = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập điểm Anh");
        float english = Float.parseFloat(scanner.nextLine());
        float average = (math + physics + chemistry + literature + english) / 5;
        System.out.println("Điểm trung bình: " + average);
        if (average >= 0 && average < 5)
        {
            System.out.println("Yếu");
        } else if (5 <= average && average < 6.5)
        {
            System.out.println("Trung bình");
        } else if (6.5 <= average && average < 8)
        {
            System.out.println("Khá");
        } else if (8 <= average && average < 9)
        {
            System.out.println("Giỏi");
        } else
        {
            System.out.println("Xuất sắc");
        }
    }

    //Bài 6
    static void CheckDivisible()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số để kiểm tra có chia hết cho 3 và 5 không");
        int input = Integer.parseInt(scanner.nextLine());
        if (input % 5 == 0 && input % 3 == 0)
        {
            System.out.println("Số này chia hết cho cả 3 và 5");
        } else if (input % 5 == 0 && input % 3 != 0)
        {
            System.out.println("Số này chia hết cho 5 nhưng không chia hết cho 3");
        } else if (input % 3 == 0 && input % 5 != 0)
        {
            System.out.println("Số này chia hết cho 3 nhưng không chia hết cho 5");
        } else System.out.println("Số này không chia hết cho cả 3 và 5");
    }

    //Bai 7
    static void ReadNumToText()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số từ 0 đến 9");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num)
        {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                break;
        }
    }
}
