/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Continente;
import models.Pais;
import models.RelacaoContPais;

/**
 *
 * @author Génio Pró
 */
public class PaisDAO {

    public Connection con;
    public Conexao conexao;

    public PaisDAO() {
        conexao = new Conexao();
        con = conexao.getConexao();
    }

    public void cadastrar(Pais pais) {
        try {
            String sql = "insert into pais(nome, id_continente) values (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pais.getNome());
            stmt.setInt(2, pais.getIdCont());
            stmt.execute();
            System.out.println("Cadastrado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void actualizar(Pais pais) {
        try {
            String sql = "update pais set nome = ?, id_continente = ? where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pais.getNome());
            stmt.setInt(2, pais.getIdCont());
            stmt.setInt(3, pais.getId());
            stmt.execute();
            System.out.println("Actualizado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void eliminar(Pais pais) {
        try {
            String sql = "delete from continente where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, pais.getId());
            stmt.execute();
            System.out.println("Eliminado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public ArrayList<RelacaoContPais> listar() {
        try {
            String sql = "select pais.*,  \n"
                    + "    continente.id as idContinente,\n"
                    + "    continente.nome as nomeContinente,\n"
                    + "    pais.id as idPais,\n"
                    + "    pais.nome as nomePais\n"
                    + "    from pais\n"
                    + "    inner join continente\n"
                    + "    on continente.id = pais.id_continente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ArrayList<RelacaoContPais> listaContsPaises = new ArrayList<>();

            while (rs.next()) {
                RelacaoContPais contPais = new RelacaoContPais();
                contPais.setIdPais(rs.getInt("idPais"));
                contPais.setNomePais(rs.getString("nomePais"));
                contPais.setIdContinente(rs.getInt("idContinente"));
                contPais.setNomeContinente(rs.getString("nomeContinente"));
                listaContsPaises.add(contPais);
            }
            return listaContsPaises;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    public ArrayList<RelacaoContPais> listarConsulta(String palavraConsulta) {
        try {
            String sql = "select pais.*,  \n"
                    + "    continente.id as idContinente,\n"
                    + "    continente.nome as nomeContinente,\n"
                    + "    pais.id as idPais,\n"
                    + "    pais.nome as nomePais\n"
                    + "    from pais\n"
                    + "    inner join continente\n"
                    + "    on continente.id = pais.id_continente"
                    + " where continente.nome LIKE ? or pais.nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, palavraConsulta + "%");
            stmt.setString(2, palavraConsulta + "%");
            ResultSet rs = stmt.executeQuery();
            ArrayList<RelacaoContPais> listaContsPaises = new ArrayList<>();

            while (rs.next()) {
                RelacaoContPais contPais = new RelacaoContPais();
                contPais.setIdPais(rs.getInt("idPais"));
                contPais.setNomePais(rs.getString("nomePais"));
                contPais.setIdContinente(rs.getInt("idContinente"));
                contPais.setNomeContinente(rs.getString("nomeContinente"));
                listaContsPaises.add(contPais);
            }
            return listaContsPaises;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
