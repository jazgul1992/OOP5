import controller.Controller;

public class Main {
    public static void main(String[] args) {

    }

    {
        Controller controller = new Controller();
        
        controller.createStudent("Sagynov", "Mirbek", "Ulanbekovich", "10.08.1989");
        controller.createStudent("Sagaliev", "Daniel", "Nurlanovich", "02.03.1998");
        controller.createStudent("Kasymbekov", "Azimbek", "Alybekovich", "06.08.1988");
        controller.createStudent("Aliev", "Eldiyar", "Chynarbekovich", "15.03.2003");

        controller.createTeacher("Kasymova", "Gulya", "Edilovna", "30.01.1980");

        controller.createStudyGroup(controller.getTeacherById(1), controller.getStudentList());
        controller.printStudyGroup();


    }
}
