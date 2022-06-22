//Nome: Matheus Alves Novais - RA 2312930
import java.awt.Container;
import java.io.IOException;
import java.util.List;

public class Func extends Home{
    public static void preenchep(Pessoa p){
        p.setTel(TelaCadastraUsuario.t);
        p.setEmail(TelaCadastraUsuario.e);
        p.setDn(TelaCadastraUsuario.d);
        p.setId(TelaCadastraUsuario.c);
        p.setSexo(TelaCadastraUsuario.s);
        p.setNome(TelaCadastraUsuario.n);
    }
    public static void preenchef(Fotografo f){
        f.setNome(TelaCadastraFotografo.n);
        f.setDn(TelaCadastraFotografo.d);
        f.setEmail(TelaCadastraFotografo.e);
        f.setTel(TelaCadastraFotografo.t);
        f.setId(TelaCadastraFotografo.c);
        f.setSexo(TelaCadastraFotografo.s);
        f.setValfoto(TelaCadastraFotografo.vf);
        f.setValvideo(TelaCadastraFotografo.vv);
    }
}