/* This assigment must use all of the following files:

1. StackQueueTesterRunner.java -- Your runner should create StackQueueTester and RingBuffer objects and THOROUGHLY TEST THEM BOTH

2. QueueList.java -- you will write this
3. RingBuffer.java -- you will write this
4. StackList.java -- you will write this
5. StackQueueTester -- you will write this to test StackList and QueueList
*/
class StackQueueTesterRunner 
{
    public static void main(String[] args)
    {
        StackQueueTester deku = new StackQueueTester();
        QueueList<String> hellaMoney = new QueueList<>();
        hellaMoney.add("i");
        hellaMoney.add("got");
        hellaMoney.add("like");
        hellaMoney.add("hella");
        hellaMoney.add("money");
        
        QueueList<String> pbjthelongway = deku.longestWords(hellaMoney);
        //deku.removeName(hellaMoney, "like");
        
        System.out.println(deku.stringDump(pbjthelongway));

        StackQueueTester bakugo = new StackQueueTester();
        StackList<String> fiveBucks = new StackList<>();
        fiveBucks.push("i");
        fiveBucks.push("got");
        fiveBucks.push("like");
        fiveBucks.push("five");
        fiveBucks.push("bucks");
        fiveBucks.push("lincoln");
        System.out.println(bakugo.stackSearch(fiveBucks, "i"));
        System.out.println(bakugo.stringDump(fiveBucks));
        
        StackQueueTester deez = new StackQueueTester();
        System.out.println(deez.stringDump(deez.splitString("please believe me")));
    }   
}