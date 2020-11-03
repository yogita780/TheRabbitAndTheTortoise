package thread.tortoise;
import javax.swing.*;

public class Tortoise extends Thread {

    private static final int MILESTONES = 5;

    private final Thread tortoise;

    public Tortoise() {this.tortoise = new Thread(this, "tortoise");}

    public Thread getTortoise() { return tortoise;}

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
