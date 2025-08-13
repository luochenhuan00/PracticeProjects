import java.util.*;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            System.out.print("——————请选择你要进行的操作——————\n1:录入信息\n2:查询信息\n其他:退出\n\n你的选择是：");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("请输入学生id：");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("请输入学生姓名：");
                    String name = sc.nextLine();
                    System.out.print("请输入学生性别：");
                    String gender = sc.nextLine();
                    System.out.print("请输入学生年龄：");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("请输入成绩：");
                    double grade = sc.nextDouble();
                    sc.nextLine();
                    Student student = new Student(name, age, gender, id, grade);
                    students.add(student);
                    System.out.println("录入成功！");
                    break;
                case 2:
                    System.out.println("请输入你要查询的id：");
                    boolean isFind = false;
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    for (int i = students.size() - 1; i >= 0; i--) {
                        Student S = students.get(i);
                        if (S.getId() == id2) {
                            System.out.println(S.getInfo());
                            isFind = true;
                            while (true) {
                                System.out.println("——————请选择你要进行的操作——————\n1:删除该学生\n2:返回上一级菜单");
                                int choice2 = sc.nextInt();
                                sc.nextLine();
                                switch (choice2) {
                                    case 1:
                                        students.remove(i); // 直接通过索引删除
                                        System.out.println("删除成功！");
                                        break;
                                    case 2:
                                        break;
                                }
                                break;
                            }
                        }
                    }
                    if (!isFind) {
                        System.out.println("未找到该学生！");
                    }
                    break;
                default:
                    System.out.println("已退出");
                    return;
            }
        }
    }
}
