import javax.swing.*;

public class SwRun {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true); // верхняя панель будет куда неординарнее)
        JFrame frame = new JFrame("[=] Swing кнопка и текст)) [=]");

        //Create and set up the content pane.
        Former demo = new Former(); // создаём класс
        frame.setContentPane(demo.createContentPane()); // запускаем метод описывающий внешний вид

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }
}
