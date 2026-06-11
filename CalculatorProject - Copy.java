import java.util.Scanner;

public class CalculatorProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("      JAVA CALCULATOR");
            System.out.println("================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. Maximum");
            System.out.println("11. Minimum");
            System.out.println("12. Percentage");
            System.out.println("13. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            double num1, num2, result;

            switch (choice) {

                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.println("Addition = " + result);
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;

                    System.out.println("Subtraction = " + result);
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;

                    System.out.println("Multiplication = " + result);
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    if (num2 == 0) {
                        System.out.println("Cannot Divide By Zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Division = " + result);
                    }
                    break;

                case 5:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 % num2;

                    System.out.println("Modulus = " + result);
                    break;

                case 6:
                    System.out.print("Enter Base Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Power: ");
                    num2 = sc.nextDouble();

                    result = Math.pow(num1, num2);

                    System.out.println("Power = " + result);
                    break;

                case 7:
                    System.out.print("Enter Number: ");
                    num1 = sc.nextDouble();

                    result = num1 * num1;

                    System.out.println("Square = " + result);
                    break;

                    case 8:
                      System.out.print("Enter Number: ");
                      num1 = sc.nextDouble();

                      result = num1 * num1 * num1;

                      System.out.println("Cube = " + result);
                      break;

                      case 9:
                        System.out.print("Enter Number: ");
                        num1 = sc.nextDouble();

                        if (num1 < 0) {
                            System.out.println("Cannot Calculate Square Root of Negative Number");
                        } else {
                            result = Math.sqrt(num1);
                            System.out.println("Square Root = " + result);
                        }
                        break;
                        case 10:
                            System.out.print("Enter First Number: ");
                            num1 = sc.nextDouble();

                            System.out.print("Enter Second Number: ");
                            num2 = sc.nextDouble();

                            result = Math.max(num1, num2);

                            System.out.println("Maximum = " + result);
                            break;

                            case 11:
                                System.out.print("Enter First Number: ");
                                num1 = sc.nextDouble();

                                System.out.print("Enter Second Number: ");
                                num2 = sc.nextDouble();

                                result = Math.min(num1, num2);

                                System.out.println("Minimum = " + result);
                                break;

                                case 12:
                                    System.out.print("Enter Total Marks: ");
                                    num1 = sc.nextDouble();

                                    System.out.print("Enter Obtained Marks: ");
                                    num2 = sc.nextDouble();

                                    if (num1 == 0) {
                                        System.out.println("Total Marks Cannot Be Zero");
                                    } else {
                                        result = (num2 / num1) * 100;
                                        System.out.println("Percentage = " + result + "%");
                                    }
                                    break;

                                    case 13:
                                        System.out.println("Exiting Calculator. Goodbye!");
                                        break;

                                        default:
                                            System.out.println("Invalid Choice. Please Try Again.");
                                  }  
                                } while (choice != 13);
                                  sc.close();
                                }
                              }

                                  