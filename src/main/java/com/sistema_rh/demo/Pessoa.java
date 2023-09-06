package com.sistema_rh.demo;

import java.util.ArrayList;
import java.util.List;

//POSSUIR AS CLASSES PESSOA E FUNCIONARIO ABSTRADA ATENDENTE SUPERVISOR E GERENTE
//UTILIZAR ENUM E INTERFACE PARA CÁLCULO DE SALARIO E TRIBUTOS (FGTS, INSS 13 E FERIAS)
//PONTO EXTRA  CONSTRUIR INTERFACE GRAFICA COM MENU PARA INSERIR FUNCIONARIO E CALCULAR SEU SALARIO E TRIBUTOS BASEADO NA SUA FUNÇÃO.

public abstract class Pessoa {
    private int id;
    private static int contador = -1;
    private String nomePessoa;
    private int idade;
    private String endereco;
    private String uf;
    private String loginUsuario;
    private String senhaUsuario;
    private static List<Pessoa> listaPessoa = new ArrayList<>();

    public Pessoa() {
        this.id = ++contador;
    }
    
    public Pessoa(int id, String nomePessoa, int idade, String endereco, String uf, String loginUsuario, String senhaUsuario) {
        this();
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.idade = idade;
        this.endereco = endereco;
        this.uf = uf;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;

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
    
        public String getNomePessoa() {
            return nomePessoa;
        }
    
        public void setNomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getEndereco() {
            return endereco;
        }
    
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getUf() {
            return uf;
        }
    
        public void setUf(String uf) {
            this.uf = uf;
        }
    
    
        public String getLoginUsuario() {
            return loginUsuario;
        }
    
        public void setLogin(String loginUsuario) {
            this.loginUsuario = loginUsuario;
        }
    
        public String getSenhaUsuario() {
            return senhaUsuario;
        }
    
        public void setSenhaUsuario(String senhaUsuario) {
            this.senhaUsuario = senhaUsuario;
        }

        public void CadastrarPessoa() {
            listaPessoa = new ArrayList<>();
        }
        
        
        // Método para adicionar um aluno à lista
        public void cadastrarPessoa(Pessoa pessoa) {
                listaPessoa.add(pessoa);
            }
        
            // Método para exibir a lista de alunos cadastrados
            public static void listarPessoa() {
                for (Pessoa pessoa : listaPessoa) {
                    System.out.println("Id: " + pessoa.getId());
                    System.out.println("Nome: " + pessoa.getNomePessoa());
                    System.out.println("Idade: " + pessoa.getIdade());
                    System.out.println("Endereço: " + pessoa.getEndereco());
                    System.out.println("UF: " + pessoa.getUf());
                    System.out.println();
                }
            }

            public void cadastrarFuncionario(Funcionario funcionario) {
            }
        }