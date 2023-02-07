import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    //Calendar calendar;  (After review didn't need this)
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    JLabel dayLabel;
    String day;
    SimpleDateFormat dayFormat;

    SimpleDateFormat dateFormat;
    String date;
    JLabel dateLabel;

    MyFrame() {
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setTitle("Java Clock App");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        //this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh: mm:ss a");
        timeLabel = new JLabel();

        dayFormat = new SimpleDateFormat("E");
        dayLabel = new JLabel();

        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        dateLabel = new JLabel();



        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();

    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
