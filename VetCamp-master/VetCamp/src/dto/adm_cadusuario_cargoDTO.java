
package dto;


public class adm_cadusuario_cargoDTO {

private int id_cargo;
private String descricao;

    /**
     * @return the id_cargo
     */

    /*São getters e setters para trabalhar com as variáveis, o get retorna o valor que foi coletado pela variável local, e o set espera um parâmetro e armazena na variável local*/
    public int getId_cargo() {
        return id_cargo;
    }

    /**
     * @param id_cargo the id_cargo to set
     */
    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
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


    
}
