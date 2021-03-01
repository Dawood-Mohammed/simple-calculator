package calculator;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoClass implements ActionListener{

 //functionality variables 
 static int l=0 , hj=0 , ht=0;   
 static double first=0.0 , second=0.0 , result=0.0;
 static char oop = '=';
 static String dos = "";
 
 //GUI components or controls
  private int width , height;
  private String title;
  private JFrame frame;
  private JLabel l1;
  private javax.swing.JButton bpr,ba,bs,bm,bd,be,bc,bb,bt,bmp,b1 , b2 , b3 , b4, b5 ,b6 ,b7,b8,b9 ,b0;
  private JPanel panel;
  private JTextField tf;
  private boolean newNum = true;
  private char op = '=';
  
  //constructing the class
  public DemoClass(String title , int width , int height){
    this.title = title;
    this.width = width;
    this.height = height;
    
    
    prepare();

  }

  //frame design method (starting design)
  public void prepare(){
  frame = new JFrame(title);
  frame.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/photoes/icon.png")).getImage());
  frame.setSize(width , height);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setResizable(false);
  frame.setLocationRelativeTo(null);
  frame.setLayout(null);
  frame.setVisible(true);

  panel = new JPanel();
  panel.setBounds(1,100,318,244);
  panel.setBackground(new java.awt.Color(153,153,153));
  panel.setLayout(new GridLayout(5,4,3,3));
  
  l1 = new JLabel("Calculations",JLabel.CENTER);
  l1.setBounds(120,5,70,30);
  tf = new JTextField(15);
  tf.setBounds(0,40,320,35);
  
  b0 = new JButton("0");
  b0.setBackground(java.awt.Color.white);
  b0.addActionListener(this);
  b1 = new JButton("1");
  b1.setBackground(java.awt.Color.white);
  b1.addActionListener(this);
  b2 = new JButton("2");
  b2.setBackground(java.awt.Color.white);
  b2.addActionListener(this);
  b3 = new JButton("3");
  b3.setBackground(java.awt.Color.white);
  b3.addActionListener(this);
  b4 = new JButton("4");
  b4.setBackground(java.awt.Color.white);
  b4.addActionListener(this);
  b5 = new JButton("5");
  b5.setBackground(java.awt.Color.white);
  b5.addActionListener(this);
  b6 = new JButton("6");
  b6.setBackground(java.awt.Color.white);
  b6.addActionListener(this);
  b7 = new JButton("7");
  b7.setBackground(java.awt.Color.white);
  b7.addActionListener(this);
  b8 = new JButton("8");
  b8.setBackground(java.awt.Color.white);
  b8.addActionListener(this);
  b9 = new JButton("9");
  b9.setBackground(java.awt.Color.white);
  b9.addActionListener(this);
  ba = new JButton("+");
  ba.setBackground(java.awt.Color.white);
  ba.addActionListener(this);
  bs = new JButton("-");
  bs.setBackground(java.awt.Color.white);
  bs.addActionListener(this);
  bm = new JButton("*");
  bm.setBackground(java.awt.Color.white);
  bm.addActionListener(this);
  bd = new JButton("/");
  bd.setBackground(java.awt.Color.white);
  bd.addActionListener(this);
  be = new javax.swing.JButton("=");
  be.setBackground(new java.awt.Color(204,102,0));
  be.addActionListener(this);
  bc = new JButton("C");
  bc.setBackground(java.awt.Color.white);
  bc.addActionListener(this);
  bb = new JButton("B");
  bb.setBackground(java.awt.Color.white);
  bb.addActionListener(this);
  bt = new JButton(".");
  bt.setBackground(java.awt.Color.white);
  bt.addActionListener(this);
  bmp = new JButton("\u00B1");
  bmp.setBackground(java.awt.Color.white);
  bmp.addActionListener(this);
  bpr = new JButton("%");
  bpr.setBackground(java.awt.Color.white);
  bpr.addActionListener(this);

  panel.add(bc);
  panel.add(bd);
  panel.add(bm);
  panel.add(bb);

  panel.add(b7);
  panel.add(b8);
  panel.add(b9);
  panel.add(bs);
  panel.add(b4);
  panel.add(b5);
  panel.add(b6);
  panel.add(ba);
  panel.add(b1);
  panel.add(b2);
  panel.add(b3);
  panel.add(bpr);
  panel.add(b0);
  panel.add(bt);
  panel.add(bmp);
  panel.add(be);
  frame.add(l1);
  frame.add(tf);
  frame.add(panel);
  frame.setVisible(true);

  }
 
  //helpful method for design
  public void show(){
  frame.getContentPane().setBackground(new java.awt.Color(51,51,51));
  //panel.setBackground(java.awt.Color.red);
  l1.setOpaque(true);
  l1.setBackground(new java.awt.Color(51,51,51));
  l1.setForeground(java.awt.Color.WHITE);
  }
  //end of design
  

  //controlling the operations flow and actions
  public void actionPerformed(ActionEvent e){
  try{
  if(e.getActionCommand() instanceof String){
    String s = (String) e.getActionCommand();
      if(s.charAt(s.length()-1)=='0'||s.charAt(s.length()-1)==('1')||s.charAt(s.length()-1)=='2'||s.charAt(s.length()-1)=='3'||s.charAt(s.length()-1)=='4'||s.charAt(s.length()-1)=='5'||s.charAt(s.length()-1)=='6'||s.charAt(s.length()-1)=='7'||s.charAt(s.length()-1)=='8'||s.charAt(s.length()-1)=='9'){
        if(!tf.getText().equals("wrong format")){
          tf.setText(tf.getText()+s);
        }   
        else if(tf.getText().equals("wrong format")||tf.getText()=="0.0"){
          tf.setText("");
          tf.setText(tf.getText()+s);
          newNum = false;
        }
      }
      else{
        
        op = s.charAt(0);
         String st = tf.getText();
          if((tf.getText().length()==0&&op=='+')||(tf.getText().length()==0&&op=='-')||(tf.getText().length()==0&&op=='*')||(tf.getText().length()==0&&op=='/')||(tf.getText().length()==0&&op=='%')||(tf.getText().length()==0&&op=='C')||(tf.getText().length()==0&&op=='B')||(tf.getText().length()==0&&op=='='))
            tf.setText("");
          else if((tf.getText().length()==0&&s=="\u00B1"))
            tf.setText("-"); 
          else if(((st.charAt(st.length()-1) != '+') && (op == '+') && (st.charAt(st.length()-1) != '-') && (op == '+') && (st.charAt(st.length()-1) != '*') && (op == '+') && (st.charAt(st.length()-1) != '/') && (op == '+')&&(st.charAt(st.length()-1) != '%') && (op == '+')&&!tf.getText().equals("wrong format"))  ||  ((st.charAt(st.length()-1) != '+') && (op == '-') && (st.charAt(st.length()-1) != '-') && (op == '-') && (st.charAt(st.length()-1) != '*') && (op == '-') && (st.charAt(st.length()-1) != '/') && (op == '-')&&(st.charAt(st.length()-1) != '%') && (op == '-')&&!tf.getText().equals("wrong format"))  ||  ((st.charAt(st.length()-1) != '+') && (op == '*') && (st.charAt(st.length()-1) != '-') && (op == '*') && (st.charAt(st.length()-1) != '*') && (op == '*') && (st.charAt(st.length()-1) != '/') && (op == '*')&&(st.charAt(st.length()-1) != '%') && (op == '*')&&!tf.getText().equals("wrong format"))  ||  ((st.charAt(st.length()-1) != '+') && (op == '/') && (st.charAt(st.length()-1) != '-') && (op == '/') && (st.charAt(st.length()-1) != '*') && (op == '/') && (st.charAt(st.length()-1) != '/') && (op == '/')&&(st.charAt(st.length()-1) != '%') && (op == '/')&&!tf.getText().equals("wrong format")) || ((st.charAt(st.length()-1) != '+') && (op == '%') && (st.charAt(st.length()-1) != '-') && (op == '%') && (st.charAt(st.length()-1) != '*') && (op == '%') && (st.charAt(st.length()-1) != '/') && (op == '%')&&(st.charAt(st.length()-1) != '%') && (op == '%')&&!tf.getText().equals("wrong format")))
            tf.setText(tf.getText()+op);
          else if(((st.charAt(st.length()-1) == '+') && (op == '+') || (st.charAt(st.length()-1) == '-') && (op == '+') || (st.charAt(st.length()-1) == '*') && (op == '+') || (st.charAt(st.length()-1) == '/') && (op == '+')||(st.charAt(st.length()-1) == '%') && (op == '+'))  ||  ((st.charAt(st.length()-1) == '+') && (op == '-') || (st.charAt(st.length()-1) == '-') && (op == '-') || (st.charAt(st.length()-1) == '*') && (op == '-') || (st.charAt(st.length()-1) == '/') && (op == '-')||(st.charAt(st.length()-1) == '%') && (op == '-'))  ||  ((st.charAt(st.length()-1) == '+') && (op == '*') || (st.charAt(st.length()-1) == '-') && (op == '*') || (st.charAt(st.length()-1) == '*') && (op == '*') || (st.charAt(st.length()-1) == '/') && (op == '*')||(st.charAt(st.length()-1) == '%') && (op == '*'))  ||  ((st.charAt(st.length()-1) == '+') && (op == '/') || (st.charAt(st.length()-1) == '-') && (op == '/') || (st.charAt(st.length()-1) == '*') && (op == '/') || (st.charAt(st.length()-1) == '/') && (op == '/')||(st.charAt(st.length()-1) == '%') && (op == '/'))||((st.charAt(st.length()-1) == '+') && (op == '%') || (st.charAt(st.length()-1) == '-') && (op == '%') || (st.charAt(st.length()-1) == '*') && (op == '%') || (st.charAt(st.length()-1) == '/') && (op == '%')||(st.charAt(st.length()-1) == '%') && (op == '%')))
          tf.setText(st.substring(0,st.length()-1) + op);
          else if(op =='C')
          tf.setText("");
          else if(op == 'B')
          tf.setText(st.substring(0,st.length()-1));
          else if((st.charAt(st.length()-1) == '+') && (op == '.') || (st.charAt(st.length()-1) == '-') && (op == '.') || (st.charAt(st.length()-1) == '*') && (op == '.') || (st.charAt(st.length()-1) == '/') && (op == '.')||(st.charAt(st.length()-1) == '%') && (op == '.'))
          tf.setText(tf.getText()+"0"+op);
          else if((st.charAt(st.length()-1) == '0') && (op == '.') || (st.charAt(st.length()-1) == '1') && (op == '.') || (st.charAt(st.length()-1) == '2') && (op == '.') || (st.charAt(st.length()-1) == '3') && (op == '.')||(st.charAt(st.length()-1) == '4') && (op == '.') || (st.charAt(st.length()-1) == '5') && (op == '.') || (st.charAt(st.length()-1) == '6') && (op == '.') || (st.charAt(st.length()-1) == '7') && (op == '.') || (st.charAt(st.length()-1) == '8') && (op == '.') || (st.charAt(st.length()-1) == '9') && (op == '.'))
          for(int i=st.length()-1; i>=0; i--){
            if(st.charAt(i)=='+'||st.charAt(i)=='-'||st.charAt(i)=='*'||st.charAt(i)=='/'||st.charAt(i)=='%'){
            tf.setText(tf.getText()+op);
            break;
            }else if(st.charAt(i) == '.'){
            tf.setText(tf.getText());
            break;
            }else if(i==0 && st.charAt(i)!='-'){ 
            tf.setText(tf.getText()+op);
            break;}
          }
          else if(op == '=')
          tf.setText(Double.toString(cal(tf.getText())));
         
      }
  
  }
  }catch(Exception ex){
    tf.setText("wrong format");
    //ex.printStackTrace();
  }
   
  return;
    
  }
   
 //functionality method  
 public static double cal(String st){
     
   for(int n=0; n<st.length(); n++){
    if((st.charAt(n) != '/') || (st.charAt(n) != '*')|| (st.charAt(n) != '%')){
       dos = st;
       break;
    }
   }
  
   //checking and handling operation with higher periority such as (*,/and %)
   for(int i =0; i<st.length(); i++){
     
     if((st.charAt(i) == '/') || (st.charAt(i) == '*')|| (st.charAt(i) == '%')){
        
        char c = st.charAt(i);
        l = st.indexOf(c);
        for(int j=l-1; j>=0; j--){
         if((st.charAt(j)=='+')||(st.charAt(j)=='-')||(st.charAt(j)=='*')||(st.charAt(j)=='/')){
          first = Double.parseDouble(st.substring(j+1,l));
          hj = j;
         }else if(j==0){
          first = Double.parseDouble(st.substring(0,l));
          hj = j;
         }else{continue;}
         break;
        }
       
        for(int t=l+1; t<st.length(); t++){
         if((st.charAt(t)=='+')||(st.charAt(t)=='-')||(st.charAt(t)=='*')||(st.charAt(t)=='/')){
          second = Double.parseDouble(st.substring(l+1,t));
          ht = t;
         }else if(t==st.length()-1){
          second = Double.parseDouble(st.substring(l+1));
          ht=st.length()-1;
         }else{continue;}
         break;
        }
           oop = st.charAt(l);
           switch(oop){
             case '*': 
               result = first * second;
               break;
             case '/':
               result = first / second;
               break;
             case '%':
               result = first % second;
               break;
            }
     if((hj!=0) && (ht!=st.length()-1)){
     st = st.substring(0,hj+1)+Double.toString(result)+st.substring(ht);
     dos = st;
     cal(st);
     }else if((hj==0) && (ht!=st.length()-1)){
     st = Double.toString(result)+st.substring(ht);
     dos = st;
     cal(st);
     }else if((hj!=0) && (ht==st.length()-1)){
     st = st.substring(0,hj+1)+Double.toString(result);
     dos = st;
     cal(st);
     }else if((hj==0) && (ht==st.length()-1)){
     st = Double.toString(result);
     dos = st;
     }
    break;
    }
    
    } 
   
//314    
    //checking and handling operations with lower periority such as (+and-)
    for(int i =0; i<dos.length(); i++){
      
      if((dos.charAt(i) == '+') || (dos.charAt(i) == '-')){
         
        l = dos.indexOf(dos.charAt(i));
         if(l==0&&dos.charAt(l)=='-'){
          for(int c=1; c<dos.length(); c++){
          if(dos.charAt(c)=='+'||dos.charAt(c)=='-'){
          l = c;
          first = Double.parseDouble(dos.substring(0,l));
          }else if((dos.charAt(c)!='+'||dos.charAt(c)!='-')&&c==dos.length()-1){
           first = 0;
          }else{continue;}
          break;
         }
         }else{
          first = Double.parseDouble(dos.substring(0,l));
         }

      for(int r=l+1; r<dos.length(); r++){
        if((dos.charAt(r)=='+')||(dos.charAt(r)=='-')){
          second = Double.parseDouble(dos.substring(l+1,r));
          ht = r;
        }else if(r==dos.length()-1){
          second = Double.parseDouble(dos.substring(l+1));
          ht = dos.length();
        }else{continue;}
       break;
      }
      
        oop = dos.charAt(l);
        switch(oop){
          case '+':
            result = first + second;
            break;
          case '-':
            result = first - second;
            break;
        }
     if(ht<dos.length()-1){
     dos = Double.toString(result)+dos.substring(ht);
     cal(dos);
     }else{
     dos = Double.toString(result);
     break;
     } 
     break;
      }
    }
    result = Double.parseDouble(dos);
   return result;
 }
   
  //main method
  public static void main(String args[]){
    DemoClass d = new DemoClass("calculator",326,373);
    d.show();
  } 
}