public class RingBufferQueueRunner
{
    public static void main(String[] args)
    {
        RingBufferQueue bruh = new RingBufferQueue(5);
        bruh.add('s');
        bruh.add('a');
        bruh.add('h');
        System.out.println(bruh.getRear());
        bruh.remove();
        bruh.add('c');
        bruh.add('d');
        System.out.println(bruh.getRear());
        bruh.add('t');
        System.out.println(bruh.add('n'));
        System.out.println(bruh.getRear());
        bruh.remove();
        System.out.println(bruh.add('n'));
        //bruh.remove();
        System.out.println(bruh.add('l'));
        System.out.println(bruh.getRear());
        System.out.println(bruh.peek());
    }
}
