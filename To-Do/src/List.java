import java.util.ArrayList;
public class List{
    protected String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    protected int weekDay;
    protected ArrayList<String> tasks = new ArrayList<String>();
    protected String weekDayName;

    public String getWeekDayName() {
        return weekDayName;
    }

    public void setWeekDayName(String weekDayName) {
        this.weekDayName = weekDayName;
    }

    public void addTask(String taskToAdd){
        tasks.add(taskToAdd);
        System.out.println("Cool! " + taskToAdd + " added to " + this.getWeekDayName() + " To-Do list!");
    }
    public void removeTask(int taskToRemove){
        System.out.println("Cool! " + this.getTasks().get(taskToRemove) + " removed from " + this.getWeekDayName() + " To-Do list!");
        tasks.remove(taskToRemove);
    }
    public int getWeekDay(){
        return weekDay;
    }
    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }
    public ArrayList<String> getTasks() {
        return tasks;
    }
    public void getTasksToString(){
        System.out.println("Well. These are your tasks: ");
        for(int i = 0; i < this.getTasks().size(); i++){
            System.out.println("\t" + i + ". " + this.getTasks().get(i));
        }
    }
    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }
    public List(int weekDay){
        this.weekDay = weekDay;
        this.weekDayName = weekDays[weekDay];
    }
}