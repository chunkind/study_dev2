package b01_thread.step04;

import javax.swing.*;

public class ThreadEx6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
        System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

        for(int i=10; i>0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
