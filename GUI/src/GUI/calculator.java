package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator implements ActionListener{


	JFrame jf;
	JPanel jp;
	JLabel jl,jl1,jl2,jl3;
	JButton jbdiv,jbopsin,jbBS,jbAC,jbmulti,jb9,jb8,jb7,jbminus,jb6,jb5,jb4,jbplus,jb3,jb2,jb1,jbeq,jbdot,jb0,jb00;
	String ans="";
	int equal=0;

	public calculator(){
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setBounds(1100,200,329,418);
		
		jp=new JPanel();
		jp.setBounds(0,0,329,418);
		jp.setLayout(null);
		jp.setBackground(Color.black);
		jf.add(jp);
		
		jl=new JLabel();
		jl.setBackground(Color.black);
		jl.setForeground(Color.white);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jl.setOpaque(true);
		jl.setBounds(5,15,286,41);
		jl.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,36));
		jp.add(jl);
		
		jl1=new JLabel();
		jl1.setBackground(Color.black);
		jl1.setForeground(Color.white);
		jl1.setOpaque(true);
		jl1.setBounds(286,22,15,15);
		jl1.setFont(new Font("Arial",Font.BOLD,26));
		
		jl2=new JLabel("0");
		jl2.setBackground(Color.black);
		jl2.setForeground(Color.white);
		jl2.setHorizontalAlignment(SwingConstants.RIGHT);
		jl2.setOpaque(true);
		jl2.setBounds(5,47,300,47);
		jl2.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,36));
		jp.add(jl2);
		
		jl3=new JLabel();
		jl3.setBackground(Color.black);
		jl3.setOpaque(true);
		jl3.setBounds(5,5,305,104);
		jp.add(jl3);
		jl3.add(jl1);
		
		jbdiv=new JButton("÷");
		jbdiv.setBounds(236,113,74,50);
		jbdiv.setBackground(Color.darkGray);
		jbdiv.setForeground(Color.white);
		jbdiv.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jbdiv.addActionListener(this);
		
		jbopsin=new JButton("+/-");
		jbopsin.setBounds(159,113,74,50);
		jbopsin.setBackground(Color.darkGray);
		jbopsin.setForeground(Color.white);
		jbopsin.setFont(new Font(Font.SERIF,Font.BOLD,25));
		jbopsin.addActionListener(this);
		
		jbBS=new JButton("⌫");
		jbBS.setBounds(82,113,74,50);
		jbBS.setBackground(Color.darkGray);
		jbBS.setForeground(Color.white);
		jbBS.setFont(new Font(Font.SERIF,Font.BOLD,23));
		jbBS.addActionListener(this);
		
		jbAC=new JButton("AC");
		jbAC.setBounds(5,113,74,50);
		jbAC.setBackground(Color.darkGray);
		jbAC.setForeground(Color.white);
		jbAC.setFont(new Font(Font.SERIF,Font.BOLD,28));
		jbAC.addActionListener(this);
		
		jbmulti=new JButton("×");
		jbmulti.setBounds(236,166,74,50);
		jbmulti.setBackground(Color.darkGray);
		jbmulti.setForeground(Color.white);
		jbmulti.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jbmulti.addActionListener(this);
		
		jb9=new JButton("9");
		jb9.setBounds(159,166,74,50);
		jb9.setBackground(Color.darkGray);
		jb9.setForeground(Color.white);
		jb9.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb9.addActionListener(this);
		
		jb8=new JButton("8");
		jb8.setBounds(82,166,74,50);
		jb8.setBackground(Color.darkGray);
		jb8.setForeground(Color.white);
		jb8.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb8.addActionListener(this);
		
		jb7=new JButton("7");
		jb7.setBounds(5,166,74,50);
		jb7.setBackground(Color.darkGray);
		jb7.setForeground(Color.white);
		jb7.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb7.addActionListener(this);
		
		jbminus=new JButton("-");
		jbminus.setBounds(236,219,74,50);
		jbminus.setBackground(Color.darkGray);
		jbminus.setForeground(Color.white);
		jbminus.setFont(new Font("Arial",Font.PLAIN,35));
		jbminus.addActionListener(this);
		
		jb6=new JButton("6");
		jb6.setBounds(159,219,74,50);
		jb6.setBackground(Color.darkGray);
		jb6.setForeground(Color.white);
		jb6.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb6.addActionListener(this);
		
		jb5=new JButton("5");
		jb5.setBounds(82,219,74,50);
		jb5.setBackground(Color.darkGray);
		jb5.setForeground(Color.white);
		jb5.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb5.addActionListener(this);
		
		jb4=new JButton("4");
		jb4.setBounds(5,219,74,50);
		jb4.setBackground(Color.darkGray);
		jb4.setForeground(Color.white);
		jb4.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb4.addActionListener(this);
		
		jbplus=new JButton("+");
		jbplus.setBounds(236,272,74,50);
		jbplus.setBackground(Color.darkGray);
		jbplus.setForeground(Color.white);
		jbplus.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jbplus.addActionListener(this);
		
		jb3=new JButton("3");
		jb3.setBounds(159,272,74,50);
		jb3.setBackground(Color.darkGray);
		jb3.setForeground(Color.white);
		jb3.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb3.addActionListener(this);
		
		jb2=new JButton("2");
		jb2.setBounds(82,272,74,50);
		jb2.setBackground(Color.darkGray);
		jb2.setForeground(Color.white);
		jb2.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb2.addActionListener(this);
		
		jb1=new JButton("1");
		jb1.setBounds(5,272,74,50);
		jb1.setBackground(Color.darkGray);
		jb1.setForeground(Color.white);
		jb1.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb1.addActionListener(this);
		
		jbeq=new JButton("=");
		jbeq.setBounds(236,325,74,50);
		jbeq.setBackground(Color.darkGray);
		jbeq.setForeground(Color.white);
		jbeq.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jbeq.addActionListener(this);
		
		jbdot=new JButton(".");
		jbdot.setBounds(159,325,74,50);
		jbdot.setBackground(Color.darkGray);
		jbdot.setForeground(Color.white);
		jbdot.setFont(new Font("Arial",Font.BOLD,35));
		jbdot.addActionListener(this);
		
		jb0=new JButton("0");
		jb0.setBounds(82,325,74,50);
		jb0.setBackground(Color.darkGray);
		jb0.setForeground(Color.white);
		jb0.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb0.addActionListener(this);
		
		jb00=new JButton("00");
		jb00.setBounds(5,325,74,50);
		jb00.setBackground(Color.darkGray);
		jb00.setForeground(Color.white);		
		jb00.setFont(new Font(Font.SERIF,Font.BOLD,35));
		jb00.addActionListener(this);
		
		jp.add(jbdiv);
		jp.add(jbopsin);
		jp.add(jbBS);
		jp.add(jbAC);
		jp.add(jbmulti);
		jp.add(jb9);
		jp.add(jb8);
		jp.add(jb7);
		jp.add(jbminus);
		jp.add(jb6);
		jp.add(jb5);
		jp.add(jb4);
		jp.add(jbplus);
		jp.add(jb3);
		jp.add(jb2);
		jp.add(jb1);
		jp.add(jbeq);
		jp.add(jbdot);
		jp.add(jb0);
		jp.add(jb00);

		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String ar[]) {
		new calculator();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb00) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()!="0") {
				jl2.setText(jl2.getText()+"00");
			}
		}
		else if(e.getSource()==jb0) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()!="0") {
				jl2.setText(jl2.getText()+"0");
			}
		}
		else if(e.getSource()==jb1) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"1");
		}
		else if(e.getSource()==jb2) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"2");
		}
		else if(e.getSource()==jb3) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"3");
		}
		else if(e.getSource()==jb4) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"4");
		}
		else if(e.getSource()==jb5) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"5");
		}
		else if(e.getSource()==jb6) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"6");
		}
		else if(e.getSource()==jb7) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"7");
		}
		else if(e.getSource()==jb8) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"8");
		}
		else if(e.getSource()==jb9) {
			jl2();
			if(equal==1) {
				jl1.setText("");
				jl2.setText("0");
				equal=0;
			}
			if(jl2.getText()=="0") {
				jl2.setText("");
			}
			jl2.setText(jl2.getText()+"9");
		}
		else if(e.getSource()==jbAC) {
			jl_jl1_jl2();
			jl.setText("");
			jl2.setText("0");
			jl1.setText("");
			equal=0;
			ans="";
		}
		else if(e.getSource()==jbplus) {
			jl_jl1();
			if (jl2.getText().endsWith(".")) {
				jl2.setText(jl2.getText().substring(0, jl2.getText().length() - 1));
			}
			if(equal==1) {
				jl1.setText("");
				equal=0;
			}
			if(jl.getText()=="") {
				jl.setText(jl2.getText());
				jl1.setText("+");
				jl2.setText("0");
			}
			else if(jl.getText()!=""&&jl2.getText()!="") {
				jl.setText(calc(e));
				jl1.setText("+");
				jl2.setText("0");
			}
		}
		
		else if(e.getSource()==jbminus) {
			if (jl2.getText().endsWith(".")) {
				jl2.setText(jl2.getText().substring(0, jl2.getText().length() - 1));
			}
			if(jl1.getText()=="×"||jl1.getText()=="÷") {
				jl2();
				jl2.setText("-");
			}
			else {
				jl_jl1();
				if(equal==1) {
					jl1.setText("");
					equal=0;
				}
				if(jl.getText()=="") {
					jl.setText(jl2.getText());
					jl1.setText("-");
					jl2.setText("0");
				}
				else if(jl.getText()!=""&&jl2.getText()!="") {
					jl.setText(calc(e));
					jl1.setText("-");
					jl2.setText("0");
				}
			}
		}
		
		else if(e.getSource()==jbmulti) {
			jl_jl1();
			if (jl2.getText().endsWith(".")) {
				jl2.setText(jl2.getText().substring(0, jl2.getText().length() - 1));
			}
			if(equal==1) {
				jl1.setText("");
				equal=0;
			}
			if(jl.getText()=="") {
				jl.setText(jl2.getText());
				jl1.setText("×");
				jl2.setText("0");
			}
			else if(jl.getText()!=""&&jl2.getText()!="") {
				jl.setText(calc(e));
				jl1.setText("×");
				jl2.setText("0");
			}
		}
		
		else if(e.getSource()==jbdiv) {
			jl_jl1();
			if (jl2.getText().endsWith(".")) {
				jl2.setText(jl2.getText().substring(0, jl2.getText().length() - 1));
			}
			if(equal==1) {
				jl1.setText("");
				equal=0;
			}
			if(jl.getText()=="") {
				jl.setText(jl2.getText());
				jl1.setText("÷");
				jl2.setText("0");
			}
			else if(jl.getText()!=""&&jl2.getText()!="") {
				jl.setText(calc(e));
				jl1.setText("÷");
				jl2.setText("0");
			}
		}
		
		else if(e.getSource()==jbeq) {
			jl2();
			if(jl.getText()!=""&&jl2.getText()!="") {
				equal=1;
				jl2.setText(calc(e));
				jl1.setText("=");
				jl.setText("");
			}
		}
		
		else if(e.getSource()==jbBS) {
			jl2();
			if(jl2.getText()!="0") {
				jl2.setText(jl2.getText().substring(0, jl2.getText().length() - 1));
				if(jl2.getText()=="") {
					jl2.setText("0");
				}
			}
		}
		
		else if(e.getSource()==jbopsin) {
			jl2();
			if(jl2.getText()!="0") {
				ans=String.valueOf(Float.parseFloat(jl2.getText())*-1);
				if (ans.endsWith(".0")) {
					ans = ans.substring(0, ans.length() - 2);
				}
				jl2.setText(ans);
			}
		}
		else if(e.getSource()==jbdot) {
			jl2();
			if (!jl2.getText().contains(".")) {
				if(jl2.getText()=="0") {
					jl2.setText(jl2.getText()+".");
				}
				else if(jl2.getText()=="-") {
					jl2.setText(jl2.getText()+"0.");
				}
				else {
					jl2.setText(jl2.getText()+".");
				}
			}
		}	
	}
	
	public String calc(ActionEvent e) {
		
		if(jl1.getText()=="+") {
			ans=String.valueOf(Float.parseFloat(jl.getText())+Float.parseFloat(jl2.getText()));
		}
		else if(jl1.getText()=="-") {
			ans=String.valueOf(Float.parseFloat(jl.getText())-Float.parseFloat(jl2.getText()));
		}
		else if(jl1.getText()=="×") {
			ans=String.valueOf(Float.parseFloat(jl.getText())*Float.parseFloat(jl2.getText()));
		}
		else if(jl1.getText()=="÷") {
			ans=String.valueOf(Float.parseFloat(jl.getText())/Float.parseFloat(jl2.getText()));
		}
		if (ans.endsWith(".0")) {
			ans = ans.substring(0, ans.length() - 2);
		}

		return ans;	
	}
	public void jl_jl1() {
		jl.setForeground(Color.white);
		jl.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,36));
		jl1.setForeground(Color.white);
		jl1.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,26));
		jl2.setForeground(Color.gray);
		jl2.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,22));
	}
	public void jl2() {
		jl.setForeground(Color.gray);
		jl.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,22));
		jl1.setForeground(Color.gray);
		jl1.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,22));
		jl2.setForeground(Color.white);
		jl2.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,36));
	}
	public void jl_jl1_jl2() {
		jl.setForeground(Color.white);
		jl.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,36));
		jl1.setForeground(Color.white);
		jl1.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,26));
		jl2.setForeground(Color.white);
		jl2.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,36));
	}
}