/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author dodoa
 */

    public class CreditosIMPL extends CreditosABST {
    
    public CreditosIMPL(){
        creditos();
    }
    @Override
    public void creditos(){
        
        setIdade(20);
        setNome("Diogo Alexandro Silva Oliveira");
        setPerfil("Cursando 3 semestre de ciência da computação na UNIP-Limeira, morando atualmente em Americana-SP.");
        
        JOptionPane.showMessageDialog(null,"Idade= "+getIdade()+"\nNome= "+getNome()+"\nSobre= "+getPerfil());
    }

  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreditosIMPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditosIMPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditosIMPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditosIMPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreditosIMPL().setVisible(true);
        });
  }

    public void setVisible(boolean b) {       
    }
    }