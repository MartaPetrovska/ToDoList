import java.util.Scanner;

public class Main { //Is the UI - frontend

    public static TaskManager taskManager = new TaskManager();
    public static void main(String[] args) {
        createTask();
        showTodoList();
    }

    public static void createTask(){
        Scanner scanner = new Scanner(System.in);
        // Input the task name
        System.out.println("Please input the name of the task");
        var name = scanner.nextLine();
        // Input the task description
        System.out.println("Please input the description of the task");
        var description = scanner.nextLine();
        scanner.close();
        var task = new Task(name, description);
        taskManager.addTask(task);
    }

  public static void showTodoList(){
      var tasks = taskManager.getTasks();
      for(var task : tasks){
          System.out.println("This is a TASK");
          System.out.println(task.name);
          System.out.println(task.description);
          System.out.println(task.isDone);
      }
  }
}
