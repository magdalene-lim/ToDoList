
import java.util.Collection;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.*;

public class ToDoListTest extends TestCase {
	// Define Test Fixtures
	private ToDoList tdList = new ToDoList();

	public ToDoListTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// Initialise Test Fixtures
	}

	@After
	public void tearDown() throws Exception {
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
//		fail("Not implemented yet");

		Task t = new Task("Buy Milk");
		tdList.addTask(t);
		Assert.assertTrue(tdList.getAllTasks().contains(t));
		tdList.removeTask(t.getDescription());

		// System.out.println(tdList.getAllTasks());
	}

	@Test
	public void testgetStatus() {
		// fail("Not implemented yet");
	}

	@Test
	public void testRemoveTask() {
		//fail("Not implemented yet");
		
		Task t = new Task("Buy Milk");		
		tdList.addTask(t);
		Assert.assertTrue(tdList.getAllTasks().contains(t));
		System.out.println(tdList.getAllTasks());
		
		
		tdList.removeTask(t.getDescription());
		Assert.assertFalse(tdList.getAllTasks().contains(t));	

		
		tdList.removeTask(t.getDescription());
		System.out.println(tdList.getAllTasks());
		
//		try {
//			tdList.removeTask(t.getDescription());
//			//fail();
//		}catch(IndexOutOfBoundsException e) 
//		{}
		
		
	}

	@Test
	public void testGetCompletedTasks() {
		// fail("Not implemented yet");
	}
}
