import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.geom.RoundRectangle2D;

public class HomePage extends JPanel implements ActionListener {

    JButton homeBtn;
    JButton filesBtn;
    JButton saveBtn;
    JButton exportBtn;
    JButton addTestBtn;
    public HomePage() {
        setLayout(null);

        //LEFT SIDE PANEL UPPER
        RoundedPanel roundedPanel = new RoundedPanel(20);
        roundedPanel.setBounds(5, 8, 180, 275);
        roundedPanel.setLayout(null);
        roundedPanel.setBackground(new Color(0xEABD8C));

        //LEFT SIDE MIDDLE PANEL
        RoundedPanel roundedPanel3 = new RoundedPanel(20);
        roundedPanel3.setBounds(5, 293, 180, 140);
        roundedPanel3.setLayout(null);
        roundedPanel3.setBackground(new Color(0xEABD8C));

        //LEFT SIDE PANEL BOTTOM
        RoundedPanel roundedPanel2 = new RoundedPanel(20);
        roundedPanel2.setBounds(5, 442, 180, 195);
        roundedPanel2.setLayout(null);
        roundedPanel2.setBackground(new Color(0xEABD8C));

        ImageIcon icon = new ImageIcon("bulb1.png");
        JLabel imgIcon = new JLabel(icon);
        imgIcon.setBounds(3,10,40,40);

        JLabel quizForge = new JLabel("QUIZ FORGE");
        quizForge.setBounds(47,10,100,40);
        quizForge.setFont(new Font("Cooper Black", Font.PLAIN, 15));

        //HOME BTN
        homeBtn = new JButton();
        homeBtn.setFont(new Font("Rockwell", Font.PLAIN, 20));
        homeBtn.setText("Home");
        homeBtn.setBounds(0, 100, 178, 50);
        homeBtn.addActionListener(this);
        homeBtn.setFocusPainted(false);
        homeBtn.setBorderPainted(false);
        homeBtn.setBackground(new Color(0xEABD8C));


        //FILES BTN
        filesBtn = new JButton();
        filesBtn.setFont(new Font("Rockwell", Font.PLAIN, 20));
        filesBtn.setText("Files");
        filesBtn.setBounds(0, 150, 178, 50);
        filesBtn.addActionListener(this);
        filesBtn.setFocusPainted(false);
        filesBtn.setBorderPainted(false);
        filesBtn.setBackground(new Color(0xEABD8C));

        //SAVE BTN
        saveBtn = new JButton();
        saveBtn.setFont(new Font("Rockwell", Font.PLAIN, 20));
        saveBtn.setText("Save");
        saveBtn.setBounds(0, 200, 178, 50);
        saveBtn.addActionListener(this);
        saveBtn.setFocusPainted(false);
        saveBtn.setBorderPainted(false);
        saveBtn.setBackground(new Color(0xEABD8C));

        //EXPORT BTN
        exportBtn = new RoundedButton("Export", 20);
        exportBtn.setFont(new Font("Rockwell", Font.PLAIN, 18));
        exportBtn.setBounds(19, 125, 140, 50);
        exportBtn.addActionListener(this);
        exportBtn.setFocusPainted(false);
        exportBtn.setBorderPainted(false);
        exportBtn.setBackground(new Color(0x89ABE3));

        //ADD TEST BTN
        addTestBtn = new RoundedButton("Add", 20);
        addTestBtn.setFont(new Font("Rockwell", Font.PLAIN, 18));
        addTestBtn.setBounds(19, 70, 140, 50);
        addTestBtn.addActionListener(this);
        addTestBtn.setFocusPainted(false);
        addTestBtn.setBorderPainted(false);
        addTestBtn.setBackground(new Color(0x89ABE3));

        //BUTTON MANAGER
        UIManager.put("Button.select", new Color(0xEABD8C).darker());


        //SIZE COMBO BOX
        String[] size = {"1","2"};
        JComboBox fontSize = new JComboBox(size);
        fontSize.setBounds(107,70,40,25);

        //FONT COMBO BOX
        String[] fnt = {"arial","Times New Roman"};
        JComboBox font = new JComboBox(fnt);
        font.setBounds(35,20,110,25);


        //PAPER SIZE COMBO BOX
        String[] pprSize = {"A4", "Long"};
        JComboBox  paperSize= new JComboBox(pprSize);
        paperSize.setBounds(32,70,70,25);

        //TEST TYPE COMBO BOX
        String[] test = {"Identification","Add Option+"};
        JComboBox testType = new JComboBox(test);
        testType.setBounds(16,20,150,25);

        //PAGE CONTENT
        roundedPanel.add(imgIcon);
        roundedPanel.add(quizForge);
        roundedPanel.add(homeBtn);
        roundedPanel.add(filesBtn);
        roundedPanel.add(saveBtn);
        roundedPanel2.add(fontSize);
        roundedPanel2.add(font);
        roundedPanel2.add(paperSize);
        roundedPanel2.add(exportBtn);
        roundedPanel3.add(testType);
        roundedPanel3.add(addTestBtn);


        //HOME PAGE PANEL
        JPanel homePanel = new JPanel();
        homePanel.setLayout(null);
        homePanel.setBounds(183,0,1101,800);
        homePanel.setBackground(Color.white);


        //HOME PANEL DROP DOWNS
        String[] dept = {"Information Technology", "Deparment ng gned"};
        JComboBox department = new JComboBox(dept);
        department.setBounds(270,150,250,30);

        String[] exam = {"Finals", "Midterm", "Exam"};
        JComboBox examUse = new JComboBox(exam);
        examUse.setBounds(270,300,250,30);

        String[] sems = {"First Semester", "Second Semester"};
        JComboBox semester = new JComboBox(sems);
        semester.setBounds(270,374,250,30);


        //HOME PANEL TEXT FIELDS
        RoundedTextField subj = new RoundedTextField();
        subj.setBounds(270, 224, 250, 30);

        RoundedTextField subjCode = new RoundedTextField();
        subjCode.setBounds(550, 224, 250, 30);

        RoundedTextField instructorName = new RoundedTextField();
        instructorName.setBounds(550, 300, 250, 30);

        RoundedTextField schoolYear = new RoundedTextField();
        schoolYear.setBounds(550, 374, 250, 30);


        //REQUIRED FIELDS
        JLabel reqDepartment = new JLabel();
        reqDepartment.setText("*");
        reqDepartment.setForeground(Color.red);
        reqDepartment.setBounds(360,126,20,20);

        JLabel reqSubject = new JLabel();
        reqSubject.setText("*");
        reqSubject.setForeground(Color.red);
        reqSubject.setBounds(327,199,20,20);

        JLabel reqSubjectCode = new JLabel();
        reqSubjectCode.setText("*");
        reqSubjectCode.setForeground(Color.red);
        reqSubjectCode.setBounds(650,199,20,20);

        JLabel reqExamUse = new JLabel();
        reqExamUse.setText("*");
        reqExamUse.setForeground(Color.red);
        reqExamUse.setBounds(391,274,20,20);

        JLabel reqInstructor = new JLabel();
        reqInstructor.setText("*");
        reqInstructor.setForeground(Color.red);
        reqInstructor.setBounds(665,274,20,20);

        JLabel reqSem = new JLabel();
        reqSem.setText("*");
        reqSem.setForeground(Color.red);
        reqSem.setBounds(339,349,20,20);

        JLabel reqYear = new JLabel();
        reqYear.setText("*");
        reqYear.setForeground(Color.red);
        reqYear.setBounds(638,349,20,20);


        //TEXT
        JLabel createExam = new JLabel("CREATE EXAM");
        createExam.setFont(new Font("Cooper Black", Font.PLAIN, 40));
        createExam.setBounds(360,40,500,40);


        JLabel deptLabel = new JLabel("Department");
        deptLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
        deptLabel.setBounds(270,127,100,20);

        JLabel subject = new JLabel("Subject");
        subject.setFont(new Font("Rockwell", Font.PLAIN, 15));
        subject.setBounds(270,200,100,20);

        JLabel subjectCode = new JLabel("Subject Code");
        subjectCode.setFont(new Font("Rockwell", Font.PLAIN, 15));
        subjectCode.setBounds(550,200,100,20);

        JLabel exmUse = new JLabel("Examination Use");
        exmUse.setFont(new Font("Rockwell", Font.PLAIN, 15));
        exmUse.setBounds(270,275,120,20);

        JLabel instructor = new JLabel("Instructor Name");
        instructor.setFont(new Font("Rockwell", Font.PLAIN, 15));
        instructor.setBounds(550,275,120,20);

        JLabel sem = new JLabel("Semester");
        sem.setFont(new Font("Rockwell", Font.PLAIN, 15));
        sem.setBounds(270,350,120,20);

        JLabel year = new JLabel("School Year");
        year.setFont(new Font("Rockwell", Font.PLAIN, 15));
        year.setBounds(550,350,120,20);



        //HOME PANEL CONTENT
        homePanel.add(createExam);
        homePanel.add(deptLabel);
        homePanel.add(department);
        homePanel.add(reqDepartment);
        homePanel.add(reqSubject);
        homePanel.add(subj);
        homePanel.add(subject);
        homePanel.add(subjCode);
        homePanel.add(subjectCode);
        homePanel.add(reqSubjectCode);
        homePanel.add(examUse);
        homePanel.add(exmUse);
        homePanel.add(reqExamUse);
        homePanel.add(instructor);
        homePanel.add(reqInstructor);
        homePanel.add(instructorName);
        homePanel.add(sem);
        homePanel.add(semester);
        homePanel.add(reqSem);
        homePanel.add(year);
        homePanel.add(schoolYear);
        homePanel.add(reqYear);


        //ADD PANEL
        add(roundedPanel);
        add(roundedPanel2);
        add(roundedPanel3);
        add(homePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==addTestBtn)
        {
            System.out.println("poo");
        }
    }

}
