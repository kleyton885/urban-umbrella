// Container: Frames
JFrame fr = new JFrame("Exemplo");
fr.setSize(800, 600);
fr.setVisible(true);

// MessageDialog
JOptionPane.showMessageDialog(null,"Comprimento: "+convertToDecimal(C.comprimento())+" m \nÁrea: "+convertToDecimal(C.area())+" m²", "INFORMACOES DO CIRCULO", JOptionPane.PLAIN_MESSAGE);
// ConfirmDialog
// InputDialog
// OptionDialog


JOptionPane.showMessageDialog(null, "Teste dialogo ERROR_MESSAGE", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
// ERROR_MESSAGE
// INFORMATION_MESSAGE
// WARNING_MESSAGE
// QUESTION_MESSAGE

// ConfirmDialog
JFrame frame = new JFrame("Exemplo");
frame.setSize(300, 300);
frame.setVisible(true);

int op = JOptionPane.showConfirmDialog(frame, "Deseja finalizar a execução?", "Saída", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
if (op==0){
	JOptionPane.showMessageDialog(null, "Encerrando programa", "Saída", JOptionPane.PLAIN_MESSAGE);
}else{
	JOptionPane.showMessageDialog(null, "Voltando ao programa", "Retorna", JOptionPane.PLAIN_MESSAGE);
}

// DEFAULT_OPTION
// YES_NO_OPTION
// YES_NO_CANCEL_OPTION
// OK_CANCEL_OPTION


// convert String to Int
Integer.parseInt(s)

// InputDialog
String s = JOptionPane.showInputDialog(null, "Digite um numero: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "O numero inserido foi: "+s, "Saída", JOptionPane.PLAIN_MESSAGE);

// OptionDialog
Object[] options = { "OK", "CANCELA" };
JOptionPane.showOptionDialog(null, "Clique OK para continuar", "Cuidado", JOptionPane.DEFAULT_OPTION, JOption.WARNING_MESSAGE, null, options, options[0]);

// Show Image from URL
try {
	String path = "http://www4c.wolframalpha.com/Calculate/MSP/MSP66221ghfh4g9e6i80d48000015gggg9c0bcda338?MSPStoreType=image/gif&s=26";
	System.out.println("Get Image from " + path);
	URL url = new URL(path);
	BufferedImage image = ImageIO.read(url);
	System.out.println("Load image into frame...");
	JLabel label = new JLabel(new ImageIcon(image));
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.getContentPane().add(label);
	f.pack();
	f.setLocation(200, 200);
	f.setVisible(true);
} catch (Exception exp) {
	exp.printStackTrace();
}

// Encerra aplicação ao fechar o frame
public class TesteWindowListener {
    public static void main(String[] args){
            JFrame frame = new JFrame("Exemplo");
            frame.setSize(300, 300);
            frame.setVisible(true);

            TrataWindow tw = new TrataWindow();
            frame.addWindowListener(tw);
    }
}

// Classe TrataWindow: Implementando interface
public class TrataWindow implements WindowListener{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
}

// Fechando Janela sem usar listener Método setDefaultCloseOperation
public class TesteJFrameCloseOperation extends JFrame{
	// construtor
	public TesteJFrameCloseOperation(){
		super("Exemplo JFrame com default close operation");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// método principal: aplicação
	public static void main(String[] args){
		TesteJFrameCloseOperation frame = new TesteJFrameCloseOperation();
	}
}

String strPath = System.getProperty("user.dir");
ImageIcon img = new ImageIcon(strPath + "\\src\\br\\unit\\al\\images\\integrais.png");
JLabel label_exemplo = new JLabel(img);
JFrame m = new JFrame(); // cria um novo frame para mostrar o gráfico
m.getContentPane().add(label_exemplo); // adiciona a imagem no frame
m.setSize(846,216); // define tamanho do frame de acordo com o tamanho da imagem
m.setVisible(true); // exibe o frame



public class JanelaEx1 extends JFrame {
    private JLabel lblNome, lblIdade, lblMensagem;
    private JTextField txtNome, txtIdade;

    public JanelaEx1 () {
        super("Primeira janela");
        setLayout(new FlowLayout());

        lblNome = new JLabel("Nome");
        lblIdade = new JLabel("Idade");
        lblMensagem = new JLabel();
        txtNome = new JTextField(20);
        txtIdade = new JTextField(3);

        add(lblNome);
        add(txtNome);
        add(lblIdade);
        add(txtIdade);
        add(lblMensagem);

        TrataTextField ttf = new TrataTextField();
        txtIdade.addActionListener(ttf);
    }

    private class TrataTextField implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == txtIdade){
                lblMensagem.setText(txtNome.getText() + " você tem " + txtIdade.getText() + " anos de idade.");
            }else{
                System.exit(0);
            }
        }
    }

    public static void main(String args[]){
        JanelaEx1 janela = new JanelaEx1();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 150);
        janela.setVisible(true);
    }
}



public class JanelaEx2 extends JFrame {
    private JLabel lblNome, lblIdade, lblMensagem;
    private JTextField txtNome, txtIdade, btnFim;
    private JButton btnOK, btnFfim;

    public JanelaEx2(){
        super("Segunda janela");
        setLayout(new GridLayout(4,2));

        lblNome = new JLabel("Nome");
        lblIdade = new JLabel("Idade");
        lblMensagem = new JLabel();
        btnOK = new JButton("OK");
        btnFim = new JTextField(20);
        txtIdade = new JTextField(3);

        add(lblNome);
        add(txtNome);
        add(lblIdade);
        add(txtIdade);
        add(btnOK);
        add(btnFim);
        add(lblMensagem);

        TrataBtn tBtn = new TrataBtn();
        btnOK.addActionListener(tBtn);
        btnFim.addActionListener(tBtn);
    }
	
    private class TrataBtn implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btnOK){
                lblMensagem.setText(txtNome.getText() + " anos de idade.");
            }else{
                System.exit(0);
            }
        }
    }

    public static void main(String args[]){
        JanelaEx2 janela = new JanelaEx2();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,150);
        janela.setVisible(true);
    }
}
