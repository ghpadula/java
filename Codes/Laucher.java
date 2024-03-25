package Codes;
import javax.swing.*;

public class Laucher
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                MainWindow main = new MainWindow();
                main.show();
            }
        });

    }

}

