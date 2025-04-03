
import javax.swing.JOptionPane;


public class Jpanel {

public static void main(String args[]) {
String aux1 = JOptionPane.showInputDialog(null,"Forneça o valor do produto:");
if (aux1 == null)
System.exit(0);
String aux2 = JOptionPane.showInputDialog(null,"Forneça o código do aumento:");
if (aux2 == null)
System.exit(0);
try{
float valor = Float.parseFloat(aux1);
int codigo = Integer.parseInt(aux2);
switch(codigo){
case 1 -> JOptionPane.showMessageDialog(null, "Valor com aumento: "+ (valor * 1.15));
case 3 -> JOptionPane.showMessageDialog(null, "Valor com aumento: " + (valor * 1.2));
case 4 -> JOptionPane.showMessageDialog(null, "Valor com aumento: " + (valor * 1.35));
case 8 -> JOptionPane.showMessageDialog(null, "Valor com aumento: " + (valor * 1.40));
default -> JOptionPane.showMessageDialog(null,"Código de aumento desconhecido!");
}
}
catch (NumberFormatException erro) {
JOptionPane.showMessageDialog(null,"Houve erro na conversão,digite apenas caracteres numéricos!");
}
System.exit(0);
}
}