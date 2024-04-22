import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    private JFrame frame;
    private JLabel timeLabel;

    public DigitalClock() {
        frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null); // Center the JFrame on the screen

        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(timeLabel.getFont().deriveFont(48.0f));
        frame.add(timeLabel);

        frame.setVisible(true);

        // Start the thread to update the time
        Thread updateTimeThread = new Thread(new UpdateTime());
        updateTimeThread.start();
    }

    private class UpdateTime implements Runnable {
        public void run() {
            try {
                while (true) {
                    updateTime();
                    Thread.sleep(1000); // Sleep for one second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void updateTime() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String currentTime = sdf.format(new Date());
            timeLabel.setText(currentTime);
        }
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
