package com.sistema_rh.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario extends Pessoa implements Calculo {
    
    protected Funcao funcao;
    protected double salarioBase;

    private int id;
    private static int contador = -1;
    private String nomeFuncionario;
    private int idadeFuncionario;
    private String enderecoFuncionario;
    private String ufFuncionario;
    private String loginUsuarioFuncionario;
    private String senhaUsuarioFuncionario;
    private static List<Funcionario> listaFuncionario = new ArrayList<>();

    public Funcionario() {
        this.id = ++contador;
    }
    
    public Funcionario(int id, String nomeFuncionario, int idadeFuncionario, String enderecoFuncionario, String ufFuncionario, String loginUsuarioFuncionario, String senhaUsuarioFuncionario) {
        this();
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.idadeFuncionario = idadeFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.ufFuncionario = ufFuncionario;
        this.loginUsuarioFuncionario = loginUsuarioFuncionario;
        this.senhaUsuarioFuncionario = senhaUsuarioFuncionario;

    }

        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }

        public int getContador() {
            return contador;
        }
    
        public void setContador(int contador) {
            this.contador = contador;
        }
    
        public String getNomeFuncionario() {
            return nomeFuncionario;
        }
    
        public void setNomeFuncionario(String nomeFuncionario) {
            this.nomeFuncionario = nomeFuncionario;
        }
    
        public int getIdadeFuncionario() {
            return idadeFuncionario;
        }
    
        public void setIdadeFuncionario(int idadeFuncionario) {
            this.idadeFuncionario = idadeFuncionario;
        }

        public String getEnderecoFuncionario() {
            return enderecoFuncionario;
        }
    
        public void setEnderecoFuncionario(String enderecoFuncionario) {
            this.enderecoFuncionario = enderecoFuncionario;
        }

        public String getUfFuncionario() {
            return ufFuncionario;
        }
    
        public void setUfFuncionario(String ufFuncionario) {
            this.ufFuncionario = ufFuncionario;
        }
    
    
        public String getLoginUsuarioFuncionario() {
            return loginUsuarioFuncionario;
        }
    
        public void setLoginUsuarioFuncionario(String loginUsuarioFuncionario) {
            this.loginUsuarioFuncionario = loginUsuarioFuncionario;
        }
    
        public String getSenhaUsuarioFuncionario() {
            return senhaUsuarioFuncionario;
        }
    
        public void setSenhaUsuarioFuncionario(String senhaUsuarioFuncionario) {
            this.senhaUsuarioFuncionario = senhaUsuarioFuncionario;
        }

        public void CadastrarFuncionario() {
            listaFuncionario = new ArrayList<>();
        }
        
        
        // Método para adicionar um funcionario à lista
        public void cadastrarFuncionario(Funcionario funcionario) {
                listaFuncionario.add(funcionario);
            }
        
            // Método para exibir a lista de funcionarios cadastrados
            public static void listarFuncionairo() {
                for (Funcionario funcionario : listaFuncionario) {
                    System.out.println("Id: " + funcionario.getId());
                    System.out.println("Nome: " + funcionario.getNomeFuncionario());
                    System.out.println("Idade: " + funcionario.getIdadeFuncionario());
                    System.out.println("Endereço: " + funcionario.getEnderecoFuncionario());
                    System.out.println("UF: " + funcionario.getUfFuncionario());
                    System.out.println();
                }
            }
        }