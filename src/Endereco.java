//Nome: Matheus Alves Novais - RA 2312930
public class Endereco {
    private String logradouro = "";
    private int n = 0;
    private String bairro = "";
    public String cidade = "";
    public int cep = 0;
    //===========================================================
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    //===========================================================
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n = n;
    }
    //===========================================================
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    //===========================================================
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    //===========================================================
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
}