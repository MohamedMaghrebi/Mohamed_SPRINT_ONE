
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mohamed"));
        users.add(new User("Amine"));
        users.add(new User("Kate"));
        users.add(new User("Victoria"));

        users.get(0).addTask("Organize work management systems");
        users.get(0).addTask("Conduct impactful workshops");

        users.get(1).addTask("Drive stakeholder engagement");
        users.get(1).addTask("Cohesive decision-making processes");

        users.get(2).addTask("Develop Vodafone TV and Internet products");
        users.get(2).addTask("Enhance Wireless Smart Home solutions");

        users.get(3).addTask("Implement cloud and security measures");
        users.get(3).addTask("Improve 5G network coverage");

        // Marking tasks as completed
        users.get(0).markTaskAsCompleted("Organize work management systems");
        users.get(2).markTaskAsCompleted("Develop Vodafone TV and Internet products");

        printUsers(users);
    }
     public static void printUsers(List<User> list){
             for (User user : list) {
                 user.printAllTasks();
                 System.out.println();
             }
     }
}