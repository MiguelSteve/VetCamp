
package dto;

public class adm_cadprodutoDTO {

    private int id_produto;
    private int fk_fornecedor;
    private String nome_produto;
    private String quantidade_produto;
    private String validade_produto;
    private String preco_unitario;
    private String preco_venda;
    private String data;
    /**
     * @return the id_produto
     */
    
    /*São getters e setters para trabalhar com as variáveis, o get retorna o valor que foi coletado pela variável local, e o set espera um parâmetro e armazena na variável local*/
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the fk_fornecedor
     */
    public int getFk_fornecedor() {
        return fk_fornecedor;
    }

    /**
     * @param fk_fornecedor the fk_fornecedor to set
     */
    public void setFk_fornecedor(int fk_fornecedor) {
        this.fk_fornecedor = fk_fornecedor;
    }

    /**
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     * @return the quantidade_produto
     */
    public String getQuantidade_produto() {
        return quantidade_produto;
    }

    /**
     * @param quantidade_produto the quantidade_produto to set
     */
    public void setQuantidade_produto(String quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    /**
     * @return the validade_produto
     */
    public String getValidade_produto() {
        return validade_produto;
    }

    /**
     * @param validade_produto the validade_produto to set
     */
    public void setValidade_produto(String validade_produto) {
        this.validade_produto = validade_produto;
    }

    /**
     * @return the preco_unitario
     */
    public String getPreco_unitario() {
        return preco_unitario;
    }

    /**
     * @param preco_unitario the preco_unitario to set
     */
    public void setPreco_unitario(String preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    /**
     * @return the preco_venda
     */
    public String getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(String preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }



}
