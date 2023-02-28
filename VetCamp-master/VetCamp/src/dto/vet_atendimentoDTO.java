
package dto;

// Classe criada para trabalhar com as variáveis através de set e getters
public class vet_atendimentoDTO {
    
    private String nome;
    private String idade;
    private String sexo;
    private String categoria;
    private String descricao;
    private String prescricao;
    private int id;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;// Ele retorna o valor que foi coletado pela variável local Nome.
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {// ele está esperando o valor da variável Nome.
        this.nome = nome;//armazenando na variável local Nome.
        
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
     * @return the prescricao
     */
    public String getPrescricao() {
        return prescricao;
    }

    /**
     * @param prescricao the prescricao to set
     */
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
