public class Main {
    public static void main(String[] args) {
        Course course=new Course("Id2005","Asan","Aidana");
        EnglishCourse englishCourse=new EnglishCourse(course);
        Course course2=new Course("Id2005","Aibek","Meder,Timur");
        ItCourse itCourse=new ItCourse(course2);
        System.out.println(englishCourse);
        System.out.println(itCourse);
    }
}