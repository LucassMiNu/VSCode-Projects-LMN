package aulaheranca;

import java.util.UUID;

public class Arbitro extends Pessoa {
    private boolean fifa;
    private String codigo;
    
    public Arbitro() {
    }

    public Arbitro(UUID id, String nome, String cpf, boolean fifa, String codigo) {
        super(id, nome, cpf);
        this.fifa = fifa;
        this.codigo = codigo;
    }
    
    public boolean isFifa() {
        return fifa;
    }
    public void setFifa(boolean fifa) {
        this.fifa = fifa;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}