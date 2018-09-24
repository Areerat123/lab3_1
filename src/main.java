import javax.swing.*;

public class main {
    public static void main(String[] aeiou) {

        JOptionPane.showMessageDialog(null,"message","title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"รักฉันมั้ย ?" ,
                "Ask her ?",JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักเหมือนกัน!!");
        }else {
            JOptionPane.showMessageDialog(null,"จำไว้!!");
        }
    }
}
