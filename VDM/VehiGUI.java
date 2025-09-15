import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VehiGUI implements ActionListener {

    private JFrame frame;
    private JPanel topPanel, leftPanel, rightPanel;
    private JLabel startingText, subText, toyo1, mot1, for1;
    private JButton TC1btn, TC2btn, MB1btn, MB2btn, FC1btn, FC2btn, Purbtn, Delbtn, RmvBtn;
    private JTextArea invoice;
    private JLabel totalLabel;
    private JTextField STextField;
    private JLabel returnLabel;
    private double total = 0;
    private int customerCount=1;
    private int cartCount = 0;
    private IVehicle[] vehicles;

    public VehiGUI() {

        vehicles = new IVehicle[] {
            new Vehicle("Toyota Axio", 2150000, "VehicleImages/Axio.png"),
            new Vehicle("Toyota Supra", 14994502, "VehicleImages/Toyota_Supra.png"),
            new Motorbike("Yamaha R15", 450000, "VehicleImages/Yamaha_R15.png",150),
            new Motorbike("Kawasaki Ninja H2R", 4846800, "VehicleImages/Kawasaki_Ninja_H2R.png",1000),
            new Vehicle("Ford Focus", 1519798, "VehicleImages/Ford_Focus.png"),
            new Vehicle("Ford Mustang", 2150000, "VehicleImages/Ford_Mustang.png")
        };

        frame = new JFrame();
        frame.setTitle("Vehicle Dealership Management System");
        frame.setSize(1277, 790);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //eita Top panel
        topPanel = new JPanel();
        topPanel.setBackground(Color.WHITE);
        topPanel.setOpaque(true);
        topPanel.setBounds(0, 0, 1277, 90);
        topPanel.setLayout(null);

        startingText = new JLabel("Vehicle Selection Page");
        startingText.setFont(new Font("Inter", Font.BOLD, 30));
        startingText.setBounds(10, 0, 350, 50);
        topPanel.add(startingText);

        subText = new JLabel("Please Select Your Desired Vehicle(s)");
        subText.setFont(new Font("Inter", Font.BOLD, 15));
        subText.setBounds(10, 35, 350, 50);
        topPanel.add(subText);

        frame.add(topPanel);

        //Eita Left panel
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setOpaque(true);
        leftPanel.setBounds(0, 0, 900, 750);
        leftPanel.setLayout(null);

        //Eita Toyota_Cars Part
        ImageIcon toyota = new ImageIcon("VehicleImages/Toyota_Cars.png");
        Image toyotaIMG = toyota.getImage();
        Image toyota1 = toyotaIMG.getScaledInstance(900, 215, Image.SCALE_SMOOTH);
        ImageIcon toyoTa1 = new ImageIcon(toyota1);

        toyo1 = new JLabel();
        toyo1.setIcon(toyoTa1);
        toyo1.setBounds(0, 50, 900, 300);
        leftPanel.add(toyo1);

        TC1btn = new JButton("Add To Cart");
        TC1btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        TC1btn.setBounds(335, 260, 100, 25);
        TC1btn.setBackground(Color.BLACK);
        TC1btn.setForeground(Color.WHITE);
        TC1btn.addActionListener(this);
        frame.add(TC1btn);

        TC2btn = new JButton("Add To Cart");
        TC2btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        TC2btn.setBounds(790, 260, 100, 25);
        TC2btn.setBackground(Color.BLACK);
        TC2btn.setForeground(Color.WHITE);
        TC2btn.addActionListener(this);
        frame.add(TC2btn);

        //Eita Motor_Bikes Part
        ImageIcon MotoBike = new ImageIcon("VehicleImages/Motor_Bikes.png");
        Image MotoBikeIMG = MotoBike.getImage();
        Image MotoBike1 = MotoBikeIMG.getScaledInstance(900, 215, Image.SCALE_SMOOTH);
        ImageIcon MotoBi1 = new ImageIcon(MotoBike1);

        mot1 = new JLabel();
        mot1.setIcon(MotoBi1);
        mot1.setBounds(0, 265, 900, 300);
        leftPanel.add(mot1);

        MB1btn = new JButton("Add To Cart");
        MB1btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        MB1btn.setBounds(335, 485, 100, 25);
        MB1btn.setBackground(Color.BLACK);
        MB1btn.setForeground(Color.WHITE);
        MB1btn.addActionListener(this);
        frame.add(MB1btn);

        MB2btn = new JButton("Add To Cart");
        MB2btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        MB2btn.setBounds(790, 485, 100, 25);
        MB2btn.setBackground(Color.BLACK);
        MB2btn.setForeground(Color.WHITE);
        MB2btn.addActionListener(this);
        frame.add(MB2btn);

        //Eita Ford_Cars Parts
        ImageIcon ford = new ImageIcon("VehicleImages/Ford_Cars.png");
        Image fordIMG = ford.getImage();
        Image ford1 = fordIMG.getScaledInstance(900, 215, Image.SCALE_SMOOTH);
        ImageIcon forD1 = new ImageIcon(ford1);

        for1 = new JLabel();
        for1.setIcon(forD1);
        for1.setBounds(0, 480, 900, 300);
        leftPanel.add(for1);

        FC1btn = new JButton("Add To Cart");
        FC1btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        FC1btn.setBounds(335, 700, 100, 25);
        FC1btn.setBackground(Color.BLACK);
        FC1btn.setForeground(Color.WHITE);
        FC1btn.addActionListener(this);
        frame.add(FC1btn);

        FC2btn = new JButton("Add To Cart");
        FC2btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        FC2btn.setBounds(790, 700, 100, 25);
        FC2btn.setBackground(Color.BLACK);
        FC2btn.setForeground(Color.WHITE);
        FC2btn.addActionListener(this);
        frame.add(FC2btn);

        frame.add(leftPanel);

        // Right panel
        rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setOpaque(true);
        rightPanel.setBounds(900, 0, 362, 750);
        rightPanel.setLayout(null);

        //Eita List_Image Part
        ImageIcon SLI = new ImageIcon("VehicleImages/ShowList.png");
        Image SLIIMG = SLI.getImage();
        Image SLI1 = SLIIMG.getScaledInstance(350, 575, Image.SCALE_SMOOTH);
        ImageIcon sLI1 = new ImageIcon(SLI1);
        JLabel Sli = new JLabel();
        Sli.setIcon(sLI1);
        Sli.setBounds(10, 0, 475, 775);
        rightPanel.add(Sli);

        //Eita Invoice_Area Part
        invoice = new JTextArea();
        invoice.setEditable(false);
        invoice.setBackground(new Color(172, 172, 172)); 
        invoice.setForeground(Color.BLACK);
        invoice.setFont(new Font("Inter", Font.BOLD, 14));
        invoice.setLineWrap(true);          
        invoice.setWrapStyleWord(true);     

        JScrollPane scrollPane = new JScrollPane(invoice);
        scrollPane.setBounds(34, 170, 310, 450);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rightPanel.add(scrollPane);

        totalLabel = new JLabel("Total: 0");
        totalLabel.setBounds(34, 410, 200, 25);
        rightPanel.add(totalLabel);

        returnLabel = new JLabel("Return: 0");
        returnLabel.setBounds(34, 440, 200, 25);
        rightPanel.add(returnLabel);

        Purbtn = new JButton("Confirm Purchase");
        Purbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Purbtn.setBounds(25, 675, 140, 25);
        Purbtn.setBackground(Color.BLACK);
        Purbtn.setForeground(Color.WHITE);
        rightPanel.add(Purbtn);

        Purbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (isCartEmpty()) return;

                    String customerName = askCustomerName();
                    if (customerName == null) return;

                    String license = askLicense();
                    if (license == null) return;

                    int intTotal = calculateTotal();
                    showTotalToPay(intTotal);

                    int cash = askForCash(intTotal);
                    if (cash == -1) return;

                    Purchase p = processPurchase(customerName, license, intTotal, cash);

                    if (p.getCash() < p.getTotal()) {
                        JOptionPane.showMessageDialog(null, "Sorry, insufficient balance.");
                        return;
                    }

                    int ret = p.getReturnAmount();
                    displayPurchaseSummary(p, ret);
                    saveInvoice(p, ret);

                    customerCount++;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }

            private boolean isCartEmpty() {
                if (invoice.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Your cart is empty! Please add items to the cart.");
                    return true;
                }
                return false;
            }

            private String askCustomerName() {
                String customerName = JOptionPane.showInputDialog("Enter customer name:");
                if (customerName == null || customerName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid customer name.");
                    return null;
                }
                return customerName;
            }

            private String askLicense() {
                String license = JOptionPane.showInputDialog("Enter driver's license number:");
                if (license == null || license.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid license number.");
                    return null;
                }
                return license;
            }

            private int calculateTotal() {
                return (int) Math.round(total);
            }

            private void showTotalToPay(int total) {
                JOptionPane.showMessageDialog(
                    null,
                    "Please Pay " + total + " BDT To Proceed",
                    "Total to Pay",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

            private int askForCash(int total) {
                String input = JOptionPane.showInputDialog(
                    null,
                    "Total to pay: " + total + " BDT\n\nEnter Your cash amount:",
                    "Cash Payment",
                    JOptionPane.QUESTION_MESSAGE
                );
                if (input == null || input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid cash amount.");
                    return -1;
                }

                try {
                    return Integer.parseInt(input);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a whole-number amount.");
                    return -1;
                }
            }

            private Purchase processPurchase(String customerName, String license, int total, int cash) {
                Purchase p = new Purchase();
                p.setCustomerName(customerName);
                p.setLicense(license);
                p.setTotal(total);
                p.setCash(cash);
                return p;
            }

            private void displayPurchaseSummary(Purchase p, int ret) {
                String summary =
                    
                    "Customer " + customerCount + " Name : " + p.getCustomerName() + "\n" +
                    "Customer " + customerCount + " License No: " + p.getMaskedLicense() + "\n" +
                    "Total Cart: " + p.getTotal() + " BDT\n" +
                    "Cash Paid: " + p.getCash() + " BDT\n" +
                    "Cash Returned: " + ret + " BDT\n" 
                    ;
                invoice.append(summary); 
                totalLabel.setText("Total: " + p.getTotal());
                returnLabel.setText("Return: " + ret);
                invoice.setCaretPosition(0);

                JOptionPane.showMessageDialog(
                    null,
                    "Purchase Confirmed! \n" +
                    "Customer: " + p.getCustomerName() + "\n" +
                    "License: " + p.getMaskedLicense() + "\n" +
                    "Amount Due: " + p.getTotal() + " BDT\n" +
                    "Cash Paid: " + p.getCash() + " BDT\n" +
                    "Return Cash: " + ret + " BDT"
                );
            }

            private void saveInvoice(Purchase p, int ret) {
                InvoiceSaver.saveInvoiceToFile(
                    invoice.getText(),
                    p.getCustomerName(),
                    p.getTotal(),
                    p.getCash(),
                    ret
                );
            }
        });
        
        //Eita Clear Cart Button er Part
        RmvBtn = new JButton("Cart Cleared");
        RmvBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        RmvBtn.setBounds(175, 675, 120, 25);
        RmvBtn.addActionListener(this);
        RmvBtn.setBackground(Color.BLACK);
        RmvBtn.setForeground(Color.WHITE);
        rightPanel.add(RmvBtn);

        frame.add(rightPanel);
        frame.setVisible(true);
    }

    public void addItem(String item, int price) {
        if (cartCount >= 2) {
            JOptionPane.showMessageDialog(null, "You can buy at most 2 cars per purchase.");
            return;
        }
        invoice.append(item + "\n");
        cartCount++;
        total += price;
        totalLabel.setText("Total: " + (int) total);
    }

    public void actionPerformed(ActionEvent ae) {
        Object src = ae.getSource();

        if (src == TC1btn) {
            addItem("Toyota Axio - 2150000 BDT", 2150000);
        } else if (src == TC2btn) {
            addItem("Toyota Supra - 14994502 BDT", 14994502);
        } else if (src == MB1btn) {
            addItem("Yamaha R15 - 6,60,000 BDT", 660000);
        } else if (src == MB2btn) {
            addItem("Kawasaki Ninja H2R - 48,46,800 BDT", 4846800);
        } else if (src == FC1btn) {
            addItem("Ford Focus - 1519798 BDT", 1519798);
        } else if (src == FC2btn) {
            addItem("Ford Mustang - 2150000 BDT", 2150000);
        } else if (src == Delbtn) {
            invoice.setText("");
            total = 0;
            cartCount = 0; 
            totalLabel.setText("Total: 0");
        } else if (src == RmvBtn) {
            JOptionPane.showMessageDialog(null, "Clear Cart");
            invoice.setText("");
            total = 0;
            cartCount = 0; 
            totalLabel.setText("Total: 0");
            returnLabel.setText("Return: 0");
            
        } else if (src == STextField) {
        }
    }
}
