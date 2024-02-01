public class Main {

    public static void main(String[] args) throws InterruptedException {
        run();

    }

    public static void run() throws InterruptedException {
        RAM ram = new RAM();
        IR Ir = new IR();
        Ir.setWord(ram.getWord());
        Ir.getInstructor();

    }
}