// Container: Frames
JFrame fr = new JFrame("Exemplo");
fr.setSize(800, 600);
fr.setVisible(true);

// MessageDialog
JOptionPane.showMessageDialog(null,"Comprimento: "+convertToDecimal(C.comprimento())+" m \nÁrea: "+convertToDecimal(C.area())+" m²", "INFORMACOES DO CIRCULO", JOptionPane.PLAIN_MESSAGE);

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

// InputDialog
String s = JOptionPane.showInputDialog(null, "Digite um numero: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "O numero inserido foi: "+s, "Saída", JOptionPane.PLAIN_MESSAGE);

// OptionDialog
Object[] options = { "OK", "CANCELA" };
JOptionPane.showOptionDialog(null, "Clique OK para continuar", "Cuidado", JOptionPane.DEFAULT_OPTION, JOption.WARNING_MESSAGE, null, options, options[0]);
