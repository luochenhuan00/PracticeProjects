public class Student {
    private String name;
    private int age;
    private String gender;
    private int id;
    private double grade;

    public Student(String name, int age, String gender, int id, double grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getAver() {
        return grade / 2;
    }

    public String getInfo() {
        //使用姓名： 年龄：性别：学号：成绩：的格式输出
        return "姓名：" + name + " 年龄：" + age + " 性别：" + gender + " 学号：" + id + " 成绩：" + grade;
    }
}
