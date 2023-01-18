public class Course {
    private String id;
    private String studentName;
    private String teacherName;


    public Course(String id, String studentName, String teacherName) {
        this.id = id;
        this.studentName = studentName;
        this.teacherName = teacherName;
    }
    public Course(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
