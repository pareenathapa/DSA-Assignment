import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SocialNetworkGraphApp extends JFrame {
    private JPanel canvasPanel;
    private JButton addNodeButton;
    private JButton addEdgeButton;
    private JButton selectModeButton;
    private JTextField searchField;

    public SocialNetworkGraphApp() {
        setTitle("Social Network Graph Visualization");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize GUI components
        canvasPanel = new JPanel();
        addNodeButton = new JButton("Add Node");
        addEdgeButton = new JButton("Add Edge");
        selectModeButton = new JButton("Select Mode");
        searchField = new JTextField(20);

        // Add components to the layout
        JPanel controlPanel = new JPanel();
        controlPanel.add(addNodeButton);
        controlPanel.add(addEdgeButton);
        controlPanel.add(selectModeButton);
        controlPanel.add(searchField);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(canvasPanel, BorderLayout.CENTER);
        contentPane.add(controlPanel, BorderLayout.SOUTH);

        // Add listeners to buttons
        addNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle adding a new node
            }
        });

        addEdgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle adding a new edge
            }
        });

        selectModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle switching to select mode
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SocialNetworkGraphApp().setVisible(true);
            }
        });
    }
}
