public class Pojo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(
                    "0000" + i,
                    switch (i) {
                        case 1 -> "Sam";
                        case 2 -> "Max";
                        case 3 -> "Tom";
                        case 4 -> "Poppy";
                        case 5 -> "Timmy";
                        default -> "Unknown";
                    },
                    "29/05/1999",
                    "Science");

            System.out.println(s);
        }

        PojoStudent pojoStudent = new PojoStudent("2", "Pojo", "29/05/1999", "Maths");
        LPAStudent lpaStudent = new LPAStudent("3", "LPA", "23/05/1999", "English");

        System.out.println(pojoStudent);
        System.out.println(lpaStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP Exam 829");
//        Cannot mutate a record
//        lpaStudent.setClassList(lpaStudent.classList() + ", JAVA OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(lpaStudent.name() + " is taking " + lpaStudent.classList());


    }
}
