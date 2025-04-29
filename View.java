package ELDERCARE;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JTextField IDField;
	private JTextField hotenField;
	private JTextField sodienthoaiField;
	private JTextField nguoithanField;
	private JTextField timkiemField;
	private JTable benhnhanTable;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public View() {
		setTitle("ELDERCARE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 30, 1100, 630);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(253, 245, 230));
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		JButton trangchuButton = new JButton("Trang chủ");
		trangchuButton.setHorizontalAlignment(SwingConstants.LEFT);
		trangchuButton.setForeground(new Color(0, 0, 0));
		trangchuButton.setIcon(new ImageIcon(View.class.getResource("/images/trangchu.png")));
		trangchuButton.setBackground(new Color(245, 245, 245));
		trangchuButton.setFont(new Font("Constantia", Font.BOLD, 19));
		trangchuButton.setBounds(35, 54, 170, 38);
		mainPanel.add(trangchuButton);
				
		
		JButton benhnhanButton = new JButton("Bệnh nhân");
		benhnhanButton.setForeground(new Color(0, 0, 0));
		benhnhanButton.setHorizontalAlignment(SwingConstants.LEFT);
		benhnhanButton.setIcon(new ImageIcon(View.class.getResource("/images/benhnhan.png")));
		benhnhanButton.setBackground(new Color(245, 245, 245));
		benhnhanButton.setFont(new Font("Constantia", Font.BOLD, 19));
		benhnhanButton.setBounds(35, 125, 170, 38);
		mainPanel.add(benhnhanButton);
		
		JButton benhanButton = new JButton("Bệnh án");
		benhanButton.setIcon(new ImageIcon(View.class.getResource("/images/vienthuoc.png")));
		benhanButton.setHorizontalAlignment(SwingConstants.LEFT);
		benhanButton.setForeground(Color.BLACK);
		benhanButton.setFont(new Font("Constantia", Font.BOLD, 19));
		benhanButton.setBackground(new Color(245, 245, 245));
		benhanButton.setBounds(35, 196, 170, 38);
		mainPanel.add(benhanButton);
		
		JButton hoadonButton = new JButton("Hóa đơn");
		hoadonButton.setIcon(new ImageIcon(View.class.getResource("/images/hoadon.png")));
		hoadonButton.setHorizontalAlignment(SwingConstants.LEFT);
		hoadonButton.setForeground(Color.BLACK);
		hoadonButton.setFont(new Font("Constantia", Font.BOLD, 19));
		hoadonButton.setBackground(new Color(245, 245, 245));
		hoadonButton.setBounds(35, 262, 170, 38);
		mainPanel.add(hoadonButton);
		
		JButton nhansuButton = new JButton("Nhân sự");
		nhansuButton.setForeground(new Color(0, 0, 0));
		nhansuButton.setHorizontalAlignment(SwingConstants.LEFT);
		nhansuButton.setIcon(new ImageIcon(View.class.getResource("/images/nhansu.png")));
		nhansuButton.setBackground(new Color(245, 245, 245));
		nhansuButton.setFont(new Font("Constantia", Font.BOLD, 19));
		nhansuButton.setBounds(35, 330, 170, 38);
		mainPanel.add(nhansuButton);
		
		JButton phancongButton = new JButton("Phân công");
		phancongButton.setIcon(new ImageIcon(View.class.getResource("/images/phancong.png")));
		phancongButton.setHorizontalAlignment(SwingConstants.LEFT);
		phancongButton.setForeground(Color.BLACK);
		phancongButton.setFont(new Font("Constantia", Font.BOLD, 19));
		phancongButton.setBackground(new Color(245, 245, 245));
		phancongButton.setBounds(35, 400, 170, 38);
		mainPanel.add(phancongButton);
		
		JButton baocaoButton = new JButton("Báo cáo");
		baocaoButton.setHorizontalAlignment(SwingConstants.LEFT);
		baocaoButton.setIcon(new ImageIcon(View.class.getResource("/images/baocao.png")));
		baocaoButton.setForeground(new Color(0, 0, 0));
		baocaoButton.setBackground(new Color(245, 245, 245));
		baocaoButton.setFont(new Font("Constantia", Font.BOLD, 19));
		baocaoButton.setBounds(35, 469, 170, 38);
		mainPanel.add(baocaoButton);
		
		JButton nhantinButton = new JButton("Nhắn tin");
		nhantinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nhantinButton.setHorizontalAlignment(SwingConstants.LEFT);
		nhantinButton.setIcon(new ImageIcon(View.class.getResource("/images/nhantin.png")));
		nhantinButton.setForeground(new Color(0, 0, 0));
		nhantinButton.setBackground(new Color(245, 245, 245));
		nhantinButton.setFont(new Font("Constantia", Font.BOLD, 19));
		nhantinButton.setBounds(35, 532, 170, 38);
		mainPanel.add(nhantinButton);
		
		JLabel logoutLabel = new JLabel("Đăng xuất");
		logoutLabel.setFont(new Font("Constantia", Font.PLAIN, 15));
		logoutLabel.setBounds(1002, 11, 74, 32);
		mainPanel.add(logoutLabel);
		
		
		JPanel Panel = new JPanel();
		Panel.setBounds(215, 44, 861, 522);
		mainPanel.add(Panel);
		Panel.setLayout(new CardLayout(0, 0));
		
		JPanel trangchuPanel = new JPanel();
		trangchuPanel.setBackground(new Color(253, 245, 230));
		Panel.add(trangchuPanel, "trangchuPanel");
		trangchuPanel.setLayout(null);
		
		//Nhấn nút Trang chủ về panel trang chủ
		
		trangchuButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    @Override
		    public void mouseClicked(java.awt.event.MouseEvent e) {
		        CardLayout cl = (CardLayout) Panel.getLayout();
		        cl.show(Panel, "trangchuPanel"); 
		    }
		});
		
		
		JLabel homeLabel1 = new JLabel("");
		homeLabel1.setBounds(14, 87, 256, 256);
		homeLabel1.setIcon(new ImageIcon(View.class.getResource("/images/eldercare.png")));
		trangchuPanel.add(homeLabel1);
		
		JLabel homeLabel2 = new JLabel("HỆ THỐNG QUẢN LÍ VIỆN DƯỠNG LÃO");
		homeLabel2.setForeground(new Color(139, 69, 19));
		homeLabel2.setFont(new Font("Verdana", Font.BOLD, 25));
		homeLabel2.setBounds(158, 11, 599, 43);
		trangchuPanel.add(homeLabel2);
		
		JLabel homeLabel3 = new JLabel("-Sống khỏe, sống vui, sống ý nghĩa mỗi ngày-");
		homeLabel3.setForeground(new Color(139, 69, 19));
		homeLabel3.setFont(new Font("Constantia", Font.BOLD, 20));
		homeLabel3.setBounds(368, 60, 448, 25);
		trangchuPanel.add(homeLabel3);
		
		JLabel homeLabel4 = new JLabel("<html><b>ElderCare</b> là mái ấm dành cho người cao tuổi, nơi chúng tôi mang đến sự chăm sóc tận tình, môi trường thân thiện và cuộc sống ý nghĩa cho người thân yêu của bạn.<br><br>Ứng dụng quản lý viện dưỡng lão giúp theo dõi thông tin cư dân, sức khỏe, lịch khám – tất cả trong một giao diện dễ dùng, hiện đại và nhân văn.</div></html>");
		homeLabel4.setForeground(new Color(139, 0, 0));
		homeLabel4.setFont(new Font("Constantia", Font.PLAIN, 20));
		homeLabel4.setVerticalAlignment(SwingConstants.TOP);
		homeLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		homeLabel4.setBounds(280, 177, 515, 185);
		trangchuPanel.add(homeLabel4);
		
		JLabel tacgia = new JLabel("Tống Mỹ Trà - Trần Văn Tri\r\n");
		tacgia.setFont(new Font("Courier New", Font.PLAIN, 15));
		tacgia.setBounds(618, 497, 243, 25);
		trangchuPanel.add(tacgia);
		
		JPanel benhnhanPanel = new JPanel();
		benhnhanPanel.setBackground(new Color(253, 245, 230));
		Panel.add(benhnhanPanel, "benhnhanPanel");
		benhnhanPanel.setLayout(null);
		
		//Nhấn nút Bệnh Nhân về panel Bệnh nhân
		
				benhnhanButton.addMouseListener(new java.awt.event.MouseAdapter() {
				    @Override
				    public void mouseClicked(java.awt.event.MouseEvent e) {
				        CardLayout cl = (CardLayout) Panel.getLayout();
				        cl.show(Panel, "benhnhanPanel"); 
				    }
				});
		
		DefaultTableModel benhnhanModel = new DefaultTableModel(new String[] {"Mã cư dân", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Người thân", "Ngày vào viện"}, 0);
		
		JTable benhnhanTable = new JTable(benhnhanModel);
		benhnhanTable.setToolTipText("");
		benhnhanTable.setBorder(new LineBorder(new Color(64, 64, 64), 2, true));
		benhnhanTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		benhnhanTable.setForeground(new Color(128, 0, 0));
		benhnhanTable.setBackground(new Color(227, 227, 227));
		
		JScrollPane benhnhanScrollPane = new JScrollPane(benhnhanTable);
		benhnhanScrollPane.setViewportBorder(null);
		benhnhanScrollPane.setToolTipText("");
		benhnhanScrollPane.setBounds(10, 184, 687, 327);
		benhnhanPanel.add(benhnhanScrollPane);
		
		JLabel IDLabel = new JLabel("Mã cư dân:");
		IDLabel.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel.setBounds(34, 31, 83, 26);
		benhnhanPanel.add(IDLabel);
		
		JLabel IDLabel_1 = new JLabel("Họ tên: ");
		IDLabel_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_1.setBounds(34, 86, 83, 26);
		benhnhanPanel.add(IDLabel_1);
		
		JLabel IDLabel_2 = new JLabel("Ngày sinh: ");
		IDLabel_2.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_2.setBounds(34, 135, 83, 26);
		benhnhanPanel.add(IDLabel_2);
		
		JLabel IDLabel_3 = new JLabel("Giới tính:");
		IDLabel_3.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_3.setBounds(317, 31, 83, 26);
		benhnhanPanel.add(IDLabel_3);
		
		JLabel IDLabel_4 = new JLabel("Địa chỉ");
		IDLabel_4.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_4.setBounds(317, 81, 83, 26);
		benhnhanPanel.add(IDLabel_4);
		
		JLabel IDLabel_5 = new JLabel("Số điện thoại:");
		IDLabel_5.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_5.setBounds(317, 135, 99, 26);
		benhnhanPanel.add(IDLabel_5);
		
		JLabel IDLabel_6 = new JLabel("Người thân: ");
		IDLabel_6.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_6.setBounds(614, 36, 93, 26);
		benhnhanPanel.add(IDLabel_6);
		
		JLabel IDLabel_7 = new JLabel("Ngày vào viện: ");
		IDLabel_7.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDLabel_7.setBounds(614, 91, 112, 26);
		benhnhanPanel.add(IDLabel_7);
		
		IDField = new JTextField();
		IDField.setFont(new Font("Constantia", Font.PLAIN, 15));
		IDField.setBounds(127, 33, 109, 20);
		benhnhanPanel.add(IDField);
		IDField.setColumns(10);
		
		hotenField = new JTextField();
		hotenField.setFont(new Font("Constantia", Font.PLAIN, 15));
		hotenField.setColumns(10);
		hotenField.setBounds(127, 88, 109, 20);
		benhnhanPanel.add(hotenField);
		
		sodienthoaiField = new JTextField();
		sodienthoaiField.setFont(new Font("Constantia", Font.PLAIN, 15));
		sodienthoaiField.setBounds(438, 132, 106, 20);
		benhnhanPanel.add(sodienthoaiField);
		sodienthoaiField.setColumns(10);
		
		JTextArea diachiField = new JTextArea();
		diachiField.setFont(new Font("Monospaced", Font.PLAIN, 15));
		diachiField.setBounds(438, 81, 106, 33);
		benhnhanPanel.add(diachiField);
		
		nguoithanField = new JTextField();
		nguoithanField.setFont(new Font("Constantia", Font.PLAIN, 15));
		nguoithanField.setColumns(10);
		nguoithanField.setBounds(717, 33, 109, 20);
		benhnhanPanel.add(nguoithanField);
		
		JRadioButton namRadioButton = new JRadioButton("Nam");
		namRadioButton.setBackground(new Color(253, 245, 230));
		namRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		namRadioButton.setFont(new Font("Constantia", Font.PLAIN, 14));
		namRadioButton.setBounds(433, 32, 57, 23);
		benhnhanPanel.add(namRadioButton);
		
		JRadioButton nuRadioButton = new JRadioButton("Nữ");
		nuRadioButton.setBackground(new Color(253, 245, 230));
		nuRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		nuRadioButton.setFont(new Font("Constantia", Font.PLAIN, 14));
		nuRadioButton.setBounds(492, 32, 57, 23);
		benhnhanPanel.add(nuRadioButton);
		
		ButtonGroup gioitinh = new ButtonGroup();
		gioitinh.add(namRadioButton);
		gioitinh.add(nuRadioButton);
		
		JPanel chucnangBenhNhanPanel = new JPanel();
		chucnangBenhNhanPanel.setBackground(new Color(245, 245, 245));
		chucnangBenhNhanPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1EE9c n\u0103ng", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(105, 105, 105)));
		chucnangBenhNhanPanel.setBounds(707, 184, 144, 210);
		benhnhanPanel.add(chucnangBenhNhanPanel);
		chucnangBenhNhanPanel.setLayout(null);
		
		JLabel them = new JLabel("Thêm");
		them.setBounds(10, 22, 94, 36);
		them.setIcon(new ImageIcon(View.class.getResource("/images/them.png")));
		them.setFont(new Font("Constantia", Font.PLAIN, 15));
		chucnangBenhNhanPanel.add(them);
		
		JLabel sua = new JLabel("Sửa");
		sua.setIcon(new ImageIcon(View.class.getResource("/images/sua.png")));
		sua.setFont(new Font("Constantia", Font.PLAIN, 15));
		sua.setBounds(10, 74, 94, 36);
		chucnangBenhNhanPanel.add(sua);
		
		JLabel xuatExcel = new JLabel("Xuất Excel");
		xuatExcel.setIcon(new ImageIcon(View.class.getResource("/images/excel.png")));
		xuatExcel.setFont(new Font("Constantia", Font.PLAIN, 15));
		xuatExcel.setBounds(10, 168, 124, 36);
		chucnangBenhNhanPanel.add(xuatExcel);
		
		JLabel xoa_1 = new JLabel("Xóa");
		xoa_1.setIcon(new ImageIcon(View.class.getResource("/images/xoa.png")));
		xoa_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		xoa_1.setBounds(10, 121, 94, 36);
		chucnangBenhNhanPanel.add(xoa_1);
		
		JPanel timkiemPanel = new JPanel();
		timkiemPanel.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(105, 105, 105)));
		timkiemPanel.setBackground(new Color(245, 245, 245));
		timkiemPanel.setBounds(707, 408, 144, 103);
		benhnhanPanel.add(timkiemPanel);
		timkiemPanel.setLayout(null);
		
		timkiemField = new JTextField();
		timkiemField.setFont(new Font("Constantia", Font.PLAIN, 15));
		timkiemField.setBackground(new Color(255, 255, 255));
		timkiemField.setBounds(10, 28, 124, 20);
		timkiemPanel.add(timkiemField);
		timkiemField.setColumns(10);
		
		JLabel timkiemButton = new JLabel("");
		timkiemButton.setIcon(new ImageIcon(View.class.getResource("/images/timkiem.png")));
		timkiemButton.setBounds(110, 59, 24, 33);
		timkiemPanel.add(timkiemButton);
		
		JPanel benhanPanel = new JPanel();
		benhanPanel.setBackground(new Color(253, 245, 230));
		Panel.add(benhanPanel, "name_1046541005240200");
		benhanPanel.setLayout(null);
		
		DefaultTableModel benhanModel = new DefaultTableModel(new String[] {"Mã bệnh án","Mã cư dân", "Họ tên", "Phụ trách", "Ngày khám", "Tổng quan", "Chẩn đoán", "Đơn thuốc", "Ghi chú"}, 0);
		
		JTable benhanTable = new JTable(benhanModel);
		benhanTable.setToolTipText("");
		benhanTable.setBorder(new LineBorder(new Color(64, 64, 64), 2, true));
		benhanTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		benhanTable.setForeground(new Color(128, 0, 0));
		benhanTable.setBackground(new Color(227, 227, 227));
		
		JScrollPane benhanScrollPane = new JScrollPane(benhanTable);
		benhanScrollPane.setViewportBorder(null);
		benhanScrollPane.setToolTipText("");
		benhanScrollPane.setBounds(10, 204, 698, 307);
		benhanPanel.add(benhanScrollPane);
		
		JLabel NewLabel = new JLabel("Mã bệnh án:");
		NewLabel.setFont(new Font("Constantia", Font.PLAIN, 15));
		NewLabel.setBounds(29, 33, 90, 29);
		benhanPanel.add(NewLabel);
		
		JLabel lblMCDn = new JLabel("Mã cư dân:");
		lblMCDn.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblMCDn.setBounds(29, 89, 90, 29);
		benhanPanel.add(lblMCDn);
		
		JLabel lblHTn = new JLabel("Họ tên:");
		lblHTn.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblHTn.setBounds(29, 148, 90, 29);
		benhanPanel.add(lblHTn);
		
		JLabel lblPhTrch = new JLabel("Phụ trách:");
		lblPhTrch.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblPhTrch.setBounds(296, 39, 90, 29);
		benhanPanel.add(lblPhTrch);
		
		JLabel lblNgyKhm = new JLabel("Ngày khám:");
		lblNgyKhm.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblNgyKhm.setBounds(296, 95, 90, 29);
		benhanPanel.add(lblNgyKhm);
		
		JLabel lblTngQuan = new JLabel("Tổng quan:");
		lblTngQuan.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblTngQuan.setBounds(296, 148, 90, 29);
		benhanPanel.add(lblTngQuan);
		
		JLabel lblChnon = new JLabel("Chẩn đoán");
		lblChnon.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblChnon.setBounds(591, 39, 90, 29);
		benhanPanel.add(lblChnon);
		
		JLabel lblnThuc = new JLabel("Đơn thuốc:");
		lblnThuc.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblnThuc.setBounds(591, 95, 90, 29);
		benhanPanel.add(lblnThuc);
		
		JLabel lblGhiCh = new JLabel("Ghi chú:");
		lblGhiCh.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblGhiCh.setBounds(591, 148, 90, 29);
		benhanPanel.add(lblGhiCh);
		
		textField = new JTextField();
		textField.setFont(new Font("Constantia", Font.PLAIN, 15));
		textField.setBounds(129, 36, 108, 26);
		benhanPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(129, 92, 108, 26);
		benhanPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Constantia", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(129, 151, 108, 26);
		benhanPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Constantia", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(691, 36, 108, 26);
		benhanPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Constantia", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(691, 92, 108, 26);
		benhanPanel.add(textField_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(691, 149, 108, 44);
		benhanPanel.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Constantia", Font.PLAIN, 15));
		comboBox.setBounds(396, 41, 138, 26);
		benhanPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		comboBox_1.setBounds(396, 150, 138, 26);
		benhanPanel.add(comboBox_1);
		
		JPanel chucnangBenhAnPanel = new JPanel();
		chucnangBenhAnPanel.setLayout(null);
		chucnangBenhAnPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1EE9c n\u0103ng", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(105, 105, 105)));
		chucnangBenhAnPanel.setBackground(new Color(245, 245, 245));
		chucnangBenhAnPanel.setBounds(717, 204, 144, 210);
		benhanPanel.add(chucnangBenhAnPanel);
		
		JLabel them_1 = new JLabel("Thêm");
		them_1.setIcon(new ImageIcon(View.class.getResource("/images/them.png")));
		them_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		them_1.setBounds(10, 22, 94, 36);
		chucnangBenhAnPanel.add(them_1);
		
		JLabel sua_1 = new JLabel("Sửa");
		sua_1.setIcon(new ImageIcon(View.class.getResource("/images/sua.png")));
		sua_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		sua_1.setBounds(10, 74, 94, 36);
		chucnangBenhAnPanel.add(sua_1);
		
		JLabel xuatExcel_1 = new JLabel("Xuất Excel");
		xuatExcel_1.setIcon(new ImageIcon(View.class.getResource("/images/excel.png")));
		xuatExcel_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		xuatExcel_1.setBounds(10, 168, 124, 36);
		chucnangBenhAnPanel.add(xuatExcel_1);
		
		JLabel xoa_1_1 = new JLabel("Xóa");
		xoa_1_1.setIcon(new ImageIcon(View.class.getResource("/images/xoa.png")));
		xoa_1_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		xoa_1_1.setBounds(10, 121, 94, 36);
		chucnangBenhAnPanel.add(xoa_1_1);
		
		}
}
