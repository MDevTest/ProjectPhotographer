//Nome: Matheus Alves Novais - RA 2312930
public class Fotografo extends Pessoa{
    protected int qtdfotos = 0;
    private int valfoto = 0;
    protected int qtdvideos = 0;
    private int valvideo = 0; 
    protected int dia = 0;
    protected int mes = 0;
    protected int ano = 0;
    protected int horario = 0;
    protected int valor = 0;
    protected Endereco endereco = new Endereco();
    //===========================================================
    public int getQtdfotos(){
        return qtdfotos;
    }
    public void setQtdfotos(int qtdfotos){
        this.qtdfotos = qtdfotos;
    }
    //===========================================================
    public int getValfoto(){
        return valfoto;
    }
    public void setValfoto(int valfoto){
        this.valfoto = valfoto;
    }
    //===========================================================
    public int getQtdvideos(){
        return qtdvideos;
    }
    public void setQtdvideos(int qtdvideos){
        this.qtdvideos = qtdvideos;
    }
    //===========================================================
    public int getValvideo(){
        return valvideo;
    }
    public void setValvideo(int valvideo){
        this.valvideo = valvideo;
    }
    //===========================================================
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    //===========================================================
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    //===========================================================
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    //===========================================================
    public int getHorario(){
        return horario;
    }
    public void setHorario(int horario){
        this.horario = horario;
    }
    //===========================================================
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    //===========================================================
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}