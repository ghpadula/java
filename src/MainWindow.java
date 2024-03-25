package Codes;
import javax.swing.*;

public class MainWindow 
{
    private JFrame window;

    public MainWindow()
    {
        window = new JFrame();
        window.setTitle("O problema era a versão do Java que o Eclipse instalou, instalou uma versão headless, o que siginifica que não tem config para monitor");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1500, 500);
        window.setLocationRelativeTo(null);

    }

    public void show()
    {
        window.setVisible(true);
    }
    
}
