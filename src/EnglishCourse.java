public class EnglishCourse extends Course {
    public Course course;
    public EnglishCourse(String id, String studentName, String teacherName) {
        super(id, studentName, teacherName);
    }
    public EnglishCourse(Course course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "EnglishCourse{" + " id " + course.getId() + " student name: " + course.getStudentName() + " teacher name: "
                + course.getTeacherName() +
                "}";

    }



    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
