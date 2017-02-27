import javax.swing.*;
import java.awt.*;

public class Former {

    public JPanel createContentPane (){
        // http://fkn.ktu10.com/?q=node/2042
        // We create a bottom JPanel to place everything on.
        // создаём панель, а всё остальное размещаем уже на этой панели
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // добавим текст
        JLabel blueLabel = new JLabel("<html> <br>" +
                "это наш текст <br>" +
                "вот ещё одна строка<br>" +
                "Жизнь прекрасна))<br></html>");
        blueLabel.setLocation(-60, -30); /* это координаты метки - текста (измените их если
        тест не виден*/
        blueLabel.setSize(300, 100); // это размер области с текстом
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue); // Это цвет
        totalGUI.add(blueLabel);
        // Создаём кнопку

        JButton redButton = new JButton("Это наша кнопка :))");
        redButton.setLocation(120, 200); // это координаты кнопки
        redButton.setSize(150,30 ); // это размер кнопки
        totalGUI.add(redButton);



        totalGUI.setOpaque(true);
        return totalGUI;
    }

}
