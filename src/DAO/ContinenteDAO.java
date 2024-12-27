package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Continente;

public class ContinenteDAO {

    public Connection con;
    public Conexao conexao;
    public ArrayList<Continente> listaContinentes;

    public ContinenteDAO() {
        conexao = new Conexao();
        con = conexao.getConexao();
        listaContinentes = new ArrayList<>();
    }

    public void cadastrar(Continente continente) {
        try {
            String sql = "insert into continente(nome) values (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, continente.getNome());
            stmt.execute();
            System.out.println("Cadastrado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void actualizar(Continente continente) {
        try {
            String sql = "update continente set nome = ? where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, continente.getNome());
            stmt.setInt(2, continente.getId());
            stmt.execute();
            System.out.println("Actualizado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void eliminar(Continente continente) {
        try {
            String sql = "delete from continente where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, continente.getId());
            stmt.execute();
            System.out.println("Eliminado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public ArrayList<Continente> listar() {
        try {
            String sql = "select * from continente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Continente continente = new Continente();
                continente.setId(rs.getInt("id"));
                continente.setNome(rs.getString("nome"));
                listaContinentes.add(continente);
            }
            return listaContinentes;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    public int buscarIdContinente(String nome) {
        try {
            String sql = "select * from continente where nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            return rs.getInt("id");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        }
    }
    
    public String buscarNomeContinente(int id) {
        try {
            String sql = "select * from continente where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            return rs.getString("nome");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
