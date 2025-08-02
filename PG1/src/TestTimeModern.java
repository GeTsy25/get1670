public class TestTimeModern {
    public static void main(String[] args) {
        TimeModern t1 = new TimeModern(23, 59, 59);
        System.out.println("Start Time: " + t1);
        // Test nextSecond()
        TimeModern t2 = t1.nextSecond();
        System.out.println("After adding 1 second: " + t2);    // 00
        TimeModern t3 = t2.nextSecond().nextSecond();
        System.out.println("After adding 2 more seconds (with chaining): " + t3);
        // Test setters and getters
        System.out.println("Hour is: " + t3.getHour());
        System.out.println("Minute is: " + t3.getMinute());
        System.out.println("Second is: " + t3.getSecond());
        // Test withTime()
        TimeModern t4 = t3.withTime(7, 30, 15);
        System.out.println("New time set via withTime(): " + t4); //
    }
}
