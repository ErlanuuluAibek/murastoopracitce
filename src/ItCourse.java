public class ItCourse extends Course {
    public Course course;
    public ItCourse(String id, String studentName, String teacherName) {
        super(id, studentName, teacherName);
    }
  public ItCourse(){

  }
  public ItCourse (Course course){
        this.course=course;
  }


    @Override
    public String toString() {
        return "ItCourse{" + " id: " +course.getId() + " student name: " + course.getStudentName() + " teacher name: " + course.getTeacherName() +
                "}";
    }





    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
