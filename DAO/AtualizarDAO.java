package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dodoa
 */
public class AtualizarDAO {

 
    public void update(Disciplinasgetset d) {

        Connection con = ConexaoMySQL.getInstance().getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE disciplinas SET "
                    + "Disciplina = ? ,CargH = ?,Curso = ?,NVagas = ?,Periodo = ? ");
            
            stmt.setString(1, d.getDisciplina());
            stmt.setString(2, d.getCargH());
            stmt.setString(3, d.getCurso());           
            stmt.setInt(4, d.getNVagas());
            stmt.setString(5, d.getPeriodo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } 

    }
    

}
