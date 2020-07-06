package desafio6;

import javax.swing.JOptionPane;

public class Desafio6 {
    public static void main(String[] args) {
        int ident;
        double nota1, nota2, nota3, mediaexerc, mediaaprov;
        
        ident = Integer.parseInt(JOptionPane.showInputDialog("Número de identificação do aluno: "));
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Inserir nota: "));       
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Inserir nota: ")); 
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Inserir nota: "));   
        mediaexerc = Double.parseDouble(JOptionPane.showInputDialog("Inserir média exercício: "));  
        
        mediaaprov = (nota1 + nota2*2 + nota3*3 + mediaexerc)/7;
        
        if (mediaaprov > 9.0) {JOptionPane.showMessageDialog(null, "Código aluno: "+ident+"\nNotas aluno: "+nota1+", "+nota2+" e "+nota3+"\nMedia exercício: "+mediaexerc+"\nConceito: A\nAPROVADO!");}
        else if (mediaaprov > 7.5 && mediaaprov < 9.0) {JOptionPane.showMessageDialog(null, "Código aluno: "+ident+"\nNotas aluno: "+nota1+", "+nota2+" e "+nota3+"\nMedia exercício: "+mediaexerc+"\nConceito: B\nAPROVADO!");}
        else if (mediaaprov > 6.0 && mediaaprov <7.5) {JOptionPane.showMessageDialog(null, "Código aluno: "+ident+"\nNotas aluno: "+nota1+", "+nota2+" e "+nota3+"\nMedia exercício: "+mediaexerc+"\nConceito: C\nAPROVADO!");}
        else if (mediaaprov > 4.0 && mediaaprov < 6.0) {JOptionPane.showMessageDialog(null, "Código aluno: "+ident+"\nNotas aluno: "+nota1+", "+nota2+" e "+nota3+"\nMedia exercício: "+mediaexerc+"\nConceito: D\nREPROVADO!");}
        else {JOptionPane.showMessageDialog(null, "Código aluno: "+ident+"\nNotas aluno: "+nota1+", "+nota2+" e "+nota3+"\nMedia exercício: "+mediaexerc+"\nConceito: E\nREPROVADO!");}
        
        
        
        
    }
}
