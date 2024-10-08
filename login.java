
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.sql.*;
import java.awt.Graphics;
import java.time.Year;
import java.util.ArrayList;
import static javax.swing.BoxLayout.Y_AXIS;
public class login {
    login(){
     JFrame fr=new JFrame();
     JPanel pan=new JPanel();
     JPanel pan1=new JPanel();
     JLabel lb=new JLabel("Login  Form");
     lb.setFont(new Font("Arial",Font.BOLD,25));
     Label lb2=new Label();
     Label lb3=new Label("Email:");
     lb3.setFont(new Font("Arial",Font.BOLD,15));
     Label lb4=new Label("Password:");
     lb4.setFont(new Font("Arial",Font.BOLD,15));
    TextField tf1=new TextField();
    TextField tf2=new TextField();
    Button btn=new Button("Login");
    Button b2=new Button("Signup");
    pan1.setLayout(new GridBagLayout());
    GridBagConstraints gc=new GridBagConstraints();
    btn.setPreferredSize(new  Dimension(50,50));
    b2.setPreferredSize(new  Dimension(50,50));
    for(int i=1;i<=13;i+=2){
        gc.gridx=0;gc.gridy=i;
        pan1.add(new Label(""),gc);
    }
    gc.gridx=0;gc.gridy=0;gc.gridwidth=2;gc.weightx=1;gc.fill=GridBagConstraints.CENTER;
     pan1.add(lb,gc);
     gc.gridwidth=0;gc.weightx=0;
    gc.gridx=0;gc.gridy=2;
     pan1.add(lb3,gc);
    gc.gridx=0;gc.gridy=4;
     pan1.add(tf1,gc);
    gc.gridx=0;gc.gridy=6;
    pan1.add(lb4,gc);
    gc.gridx=0;gc.gridy=8;
    pan1.add(tf2,gc);
    gc.gridx=0;gc.gridy=12;
     pan1.add(lb2,gc);
    gc.weightx=2;gc.gridwidth=1;gc.fill=GridBagConstraints.NONE;
     gc.gridx=0;gc.gridy=10;
    pan1.add(btn,gc);
      gc.gridx=1;gc.gridy=10;
     pan1.add(b2,gc);
      gc.gridx=0;gc.gridy=11;
     pan1.add(lb2,gc);
    btn.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e1) {
            if(tf1.getText()!=null && tf2.getText()!=null){
                fr.dispose();
             String s1="select * from users where email="+ "'" + tf1.getText() + "'"+" "+"and"+" "+"pass="+"'" +tf2.getText() + "'";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery(s1);
                if(rs.next()){
                    System.out.println("Login Successful!");
                     JFrame jf=new JFrame();
                     Label l1=new Label("Medical Records");
                     Label l2=new Label("Patient Details:");
                     Label l3=new Label("Patient Id");
                     Label l4=new Label("First Name");
                     Label l5=new Label("Last Name");
                     Label l6=new Label("D.O.B");
                     Label l7=new Label("gender");
                     Label l8=new Label("phone Number");
                     Label l9=new Label("Address");
                     Label l10=new Label("Health Issue");
                     Label l11=new Label("Doctor Consultant");
                     Label l12=new Label("Admission Date");
                     Label l13=new Label("Discharge Date");
                     Label l14=new Label("Email");
                     TextField t1=new TextField("Enter Patient Name:");
                     TextField t2=new TextField("Enter Patient Id:");
                     TextField t3=new TextField();
                     TextField t4=new TextField();
                     TextField t5=new TextField();
                     TextField t6=new TextField();
                     TextField t7=new TextField();
                     TextField t8=new TextField();
                     TextField t9=new TextField();
                     TextField t10=new TextField();
                     TextField t11=new TextField();
                     TextField t12=new TextField();
                     TextField t13=new TextField();
                     TextField t14=new TextField();
                     Button billing=new Button("Billing Data");
                     Button b=new Button("Register");
                     Button b1=new Button("Retrieve");
                     Button Appoint=new Button("Appointments");
                     Button Appoint1=new Button("Add Appointments");
                     Object[][] data=new Object[10][5];
                     ArrayList<String> str=new ArrayList<String>();
                     str.add("Appointment id");str.add("Patient Name");str.add("doctors Name");str.add("Date");str.add("Phone Number");
                     for(int i=0;i<=4;i++){
                         data[0][i]=str.remove(0);
                     }
                     Appoint.addMouseListener(new MouseAdapter() {
                                                   public void mouseClicked(MouseEvent e) {
                                                       System.out.println("appointment");
                                                       JFrame jf1 = new JFrame();
                                                       Label l1 = new Label("Appointment Form");Label l2 = new Label("Name");
                                                       Label l3 = new Label("Phone Number");Label l4 = new Label("Email");
                                                       Label l5 = new Label("Address");Label l6 = new Label("Appointment Date");
                                                       Label l7=new Label("Doctor Id");
                                                       Button applist=new Button("Appointment List");
                                                       TextField tf1=new TextField("");TextField tf2=new TextField("");
                                                       TextField tf3=new TextField("");TextField tf4=new TextField("");
                                                       TextField tf5=new TextField("");TextField tf6=new TextField("");
                                                       TextField tf7=new TextField("");
                                                       Button doctor=new Button("Doctor List");Button book=new Button("Book an Appointment");
                                                       jf1.setLayout(new GridBagLayout());
                                                       GridBagConstraints gc=new GridBagConstraints();
                                                       gc.gridwidth=2;gc.weightx=1;gc.fill=GridBagConstraints.CENTER;
                                                       gc.gridx=0;gc.gridy=0;jf1.add(l1,gc);
                                                       gc.gridwidth=1;gc.weightx=1;gc.fill=GridBagConstraints.HORIZONTAL;
                                                       gc.gridx=0;gc.gridy=1;jf1.add(l2,gc);
                                                       gc.gridx=0;gc.gridy=2;jf1.add(tf1,gc);gc.gridx=1;gc.gridy=2;jf1.add(tf2,gc);
                                                       gc.gridx=0;gc.gridy=3;jf1.add(l3,gc);gc.gridx=1;gc.gridy=3;jf1.add(l4,gc);
                                                       gc.gridx=0;gc.gridy=4;jf1.add(tf3,gc);gc.gridx=1;gc.gridy=4;jf1.add(tf4,gc);
                                                       gc.gridx=0;gc.gridy=5;jf1.add(l5,gc);gc.gridx=1;gc.gridy=5;jf1.add(l6,gc);
                                                       gc.gridx=0;gc.gridy=6;jf1.add(tf5,gc);gc.gridx=1;gc.gridy=6;jf1.add(tf6,gc);
                                                       gc.gridx=0;gc.gridy=7;jf1.add(l7,gc);gc.gridx=0;gc.gridy=8;jf1.add(tf7,gc);
                                                       gc.gridx=0;gc.gridy=9;jf1.add(doctor,gc);
                                                       gc.gridwidth=2;gc.gridx=0;gc.gridy=10;jf1.add(book,gc);
                                                       gc.gridx=0;gc.gridy=11;jf1.add(applist,gc);
                                                       applist.addMouseListener(new MouseAdapter(){
                                                           public void mouseClicked(MouseEvent e1){
                                                               String str="select * from appoint";
                               JFrame app=new JFrame();
                            try{
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                            Statement st2= con2.createStatement();
                           ResultSet rs=st2.executeQuery(str);
                           int c=1;
                           while(rs.next()){
                                   data[c][0]=rs.getInt("aid");
                                   data[c][1]=rs.getString("fname");
                                   data[c][2]=rs.getInt("did");
                                   data[c][3]=rs.getDate("appdate");
                                   data[c][4]=rs.getString("phno");
                                   c++;}
                           JTable jt=new JTable(data,new Object[]{"aid","pid","did","adate","phno"});
                            app.add(jt);
                            app.setLayout(new BoxLayout(app.getContentPane(),Y_AXIS));
                            jt.setPreferredSize(new Dimension(300,500));
                            app.setPreferredSize(new Dimension(500,500));
                            app.pack();
                            app.setVisible(true);}
                            catch(Exception e5){
                                System.out.println(e5);}}});
                                                       jf1.setSize(new Dimension(500,400));
                                                       jf1.setVisible(true);
                                                       System.out.println(tf6.getText());
                                                       book.addMouseListener(new MouseAdapter(){
                                                           public void mouseClicked(MouseEvent e6){
                                                               try {
                                                                   String s1="insert into appoint(fname,lname,email,appdate,did,phno,addr)values("+"'"+tf1.getText()+"'"+","+"'"+tf2.getText()+"'"+","+"'"+tf4.getText()+"'"+","+"'"+tf6.getText()+"'"+","+"'"+tf7.getText()+"'"+","+"'"+tf3.getText()+"'"+","+"'"+tf5.getText()+"'"+")";
                                                                   System.out.println(s1);
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                            Statement st2= con2.createStatement();
                           st2.executeUpdate(s1);
                           ResultSet rs1=st2.executeQuery("select * from appoint");
                           System.out.println("Appointment Booked!");
                           jf1.dispose();
                    }
                     catch(Exception e3){
                                 System.out.println(e3);
                             }}});
                                                       doctor.addMouseListener(new MouseAdapter(){
                                                           public void mouseClicked(MouseEvent e5){
                                                               JFrame jf2=new JFrame();
                                                               String s1="select * from doctors";
                                                               Object[][] data=new Object[4][4];
                                                               try{
                                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                                     Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                                                      Statement st2= con2.createStatement();
                                                      ResultSet rs1=st2.executeQuery(s1);
                                                      ArrayList<String> al1=new ArrayList<String>();
                                                   al1.add("Doctor id");al1.add("Doctor Name");al1.add("Designation");al1.add("Phone Number");
                                                     for(int i=0;i<4;i++){
                                                 data[0][i]=al1.remove(0);
                                                     System.out.println(data[0][i]);}
                                                     int c=1;
                                                     while(rs1.next()){
                                                        data[c][0]=rs1.getString("did");
                                                        data[c][1]=rs1.getString("dname");
                                                        data[c][2]=rs1.getString("designation");
                                                        data[c][3]=rs1.getString("phno");
                                                        c++;
                                                     }

                                                     JTable jt=new JTable(data,new Object[]{"Doctor id","Doctor Name","Designation","Phone Number"});
                                                     jf2.add(jt);
                                                     jf2.setSize(600,400);
                                                     jf2.setVisible(true);
                                                               }
                                                               catch(Exception e){
                                                               System.out.println(e);
                                                               }
                                                           }
                                                       });
                                                       b.addMouseListener(new MouseAdapter(){
                                                           public void mouseClicked(MouseEvent e4){
                                                               String s1="insert into appoint(aid,pid,did,adate,fname,lname,dob,gender,phno,address,hissue,doctor,adm,dis,email)values("+"'"+t1.getText()+"'"+"'"+t3.getText()+"'"+","+"'"+t4.getText()+"'"+","+"'"+t5.getText()+"'"+","+"'"+t6.getText()+"'"+","+"'"+t7.getText()+"'"+","+"'"+t8.getText()+"'"+","+"'"+t9.getText()+"'"+","+"'"+t10.getText()+"'"+","+"'"+t11.getText()+"'"+","+"'"+t12.getText()+"'"+","+"'"+t13.getText()+"'"+","+"'"+t14.getText()+"'"+")";
                     try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                            Statement st2= con2.createStatement();
                           st2.executeUpdate(s1);
                           System.out.println("Registration Successful!!");
                    }
                     catch(Exception e3){
                                 System.out.println(s1);
                             }}});}});

                     jf.setLayout(new GridBagLayout());
                     Dimension dm=new Dimension(300,200);
                     GridBagConstraints g=new GridBagConstraints();
                     g.gridx=0;g.gridy=0;
                     jf.add(l1,g);
                     l1.setFont(new Font("Arial",Font.BOLD,18));
                      l2.setFont(new Font("Arial",Font.BOLD,18));
                     g.gridx=0;g.gridy=1;
                     jf.add(t1,g);
                      g.gridx=1;g.gridy=1;
                     jf.add(t2,g);
                     g.gridx=0;g.gridy=2;
                     jf.add(l2,g);
                     g.gridx=0;g.gridy=3;
                     jf.add(l3,g);
                     g.gridx=0;g.gridy=4;
                     t3.setPreferredSize(dm);
                      g.gridwidth = 1;
                      g.weightx=2;
                     g.fill=GridBagConstraints.HORIZONTAL;
                     jf.add(t3,g);
                     g.gridx=1;g.gridy=3;
                     jf.add(l4,g);
                     g.gridx=1;g.gridy=4;
                     t4.setPreferredSize(dm);
                     jf.add(t4,g);
                     g.gridx=0;g.gridy=5;
                     jf.add(l5,g);
                     g.gridx=0;g.gridy=6;
                     t5.setPreferredSize(dm);
                     jf.add(t5,g);
                     g.gridx=1;g.gridy=5;
                     jf.add(l6,g);
                     g.gridx=1;g.gridy=6;
                     t6.setPreferredSize(dm);
                     jf.add(t6,g);
                     g.gridx=0;g.gridy=7;
                     jf.add(l7,g);
                     g.gridx=0;g.gridy=8;
                     t7.setPreferredSize(dm);
                     jf.add(t7,g);
                     g.gridx=1;g.gridy=7;
                     jf.add(l8,g);
                     g.gridx=1;g.gridy=8;
                     t8.setPreferredSize(dm);
                     jf.add(t8,g);
                     g.gridx=0;g.gridy=9;
                     jf.add(l9,g);
                     g.gridx=0;g.gridy=10;
                     t9.setPreferredSize(dm);
                     jf.add(t9,g);
                     g.gridx=1;g.gridy=9;
                     jf.add(l10,g);
                     g.gridx=1;g.gridy=10;
                     t10.setPreferredSize(dm);
                     jf.add(t10,g);
                     g.gridx=0;g.gridy=11;
                     jf.add(l11,g);
                     g.gridx=0;g.gridy=12;
                     t11.setPreferredSize(dm);
                     jf.add(t11,g);
                     g.gridx=1;g.gridy=11;
                     jf.add(l12,g);
                     g.gridx=1;g.gridy=12;
                     t12.setPreferredSize(dm);
                     jf.add(t12,g);
                     g.gridx=0;g.gridy=13;
                     jf.add(l13,g);
                     g.gridx=0;g.gridy=14;
                     t13.setPreferredSize(dm);
                     jf.add(t13,g);
                     g.gridx=1;g.gridy=13;
                     jf.add(l14,g);
                     g.gridx=1;g.gridy=14;
                     t14.setPreferredSize(dm);
                     jf.add(t14,g);
                     g.gridx=0;g.gridy=15;
                     jf.add(billing,g);
                     g.gridx=0;g.gridy=16;
                     jf.add(b,g);
                     g.gridx=1;g.gridy=16;
                     jf.add(b1,g);
                     g.gridx=0;g.gridy=17;
                     jf.add(Appoint,g);
                     Appoint.setPreferredSize(new Dimension(100,100));
                     billing.addMouseListener(new MouseAdapter(){
                         public void mouseClicked(MouseEvent e1){
                             JFrame jf=new JFrame();
                             Object[][] data=new Object[10][10];
                             try{
                                  Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                            Statement st2= con2.createStatement();
                           ResultSet rs1=st2.executeQuery("select * from billing where pid="+t3.getText());
                           ArrayList<String> al=new ArrayList<String>();
                           al.add("Billing Id");al.add("Billing Date");al.add("Patient Id");al.add("Product Name");al.add("Quantity");al.add("price(single unit)");al.add("total price");al.add("Payment Status");
                           for(int i=0;i<8;i++){
                               data[0][i]=al.remove(0);
                           }
                           int c=1;
                           while(rs1.next()){
                               data[c][0]=rs1.getInt("bid"); data[c][1]=rs1.getDate("bdate");
                                data[c][2]=rs1.getInt("pid"); data[c][3]=rs1.getString("pname");
                                 data[c][4]=rs1.getInt("quantity"); data[c][5]=rs1.getInt("perpiece");
                                  data[c][6]=rs1.getInt("totalp"); data[c][7]=rs1.getString("pstatus");
                                  c++;
                           }
                           JTable jt=new JTable(data,new Object[]{".",".",".",".",".",".",".","."});
                           jf.add(jt);
                           jf.setSize(500,500);
                           jf.setVisible(true);
                             }
                             catch(Exception e){
                            System.out.println(e);
                             }
                         }
                     });
  t1.setPreferredSize(dm);
  t2.setPreferredSize(dm);
  t3.setPreferredSize(dm);
  t4.setPreferredSize(dm);
  t5.setPreferredSize(dm);
  t6.setPreferredSize(dm);
  t7.setPreferredSize(dm);
  t8.setPreferredSize(dm);
  t9.setPreferredSize(dm);
  t10.setPreferredSize(dm);
  t11.setPreferredSize(dm);
  t12.setPreferredSize(dm);
  t13.setPreferredSize(dm);
  t14.setPreferredSize(dm);
  jf.setSize(new Dimension(400,400));
  jf.pack();
   jf.setVisible(true);
   b.addMouseListener(new MouseAdapter(){
       public void mouseClicked(MouseEvent e2){
           String s1="insert into patients(pid,fname,lname,DOB,gender,phno,email,address,healthissue,doctor,adm,dis)values("+ "'" + t3.getText() + "'" + "," + "'"+ t4.getText() + "'"+ ","+ "'" + t5.getText() + "'"+ "," +"'" + t6.getText() + "'" + "," +"'" + t7.getText()+ "'" +"," +"'"+ t8.getText()+"'"+"," + "'"+ t14.getText()+ "'"+","+"'" + t9.getText() +"'"+"," +"'" + t10.getText()+ "'"+"," +"'" + t11.getText()+ "'"+","+"'" + t12.getText()+ "'" +"," +"'"+ t13.getText()+ "'"+") ";
       try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                Statement st1 = con1.createStatement();
                st1.executeUpdate(s1);
                 System.out.println("Registration Succesfull!");

   }
   catch(Exception e3){
       System.out.println(e3);
   }}});
   b1.addMouseListener(new MouseAdapter(){
       public void mouseClicked(MouseEvent e){
           String s2="select * from patients where pid="+t2.getText()+" and fname="+"'"+t1.getText()+"'";
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
               Statement st2 = con2.createStatement();
               ResultSet rs2=st2.executeQuery(s2);
               while(rs2.next()){
           t3.setText(rs2.getString("pid"));
           t4.setText(rs2.getString("fname"));
           t5.setText(rs2.getString("lname"));
           t6.setText(rs2.getString("dob"));
           t7.setText(rs2.getString("gender"));
           t8.setText(rs2.getString("phno"));
           t9.setText(rs2.getString("address"));
           t10.setText(rs2.getString("healthissue"));
           t11.setText(rs2.getString("doctor"));
           t12.setText(rs2.getString("adm"));
           t13.setText(rs2.getString("dis"));
           t14.setText(rs2.getString("email"));
               }
           }
           catch(Exception e4) {
System.out.println(e4);
           }
           }
   });
                }
                else{
                   System.out.println("Login Failed!");
                }
                }
            catch(Exception e){
               System.out.println(s1);
            }}}});

    b2.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
    JFrame fr1=new JFrame();
    JPanel pan1=new JPanel();
    JPanel pan2=new JPanel();
    TextField tfd1=new TextField("First Name");
     TextField tfd2=new TextField("Last Name");
      TextField tfd3=new TextField();
       TextField tfd4=new TextField();
       TextField tfd5=new TextField();
       TextField tfd6=new TextField();
       JLabel jl=new JLabel("Registration Form");
       jl.setFont(new Font("Arial",Font.BOLD,17));
    Button btn1=new Button("Submit");
    pan1.setLayout(new GridBagLayout());
    pan2.setLayout(new GridBagLayout());
    GridBagConstraints gc2=new GridBagConstraints();
    GridBagConstraints gc1=new GridBagConstraints();
    gc1.gridx=0;gc1.gridy=0;
    pan1.add(jl,gc1);
    gc1.gridx=0;gc1.gridy=1;
    pan1.add(new Label(""),gc1);
    gc1.gridx=0;gc1.gridy=2;
    pan1.add(new JLabel("Name:"),gc1);
    gc1.gridx=0;gc1.gridy=4;
    pan1.add(new JLabel("Gender:"),gc1);
    gc1.gridx=1;gc1.gridy=4;
    pan1.add(new JLabel("email:"),gc1);
    gc1.gridx=0;gc1.gridy=7;
    pan1.add(new JLabel("phoneno:"),gc1);
     gc1.gridx=1;gc1.gridy=7;
    pan1.add(new Label("password:"),gc1);
    gc1.gridx=0;gc1.gridy=3;
    pan1.add(tfd1,gc1);
    tfd1.setPreferredSize(new Dimension(150,30));
    gc1.gridx=1;gc1.gridy=3;
    pan1.add(tfd2,gc1);
    tfd2.setPreferredSize(new Dimension(150,30));
    gc1.gridx=0;gc1.gridy=5;
    pan1.add(tfd3,gc1);
     gc1.gridx=1;gc1.gridy=5;
    pan1.add(tfd4,gc1);
    gc1.gridx=0;gc1.gridy=8;
    pan1.add(tfd5,gc1);
     gc1.gridx=1;gc1.gridy=8;
    pan1.add(tfd6,gc1);
    gc1.gridx=0;gc1.gridy=9;
    pan1.add(btn1,gc1);
    btn1.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e1) {
            String s2="insert into users(fname,lname,gender,email,phno,pass)values(" + "'" + tfd1.getText() + "'" + "," + "'" + tfd2.getText() + "'" + "," + "'" + tfd3.getText() + "'" + "," + "'" + tfd4.getText() + "'"+ ","  + "'" + tfd5.getText() + "'"+ ","  +"'" + tfd6.getText() + "'" +")";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith", "root", "12345678");
                Statement st = con.createStatement();
                st.executeUpdate(s2);
                System.out.println("User Registration Successful!");
            }
            catch(Exception e){
                     System.out.println("insert into users(fname,lname,gender,email,phno,pass)values(" + "'" + tfd1.getText() + "'" + "," + "'" + tfd2.getText() + "'" + "," + "'" + tfd3.getText() + "'" + "," + "'" + tfd4.getText() + "'"+ ","  + "'" + tfd5.getText() + "'"+ ","  +"'" + tfd6.getText() + "'" +")");
               System.out.println("Error!");
            }}});
    pan2.setBackground(Color.blue);
    pan1.setSize(300,300);
    pan2.setSize(500,500);
    gc2.gridx=0;gc2.gridy=1;
    pan2.add(pan1);
    fr1.add(pan2);
    tfd3.setPreferredSize(new Dimension(150,30));
    tfd4.setPreferredSize(new Dimension(150,30));
    tfd5.setPreferredSize(new Dimension(150,30));
    tfd6.setPreferredSize(new Dimension(150,30));
    btn1.setPreferredSize(new Dimension(100,40));
    fr1.setSize(600,600);
    fr1.setVisible(true);
        }
    });
    pan.setLayout(new GridBagLayout());
    GridBagConstraints gc2=new GridBagConstraints();
    gc2.gridx=0;gc2.gridy=4;
    pan.add(pan1,gc);
    fr.add(pan);
    pan1.setBackground(Color.white);
    pan1.setPreferredSize(new Dimension(400,400));
    pan.setPreferredSize(new Dimension(300,300));
    pan.setBackground(Color.blue);
    tf1.setPreferredSize(new Dimension(150,30));
    tf2.setPreferredSize(new Dimension(150,30));
    btn.setPreferredSize(new Dimension(100,40));
    b2.setPreferredSize(new Dimension(100,40));
    lb2.setFont(new Font("Arial",Font.BOLD,25));
    btn.setForeground(Color.BLUE);
    b2.setForeground(Color.BLUE);
    fr.setTitle("Login form");
    fr.setBackground(Color.blue);
    fr.setSize(600,600);
    fr.setVisible(true);
    }
    public static void main(String [] args){
        new login();
    }
}
