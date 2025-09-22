import javax.swing.JOptionPane;

class UsingJOPtionPane {
   public static void main(String[] args) {
         String result;
         do {
          result = JOptionPane.showInputDialog(null, "What is your name");
          if (result == null || result.trim().isEmpty()) System.exit(0);
          int res = JOptionPane.showConfirmDialog(null, "Do you want to show your name");
          if (res == JOptionPane.YES_OPTION) break;
          if (res == JOptionPane.CLOSED_OPTION) System.exit(0);
         } while(true);
         
         JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
      }
   }
