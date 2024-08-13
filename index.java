import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;



public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Modern World Kicks");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("Inventory Search");
        headingPanel.add(headingLabel);

        JPanel scannerPanel = new JPanel(new FlowLayout());
        JTextField inputField = new JTextField(20);
        inputField.setBackground(Color.white);
        inputField.setForeground(Color.black);
        JButton submitButton = new JButton("Search");
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        JButton clearButton = new JButton("Clear");
        clearButton.setBackground(Color.black);
        clearButton.setForeground(Color.white);
        JLabel promptLabel = new JLabel("Enter Shoe Size, Type, Brand, Color:");
        promptLabel.setForeground(Color.black);
        JLabel outputLabel = new JLabel();

        scannerPanel.add(promptLabel);
        scannerPanel.add(inputField);
        scannerPanel.add(submitButton);
        scannerPanel.add(clearButton);
        scannerPanel.add(outputLabel);

        JPanel resultPanel = new JPanel(new BorderLayout());

        submitButton.addActionListener(e -> {
            String toCheck = inputField.getText();
            ArrayList<String> shoeInventory = new ArrayList<>(); 
            shoeInventory.add("Jordan 12 Low Easter Egg, Size 10.5 Mens");
            shoeInventory.add("Jordan 11 Low Bright Citrus, Size 9 Womens");
            shoeInventory.add("Jordan 1 High Metallic Purple, Size 7 Womens");
            shoeInventory.add("Nike Air Max 95 Lebron James, Size 10.5 Mens");
            shoeInventory.add("Jordan 1 High Royal Toe, Size 10.5 Mens");
            shoeInventory.add("Nike Sacai Blazer Low British Tan, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 Low Starfish, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 High Pollen Yellow, Size 13 Mens");
            shoeInventory.add("Nike LD Waffle Midnight Spruce, Size 10.5 Mens");
            shoeInventory.add("Nike Air Max 1 Patta Rush Maroon, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 Low Green Toe, Size 11 Mens");
            shoeInventory.add("Jordan 1 Low Green Toe, Size 11 Mens");
            
            shoeInventory.add("Jordan 1 Mid Shadow, Size 9 Mens");
            shoeInventory.add("Jordan 1 Mid Shadow, Size 11 Mens");
            shoeInventory.add("Jordan 1 Low Golf Shadow, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 Low Diamond Shorts, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 Mid Cocunut Milk, Size 9 Womens");
            shoeInventory.add("Nike Dunk Low Two Tone Grey, Size 7Y or 8.5 Womens");
            shoeInventory.add("Nike Dunk Low NBA Chicago, Size 6.5Y or 8 Womens");
            shoeInventory.add("Nike Dunk High Black and White, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 Mid College Grey, Size 10 Mens");
            shoeInventory.add("Nike Dunk Low Cocunut Milk, Size 11 Mens");
            shoeInventory.add("Jordan 1 Low Shadow, Size 11 Mens");
            shoeInventory.add("Jordan 1 Low Pink Coral, Size 6.5Y or 8 Womens");
            shoeInventory.add("Jordan 1 Low Mystic Navy, Size 11.5 Mens");
            shoeInventory.add("Nike Dunk Low Black Panda, Size 11.5 Mens");
            shoeInventory.add("Nike Dunk Low Reverse UNC, Size 7 Womens");
            shoeInventory.add("Jordan 5 Racer Blue, Size 10 Mens");
            shoeInventory.add("Nike Kobe AD Purple Stardust, Size 11.5 Mens");
            shoeInventory.add("Nike Dunk Low Black and White and Metallic, Size 6.5Y or 8 Womens");
            shoeInventory.add("Nike Dunk Low Blueberry, Size 7Y or 8.5 Womens");
            shoeInventory.add("Nike Dunk Low Snakeskin, Size 8.5 Mens or 10 Womens");
            shoeInventory.add("Nike Air Max 1 Dirty Denim, Size 11.5 Mens");
            shoeInventory.add("Jordan 1 Low Black and Smoke Grey, Size 10 Mens");
            shoeInventory.add("Nike Dunk Low Barbershop, Size 6Y or 7.5 Womens");
            shoeInventory.add("Jordan 4 Royalty, Size 10 Mens");
            shoeInventory.add("Yeezy Slide Flax, Size 9 Mens");
            shoeInventory.add("Nike Dunk Low Black and White, Size 6.5Y or 8 Womens");
            shoeInventory.add("Jordan 1 Low Marina Blue, Size 8 Womens");
            shoeInventory.add("Jordan 1 High Taxi, Size 8 Mens");
            shoeInventory.add("Nike Dunk Low White Paisley, Size 8 Womens");
            shoeInventory.add("Jordan 1 Low UNC, Size 6.5Y or 8 Womens");
            shoeInventory.add("Nike Dunk Low Oxford Pink, Size 9 Womens");
            shoeInventory.add("Jordan 3 Fire Red, Size 12.5 Mens");
            shoeInventory.add("Nike Dunk Low Finger Point, Size 6.5Y or 8 Womens");
            shoeInventory.add("Nike Dunk High Soulgoods, Size 7 Mens or 8.5 Womens");
            shoeInventory.add("Nike Dunk Low Next Nature Mint, Size 9.5 Womens");
            shoeInventory.add("Yeezy Foam Runner Onyx, Size 11 Mens");
            shoeInventory.add("Nike Dunk Low Skate Like A Girl, Size 12 Mens");
            shoeInventory.add("Nike Dunk Low Sandrift, Size 9 Womens");
            shoeInventory.add("Nike Dunk Low Black and White, Size 9 Womens");
            shoeInventory.add("Nike Dunk Low Wolf Grey, Size 10.5 Mens");
            shoeInventory.add("Nike Dunk Low Indigo Haze, Size 8 Womens");
            shoeInventory.add("Jordan 4 Black Lightning, Size 11 Mens");

            ArrayList<String> matchingShoes = new ArrayList<>();
            for (String shoe : shoeInventory) {
                if (shoe.contains(toCheck)) {
                    matchingShoes.add(shoe);
                }
            }

            JList<String> resultList = new JList<>(matchingShoes.toArray(new String[0]));
            JScrollPane scrollPane = new JScrollPane(resultList);

            resultPanel.removeAll();
            resultPanel.add(scrollPane, BorderLayout.CENTER);
            resultPanel.revalidate();
            resultPanel.repaint();
        });

        clearButton.addActionListener(e -> {
            inputField.setText(null);
            outputLabel.setText(null);
            resultPanel.removeAll();
            resultPanel.revalidate();
            resultPanel.repaint();
        });

        mainPanel.add(headingPanel, BorderLayout.NORTH);
        mainPanel.add(scannerPanel, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.WEST);

        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }
}
