import javax.swing.*;
import java.awt.*;

public class PetSelector extends JFrame {

    private JRadioButton bird;
    private JRadioButton cat;
    private JRadioButton dog;
    private JRadioButton rabbit;
    private JRadioButton pig;

    private JLabel imageLabel;

    public PetSelector() {

        setTitle("Pet Selector");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

       
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));
        
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        
        ButtonGroup group = new ButtonGroup();

        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

      
        radioPanel.add(bird);
        radioPanel.add(cat);
        radioPanel.add(dog);
        radioPanel.add(rabbit);
        radioPanel.add(pig);

        
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        
        bird.addActionListener(e -> showPet("Bird", "images/bird.jpg"));

        cat.addActionListener(e -> showPet("Cat", "images/cat.jpg"));

        dog.addActionListener(e -> showPet("Dog", "images/dog.jpg"));

        rabbit.addActionListener(e -> showPet("Rabbit", "images/rabbit.jpg"));

        pig.addActionListener(e -> showPet("Pig", "images/pig.jpg"));

        
        mainPanel.add(radioPanel, BorderLayout.WEST);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        add(mainPanel);

        setVisible(true);
    }

    private void showPet(String petName, String imagePath) {

        ImageIcon icon = new ImageIcon(imagePath);

        imageLabel.setIcon(icon);

        JOptionPane.showMessageDialog(
            this,
            "You selected " + petName
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new PetSelector();
        });
    }
}
