import scala.collection.mutable.PriorityQueue

// Define a case class to represent a task
case class Task(name: String, description: String, priority: Int)

object TaskPrioritization {
  def main(args: Array[String]): Unit = {
    // Create an empty PriorityQueue for tasks
    val taskQueue = PriorityQueue.empty[Task](Ordering.by(_.priority))

    // Add tasks to the PriorityQueue
    taskQueue.enqueue(Task("Task 1", "Description 1", 3))
    taskQueue.enqueue(Task("Task 2", "Description 2", 1))
    taskQueue.enqueue(Task("Task 3", "Description 3", 2))

    // Dequeue and process tasks in order of priority
    while (taskQueue.nonEmpty) {
      val nextTask = taskQueue.dequeue()
      println(s"Processing Task: ${nextTask.name} (Priority: ${nextTask.priority})")
    }
  }
}
