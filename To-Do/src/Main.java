import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List[] allLists = new List[6];
        for(int i = 0; i < 6; i++){
            List indexList = new List(i);
            allLists[i] = indexList;
        }
        System.out.println("Hi, this is the To-Do list manager.");
        Scanner getKeyboard = new Scanner(System.in);
        boolean validInput = false;
        int selectedList = 0;
        while(true){
            while(!validInput){
                try{
                    System.out.println("Select the day of the week. Please use numbers, starting from 0 (Sunday): ");
                    selectedList = getKeyboard.nextInt();
                    allLists[selectedList].getWeekDayName();
                    validInput = true;
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Error. Please enter a valid a day.");
                    getKeyboard.nextLine();
                }
            }
            validInput = false;
            int selectedOption = 4;
            while (selectedOption != 0){
                System.out.println("What you want to do with " + allLists[selectedList].getWeekDayName() + " tasks?");
                System.out.println("""
                    1. Add task\s
                    2. Remove task
                    3. List tasks
                    0. Previous menu""");
                selectedOption = getKeyboard.nextInt();
                getKeyboard.nextLine();
                switch(selectedOption){
                    case 1:
                        System.out.println("Nice! What task would you like to add?");
                        String taskToAdd = getKeyboard.nextLine();
                        allLists[selectedList].addTask(taskToAdd);
                        break;
                    case 2:
                        if(allLists[selectedList].getTasks().isEmpty()){
                            System.out.println("You have not tasks for " + allLists[selectedList].getWeekDayName() + " yet.");
                        }
                        else{
                            allLists[selectedList].getTasksToString();
                            System.out.println("What task did you want to remove?");
                            int taskToRemove = getKeyboard.nextInt();
                            allLists[selectedList].removeTask(taskToRemove);
                        }
                        break;
                    case 3:
                        if(allLists[selectedList].getTasks().isEmpty()){
                            System.out.println("You have not tasks for " + allLists[selectedList].getWeekDayName() + " yet.");
                        }
                        else{
                            allLists[selectedList].getTasksToString();
                        }
                        break;
                }
            }
        }

    }
}
