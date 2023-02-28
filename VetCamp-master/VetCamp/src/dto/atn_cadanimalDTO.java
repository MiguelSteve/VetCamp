
package dto;


public class atn_cadanimalDTO {
    
    private String nome;
    private String idade;
    private String sexo;
    private String descricao;
    private String categoria;
    private int id_animal;
    private int fk_cliente;
    

    /**
     * @return the nome
     */
    /*São geters e seters para trabalhar com as variáveis, o get retorna o valor que foi coletado pela variável local, e o set espera um parâmetro e armazena na variável local*/
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the id_animal
     */
    public int getId_animal() {
        return id_animal;
    }

    /**
     * @param id_animal the id_animal to set
     */
    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    /**
     * @return the fk_cliente
     */
    public int getFk_cliente() {
        return fk_cliente;
    }

    /**
     * @param fk_cliente the fk_cliente to set
     */
    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    
}
