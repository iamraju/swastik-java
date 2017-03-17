import javax.swing.*;

class SwingWeb {
  SwingWeb(){
    JFrame jfk = new JFrame(" A home for window");
    jfk.setSize(800,600);

    jfk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel jlab = new JLabel("Hello sir");

    JButton jbutt = new JButton("Enter");

    jbutt.setBounds(10, 10, 100, 50);

    JRadioButton r1 = new JRadioButton("Veg");
    JRadioButton r2 = new JRadioButton("Non Veg");

    r1.setBounds(50, 50, 70, 30);
    r2.setBounds(180, 50, 70, 30);

    JTextField jtxt = new JTextField();
    jtxt.setBounds(200, 200, 150, 50);

    jfk.add(jbutt);
    jfk.add(r1);
    jfk.add(r2);
    jfk.add(jtxt);
    jfk.add(jlab);
    jfk.setVisible(true);
  }

  public static void main(String args[]){
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new SwingWeb();
      }
    });
  }
}