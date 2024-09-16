 


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        System.out.println("Tick Test 1 Pretick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Tick Test 1 Posttick - " + tickTest1.getTime());
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        System.out.println("Tick Test 2 Pretick - " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("Tick Test 2 Posttick - " + tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        System.out.println("Tick Test 3 Pretick - " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("Tick Test 3 Posttick - " + tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        System.out.println("Tick Test 4 Pretick - " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("Tick Test 4 Posttick - " + tickTest4.getTime());
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        System.out.println("Tick Test 5 Pretick - " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("Tick Test 5 Posttick - " + tickTest5.getTime());
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test1Sec = new ClockDisplaySeconds();
        System.out.println("Sec Empty Con. Test - " + test1Sec.getTime());
        
        ClockDisplaySeconds test2Sec = new ClockDisplaySeconds(3,45,0);
        System.out.println("Sec 2 Arg. Con. Test - " + test2Sec.getTime());
        
        ClockDisplaySeconds tickTest1Sec = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Sec Tick Test 1 Pretick - " + tickTest1Sec.getTime());
        tickTest1Sec.timeTick();
        System.out.println("Sec Test 1 Posttick - " + tickTest1Sec.getTime());
        
        ClockDisplaySeconds tickTest2Sec = new ClockDisplaySeconds(1, 0, 59);
        System.out.println("Sec Tick Test 2 Pretick - " + tickTest2Sec.getTime());
        tickTest2Sec.timeTick();
        System.out.println("Sec Test 2 Posttick - " + tickTest2Sec.getTime());
        
        ClockDisplaySeconds tickTest3Sec = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Sec Tick Test 3 Pretick - " + tickTest3Sec.getTime());
        tickTest3Sec.timeTick();
        System.out.println("Sec Test 3 Posttick - " + tickTest3Sec.getTime());
        
        ClockDisplaySeconds tickTest4Sec = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Sec Tick Test 4 Pretick - " + tickTest4Sec.getTime());
        tickTest4Sec.timeTick();
        System.out.println("Sec Test 4 Posttick - " + tickTest4Sec.getTime());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour tickTest1AMPM = new ClockDisplay12Hour(15,32);
        System.out.println("AMPM Tick Test 1 Pretick - " + tickTest1AMPM.getTime());
        tickTest1AMPM.timeTick();
        System.out.println("AMPM Test 1 Posttick - " + tickTest1AMPM.getTime());
        
        ClockDisplay12Hour tickTest2AMPM = new ClockDisplay12Hour(22,59);
        System.out.println("AMPM Tick Test 2 Pretick - " + tickTest2AMPM.getTime());
        tickTest2AMPM.timeTick();
        System.out.println("AMPM Test 2 Posttick - " + tickTest2AMPM.getTime());
        
        ClockDisplay12Hour tickTest3AMPM = new ClockDisplay12Hour(11,59);
        System.out.println("AMPM Tick Test 3 Pretick - " + tickTest3AMPM.getTime());
        tickTest3AMPM.timeTick();
        System.out.println("AMPM Test 3 Posttick - " + tickTest3AMPM.getTime());
        
        ClockDisplay12Hour tickTest4AMPM = new ClockDisplay12Hour(23,59);
        System.out.println("AMPM Tick Test 4 Pretick - " + tickTest4AMPM.getTime());
        tickTest4AMPM.timeTick();
        System.out.println("AMPM Test 4 Posttick - " + tickTest4AMPM.getTime());
        
    }
}
