import java.io.*;
import javax.swing.*;

public class InvoiceSaver {
    public static void saveInvoiceToFile(String invoiceText, String customer, double total, int cash, int returnAmount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sales.txt", true))) {
            writer.write("======================================\n"); 
            writer.write(invoiceText);
            writer.write("======================================\n");
          
            JOptionPane.showMessageDialog(null, "Invoice saved to sales.txt!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving invoice: " + ex.getMessage());
        }
    }
}
