import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Fashion Finder");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(new Color(255, 223, 186));

        JLabel titleLabel = new JLabel("Fashion Finder");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String currentDate = dateFormat.format(new Date());
        JLabel dateLabel = new JLabel(currentDate);
        dateLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        dateLabel.setForeground(Color.BLACK);
        dateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        dateLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 20));

        titlePanel.add(titleLabel, BorderLayout.WEST);
        titlePanel.add(dateLabel, BorderLayout.EAST);

        JPanel parentPanel = new JPanel(new BorderLayout());
        parentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
        parentPanel.setBackground(new Color(240, 240, 240));

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 2, 10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPanel.setBackground(new Color(173, 216, 230));

        Dimension dropdownSize = new Dimension(150, 25);

        JPanel genderPanel = new JPanel(new BorderLayout());
        JLabel genderLabel = new JLabel("Select Gender:");
        String[] genders = { "Male", "Female" };
        JComboBox<String> genderDropdown = new JComboBox<>(genders);
        genderDropdown.setPreferredSize(dropdownSize);
        genderPanel.add(genderLabel, BorderLayout.NORTH);
        genderPanel.add(genderDropdown, BorderLayout.CENTER);

        JPanel eventPanel = new JPanel(new BorderLayout());
        JLabel eventLabel = new JLabel("Select Event:");
        String[] events = { "Wedding", "Party", "Conference", "Sports", "Casual Outing" };
        JComboBox<String> eventDropdown = new JComboBox<>(events);
        eventDropdown.setPreferredSize(dropdownSize);
        eventPanel.add(eventLabel, BorderLayout.NORTH);
        eventPanel.add(eventDropdown, BorderLayout.CENTER);

        contentPanel.add(genderPanel);
        contentPanel.add(eventPanel);

        JPanel buttonPanel = new JPanel();
        JButton generateButton = new JButton("Generate Outfit");
        buttonPanel.add(generateButton);

        generateButton.addActionListener(e -> {
            String selectedGender = (String) genderDropdown.getSelectedItem();
            String selectedEvent = (String) eventDropdown.getSelectedItem();
        
            DisplaySelection selectionFrame = new DisplaySelection(selectedGender, selectedEvent);
            selectionFrame.setVisible(true);
        });

        add(titlePanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dashboard frame = new Dashboard();
            frame.setVisible(true);
        });
    }
}
