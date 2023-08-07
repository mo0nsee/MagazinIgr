import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FC {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	int k=0;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	JLabel lblNewLabel_9;
	Container c = new Container();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FC window = new FC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 744, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0414\u043E\u0431\u0430\u0432\u043B\u0435\u043D\u0438\u0435 \u0442\u043E\u0432\u0430\u0440\u043E\u0432");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(257, 10, 190, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u0424\u0440\u0443\u043A\u0442\u044B");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(34, 67, 132, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u0418\u0433\u0440\u0443\u0448\u043A\u0438");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(257, 67, 153, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u0413\u0430\u0431\u0430\u0440\u0438\u0442\u043D\u044B\u0435 \u0442\u043E\u0432\u0430\u0440\u044B");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(452, 67, 190, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u0422\u0438\u043F \u0442\u043E\u0432\u0430\u0440\u0430");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(22, 112, 88, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u041D\u0430\u0437\u0432\u0430\u043D\u0438\u0435 \u043E\u0442\u0434\u0435\u043B\u0430");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(22, 159, 125, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u041D\u0430\u0437\u0432\u0430\u043D\u0438\u0435 \u0442\u043E\u0432\u0430\u0440\u0430");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(22, 201, 125, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0421\u0442\u0440\u0430\u043D\u0430 \u043F\u0440\u043E\u0438\u0437\u0432\u043E\u0434\u0438\u0442\u0435\u043B\u044C");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(22, 243, 166, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0420\u043E\u0437\u043D\u0438\u0447\u043D\u0430\u044F \u0446\u0435\u043D\u0430");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(22, 285, 111, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u041F\u043E\u0441\u0442\u0430\u0432\u0449\u0438\u043A");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(22, 327, 153, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(120, 121, 134, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(157, 168, 125, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(157, 208, 125, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(193, 250, 132, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(143, 292, 132, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(120, 334, 125, 19);
		frame.getContentPane().add(textField_5);
		
		lblNewLabel_7 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442\u043D\u043E\u0435 \u043E\u0433\u0440\u0430\u043D\u0438\u0447\u0435\u043D\u0438\u0435");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(22, 369, 223, 21);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setBounds(200, 370, 125, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_8 = new JLabel("\u0422\u0438\u043F");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(304, 123, 219, 21);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(304, 165, 95, 21);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setBounds(350, 125, 111, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setBounds(355, 168, 160, 19);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		textField_8.setVisible(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(390, 215, 330, 329);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(22, 419, 132, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u041E\u0447\u0438\u0441\u0442\u0438\u0442\u044C");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(193, 421, 132, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u041F\u0440\u043E\u0441\u043C\u043E\u0442\u0440 \u0441\u043F\u0438\u0441\u043A\u0430");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(22, 479, 182, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u0412\u044B\u0445\u043E\u0434");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(240, 479, 111, 40);
		frame.getContentPane().add(btnNewButton_3);
		
		textField.setEnabled(false);
		textField_1.setEnabled(false);
		textField_2.setEnabled(false);
		textField_3.setEnabled(false);
		textField_4.setEnabled(false);
		textField_5.setEnabled(false);
		textField_6.setEnabled(false);
		textField_7.setEnabled(false);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k=1;
				lblNewLabel_7.setText("Возрастное ограничение");
				lblNewLabel_8.setText("Тип");
				lblNewLabel_9.setText("");
				textField_8.setVisible(false);
				textField_6.setBounds(215, 370, 125, 19);
				textField_7.setBounds(350, 125, 111, 19);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(true);
				textField.setText("Игрушки");
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k=2;
				lblNewLabel_7.setText("Максимальное время хранения");
				lblNewLabel_8.setText("Температура хранения");
				lblNewLabel_9.setText("");
				textField_8.setVisible(false);
				textField_7.setBounds(470, 125, 111, 19);
				textField_6.setBounds(255, 370, 125, 19);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(true);
				textField.setText("Фрукты");
			}
		});
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k=3;
				lblNewLabel_7.setText("Высота");
				lblNewLabel_8.setText("Ширина");
				lblNewLabel_9.setText("Длина");
				textField_8.setVisible(true);
				textField_7.setBounds(370, 125, 111, 19);
				textField_6.setBounds(100, 370, 125, 19);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(true);
				textField.setText("Габаритный товар");
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TipTovara,NazOtd,NazTov,StranaProiz,Postav,MaxVrHran,TempHr,VosrGR,TIP;
				Double RoznCena,Visota,Shirina,Dlina;
				   switch (k)
			         {
			             case 1: TipTovara=textField.getText();
			             NazOtd=textField_1.getText();
			             NazTov=textField_2.getText();
			             StranaProiz=textField_3.getText();
			             RoznCena=Double.parseDouble(textField_4.getText());
			             Postav=textField_5.getText();
			             VosrGR=textField_6.getText();
			             TIP=textField_7.getText(); 
			             Supermarket IG=new Igrushki(TipTovara,NazOtd,NazTov,StranaProiz,RoznCena,Postav,VosrGR,TIP);
			             c.addTov(IG);
			             break;
			             case 2: TipTovara=textField.getText();
			             NazOtd=textField_1.getText();
			             NazTov=textField_2.getText();
			             StranaProiz=textField_3.getText();
			             RoznCena=Double.parseDouble(textField_4.getText());
			             Postav=textField_5.getText();
			             MaxVrHran=textField_6.getText();
			             TempHr=textField_7.getText();
			             Supermarket FR=new Frukts(TipTovara,NazOtd,NazTov,StranaProiz,RoznCena,Postav,MaxVrHran,TempHr);
			             c.addTov(FR);
			             break;
			             case 3: TipTovara=textField.getText();
			             NazOtd=textField_1.getText();
			             NazTov=textField_2.getText();
			             StranaProiz=textField_3.getText();
			             RoznCena=Double.parseDouble(textField_4.getText());
			             Postav=textField_5.getText();
			             Visota=Double.parseDouble(textField_6.getText());
			             Shirina=Double.parseDouble(textField_7.getText());
			             Dlina=Double.parseDouble(textField_8.getText());
			             Supermarket GB=new GabTovar(TipTovara,NazOtd,NazTov,StranaProiz,RoznCena,Postav,Visota,Shirina,Dlina);
			             c.addTov(GB);
			             break;
			             default: JOptionPane.showMessageDialog(frame,"Ошибка!","Уведомление",JOptionPane.ERROR_MESSAGE); 
			         }
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String res=c.show();
				textArea.setText(res);
			}
		});
	}
}
