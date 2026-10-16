
public class Main {

    public static void main(String[] args) {

        int completedTopics = 17;
        int totalTopics = 20;
        int dailylearningHours = 3;
        int learningDays = 5;

        int remainingTopics = totalTopics - completedTopics;

        int weeklyLearningHours = dailylearningHours * learningDays;

        double progressPercentage = (double) completedTopics * 100 / totalTopics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);

    }
}
