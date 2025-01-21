import javax.swing.*;
import java.awt.*;

public class DisplaySelection extends JFrame {

    public DisplaySelection(String gender, String event) {
        String[] recommendation = OutfitRecommendation.getRecommendation(gender, event);
        String color = recommendation[0];
        String material = recommendation[1];
        String typeOfClothes = recommendation[2];
        String accessories = recommendation[3];
        String shoes = recommendation[4];
        String stylingTips = recommendation[5];
        String picturePath = recommendation[6];

        setTitle("Outfit Recommendation");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(245, 245, 245));

        JPanel headerPanel = new JPanel(new GridLayout(2, 1));
        headerPanel.setBackground(new Color(255, 223, 186));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel genderLabel = new JLabel("Selected Gender: " + gender);
        genderLabel.setFont(new Font("Serif", Font.BOLD, 20));
        genderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        genderLabel.setForeground(new Color(51, 51, 51));

        JLabel eventLabel = new JLabel("Selected Event: " + event);
        eventLabel.setFont(new Font("Serif", Font.BOLD, 20));
        eventLabel.setHorizontalAlignment(SwingConstants.CENTER);
        eventLabel.setForeground(new Color(51, 51, 51));

        headerPanel.add(genderLabel);
        headerPanel.add(eventLabel);

        JPanel detailsPanel = new JPanel(new GridLayout(6, 1, 10, 10));
        detailsPanel.setBorder(BorderFactory.createTitledBorder("Outfit Details"));
        detailsPanel.setBackground(new Color(240, 248, 255));

        JLabel colorLabel = new JLabel("Color: " + color);
        colorLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        JLabel materialLabel = new JLabel("Material: " + material);
        materialLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        JLabel typeOfClothesLabel = new JLabel("Clothing Type: " + typeOfClothes);
        typeOfClothesLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        JLabel accessoriesLabel = new JLabel("Accessories: " + accessories);
        accessoriesLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        JLabel shoesLabel = new JLabel("Shoes: " + shoes);
        shoesLabel.setFont(new Font("Serif", Font.PLAIN, 14));

        JTextArea stylingTipsTextArea = new JTextArea("Styling Tips: " + stylingTips);
        stylingTipsTextArea.setFont(new Font("Serif", Font.PLAIN, 14));
        stylingTipsTextArea.setWrapStyleWord(true);
        stylingTipsTextArea.setLineWrap(true);
        stylingTipsTextArea.setEditable(false);
        stylingTipsTextArea.setBackground(new Color(240, 248, 255));
        stylingTipsTextArea.setBorder(BorderFactory.createEmptyBorder());

        JScrollPane stylingTipsScrollPane = new JScrollPane(stylingTipsTextArea);
        stylingTipsScrollPane.setPreferredSize(new Dimension(750, 80));

        detailsPanel.add(colorLabel);
        detailsPanel.add(materialLabel);
        detailsPanel.add(typeOfClothesLabel);
        detailsPanel.add(accessoriesLabel);
        detailsPanel.add(shoesLabel);
        detailsPanel.add(stylingTipsScrollPane);  

        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(new Color(245, 245, 245));
        imagePanel.setLayout(new BorderLayout());
        JLabel pictureLabel = new JLabel();
        pictureLabel.setHorizontalAlignment(SwingConstants.CENTER);

        if (!picturePath.isEmpty()) {
            ImageIcon icon = new ImageIcon(picturePath);

            int maxWidth = 250; 
            int maxHeight = 250; 
            Image scaledImage = icon.getImage().getScaledInstance(maxWidth, maxHeight, Image.SCALE_SMOOTH);

            pictureLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            pictureLabel.setText("No Image Available");
            pictureLabel.setFont(new Font("Serif", Font.ITALIC, 16));
            pictureLabel.setForeground(Color.GRAY);
        }

        imagePanel.add(pictureLabel, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(245, 245, 245));
        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Serif", Font.BOLD, 16));
        closeButton.setBackground(new Color(173, 216, 230));
        closeButton.setFocusPainted(false);
        closeButton.addActionListener(e -> dispose());
        footerPanel.add(closeButton);

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(detailsPanel, BorderLayout.CENTER);
        mainPanel.add(imagePanel, BorderLayout.EAST);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }
}
