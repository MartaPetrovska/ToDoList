import java.util.ArrayList;

public class TaskManager{
  //MVP: Minimum Viable Product
  //Be able to add a Task
  //Have a list of all the tasks
  //Set a task as done, by Task name

  private ArrayList<Task> tasks = new ArrayList<Task>();

  //Because we want to use the default construcor
  // new TaskManager() - we don't need to add a custom constructor

  public void addTask(Task task){
    tasks.add(task);
  }

  public ArrayList<Task> getTasks(){ // this is called a getter (using because ArrayList is private, which means that other classes can't mess with the data. )
    return tasks;
  }

  //BONUS:
  //Get a random quote to stop procrastinating
  //A list of undone tasks - filter
  //A list of done tasks - filter
}
