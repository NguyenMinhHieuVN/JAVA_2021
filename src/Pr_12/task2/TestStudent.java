package Pr_12.task2;

import java.util.Scanner;

public class TestStudent {
    public static Scanner sc = new Scanner(System.in);

    public static void inputInfo(Student st) {
        System.out.print("Enter student ID: ");
        st.setIdNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter student's name: ");
        st.setName(sc.nextLine());
        System.out.print("Enter GPA scores: ");
        st.setGPA(sc.nextFloat());
        System.out.println("");
    }
    public static void main(String[] args) {
        Student[] stu = null;
        int n = 0;
        boolean flag = true;
        do {
            System.out.println("1. Input info student.");
            System.out.println("2. Sort students by GPA.");
            System.out.println("3. Search student in list");
            System.out.println("4. Export student list.");
            System.out.println("Enter another number to exit.");
            System.out.print("Please choose: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the number of students: ");
                    n = sc.nextInt();
                    stu = new Student[n];
                    for(int i=0; i<n; i++) {
                        System.out.println("Student " + (i+1) + ": ");
                        stu[i] = new Student();
                        inputInfo(stu[i]);
                    }
                    break;
                case 2:
                    SortingAndSearchStudent ste = new SortingAndSearchStudent();
                    ste.quickSort(stu, 0, n-1);
                    ste.reverse(stu, 0, n-1);
                    System.out.println("Sorted students by GPA.");
                    System.out.println();
                    break;
                case 3:
                    SortingAndSearchStudent st = new SortingAndSearchStudent();
                    System.out.print("Enter the name for search: ");
                    String name = sc.next();
                    System.out.println();
                    try {
                        System.out.println(st.search(stu, name).toString());
                    }
                    catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.printf("%-5s %15s %15s %15s \n", "ID", "Name", "GPA", "GPA(A-F)");
                    for (int i=0; i<stu.length; i++) {
                        stu[i].showInfo();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
