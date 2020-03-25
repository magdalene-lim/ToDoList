import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask (Task task) {
		//Add code here
		tasks.put(task.getDescription(), task);
	}
	public void completeTask(String description) {
		// Add code here   aaaaa
	}
	public boolean getStatus(String description) {
		//Add code here
		return false;
	}
	public Task getTask(String description) {
		// Add code here
		return null;
	}
	public Task removeTask(String description) {
		// Add code here
		Task t = tasks.get(description);
		tasks.remove(description);
		return t;
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();

	}
	public Collection<Task> getCompletedTasks() {
		// Add code here
		return null;
	}
}
