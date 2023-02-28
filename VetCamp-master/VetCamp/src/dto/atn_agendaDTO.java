/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;


public class atn_agendaDTO {
    
    private String data_agenda;
    private String tipo_agenda;
    private String sexo_agenda;
    private String categoria_agenda;
    private String descricao_agenda;
    private String nome_animal;
    private String veterinario;
    private int fk_animal;
    private int id_agenda;

    /**
     * @return the data_agenda
     */
    /*São geters e seters para trabalhar com as variáveis, o get retorna o valor que foi coletado pela variável local, e o set espera um parâmetro e armazena na variável local*/
    public String getData_agenda() {
        return data_agenda;
    }

    /**
     * @param data_agenda the data_agenda to set
     */
    public void setData_agenda(String data_agenda) {
        this.data_agenda = data_agenda;
    }

    /**
     * @return the tipo_agenda
     */
    public String getTipo_agenda() {
        return tipo_agenda;
    }

    /**
     * @param tipo_agenda the tipo_agenda to set
     */
    public void setTipo_agenda(String tipo_agenda) {
        this.tipo_agenda = tipo_agenda;
    }

    /**
     * @return the sexo_agenda
     */
    public String getSexo_agenda() {
        return sexo_agenda;
    }

    /**
     * @param sexo_agenda the sexo_agenda to set
     */
    public void setSexo_agenda(String sexo_agenda) {
        this.sexo_agenda = sexo_agenda;
    }

    /**
     * @return the categoria_agenda
     */
    public String getCategoria_agenda() {
        return categoria_agenda;
    }

    /**
     * @param categoria_agenda the categoria_agenda to set
     */
    public void setCategoria_agenda(String categoria_agenda) {
        this.categoria_agenda = categoria_agenda;
    }

    /**
     * @return the descricao_agenda
     */
    public String getDescricao_agenda() {
        return descricao_agenda;
    }

    /**
     * @param descricao_agenda the descricao_agenda to set
     */
    public void setDescricao_agenda(String descricao_agenda) {
        this.descricao_agenda = descricao_agenda;
    }

    /**
     * @return the nome_animal
     */
    public String getNome_animal() {
        return nome_animal;
    }

    /**
     * @param nome_animal the nome_animal to set
     */
    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    /**
     * @return the fk_animal
     */
    public int getFk_animal() {
        return fk_animal;
    }

    /**
     * @param fk_animal the fk_animal to set
     */
    public void setFk_animal(int fk_animal) {
        this.fk_animal = fk_animal;
    }

    /**
     * @return the id_agenda
     */
    public int getId_agenda() {
        return id_agenda;
    }

    /**
     * @param id_agenda the id_agenda to set
     */
    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    /**
     * @return the veterinario
     */
    public String getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
    
}
