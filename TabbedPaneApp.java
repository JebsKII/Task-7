import javax.swing.*;
import java.awt.*;

public class TabbedPaneApp extends JFrame {

    public TabbedPaneApp() {
        // Set up the main frame
        setTitle("Working with Tabbed Panes - IUEA Project");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Create the JTabbedPane instance
        JTabbedPane tabbedPane = new JTabbedPane();

        // 2. Define and add the five distinct tabs
        tabbedPane.addTab("Home", createHomePanel());
        tabbedPane.addTab("Profile", createProfilePanel());
        tabbedPane.addTab("Settings", createSettingsPanel());
        tabbedPane.addTab("Reports", createReportsPanel());
        tabbedPane.addTab("Help", createHelpPanel());

        // Add the tabbed pane to the frame
        add(tabbedPane);
    }

    // Tab 1: Basic Display Elements
    private JPanel createHomePanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Welcome to the Application Dashboard"));
        panel.add(new JButton("Refresh Data"));
        return panel;
    }

    // Tab 2: Input Fields
    private JPanel createProfilePanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(new JLabel("Full Name:"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Student ID:"));
        panel.add(new JTextField(15));
        return panel;
    }

    // Tab 3: Interactive Components (Checkboxes/RadioButtons)
    private JPanel createSettingsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JCheckBox("Enable Notifications"));
        panel.add(new JCheckBox("Dark Mode"));
        panel.add(new JRadioButton("Auto-Save Changes"));
        return panel;
    }

    // Tab 4: Display Elements (Lists/Tables)
    private JPanel createReportsPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        String[] data = {"Project Alpha - Completed", "Project Beta - In Progress", "Test Config - Pending"};
        JList<String> list = new JList<>(data);
        panel.add(new JLabel("Recent Activity Log:"), BorderLayout.NORTH);
        panel.add(new JScrollPane(list), BorderLayout.CENTER);
        return panel;
    }

    // Tab 5: Mixed Components
    private JPanel createHelpPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Contact Support: support@iuea.ac.ug"));
        panel.add(new JTextArea("Type your query here...", 5, 20));
        return panel;
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new TabbedPaneApp().setVisible(true);
        });
    }
}

