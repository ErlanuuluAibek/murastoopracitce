public class Main {
    public static void main(String[] args) {
        EnglishCourse englishCourse=new EnglishCourse("Id2005","Aibek","Aidana");
        Course course=new Course(englishCourse.getId(), englishCourse.getStudentName(), englishCourse.getTeacherName());
        ItCourse itCourse=new ItCourse("id205","Aibek","Meder,Timur");
        Course course2=new Course(itCourse.getId(), itCourse.getStudentName(), itCourse.getTeacherName());
        System.out.println(course);
        System.out.println(course2);
    }
}