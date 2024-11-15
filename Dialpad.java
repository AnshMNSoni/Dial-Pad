import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class Dialpad implements ActionListener {
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, clear, b10;
    JTextField text;
    StringBuilder numtext = new StringBuilder();

    Font f = new Font("Arial", Font.BOLD, 25);

    Dialpad() {
        JFrame frame = new JFrame();
        frame.setTitle("Dial Pad");
        frame.setSize(300, 465);

        text = new JTextField();
        text.setBounds(30, 30, 215, 50);
        text.setEditable(false);
        text.setFont(f);

        b9 = new JButton("9");
        b9.setBounds(30, 100, 50, 50);
        b9.setFont(f);

        b8 = new JButton("8");
        b8.setBounds(110, 100, 50, 50);
        b8.setFont(f);

        b7 = new JButton("7");
        b7.setBounds(190, 100, 50, 50);
        b7.setFont(f);

        b6 = new JButton("6");
        b6.setBounds(30, 180, 50, 50);
        b6.setFont(f);

        b5 = new JButton("5");
        b5.setBounds(110, 180, 50, 50);
        b5.setFont(f);

        b4 = new JButton("4");
        b4.setBounds(190, 180, 50, 50);
        b4.setFont(f);

        b3 = new JButton("3");
        b3.setBounds(30, 260, 50, 50);
        b3.setFont(f);

        b2 = new JButton("2");
        b2.setBounds(110, 260, 50, 50);
        b2.setFont(f);

        b1 = new JButton("1");
        b1.setBounds(190, 260, 50, 50);
        b1.setFont(f);

        b10 = new JButton("#");
        b10.setBounds(30, 340, 50, 50);
        b10.setFont(f);

        b0 = new JButton("0");
        b0.setBounds(110, 340, 50, 50);
        b0.setFont(f);

        clear = new JButton("c");
        clear.setBounds(190, 340, 50, 50);
        clear.setFont(f);

        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        b10.addActionListener(this);
        clear.addActionListener(this);

        frame.add(text);
        frame.add(b9);
        frame.add(b8);
        frame.add(b7);
        frame.add(b6);
        frame.add(b5);
        frame.add(b4);
        frame.add(b3);
        frame.add(b2);
        frame.add(b1);
        frame.add(b10);
        frame.add(b0);
        frame.add(clear);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if(e.getSource() == b9)
        {
            numtext.append("9");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b8)
        {
            numtext.append("8");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b7)
        {
            numtext.append("7");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b6)
        {
            numtext.append("6");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b5)
        {
            numtext.append("5");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b4)
        {
            numtext.append("4");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b3)
        {
            numtext.append("3");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b2)
        {
            numtext.append("2");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b1)
        {
            numtext.append("1");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b0)
        {
            numtext.append("0");
            text.setText(numtext.toString());
        }

        if(e.getSource() == b10)
        {
            numtext.append("#");
            text.setText(numtext.toString());
        }

        if(e.getSource() == clear)
        {
            numtext.deleteCharAt(numtext.length()-1);
            text.setText(numtext.toString());
        }
        }

        catch(Exception ex)
        {
            
        }

    }

    public static void main(String args[]) {
        new Dialpad();
    }
}
