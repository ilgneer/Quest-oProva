
package exemplo;


public class Caminhao extends Veiculo{
    int eixos;

    public Caminhao(int eixos, String placa, int ano) {
        super(placa, ano);
        this.eixos = eixos;
    }


    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    
    @Override
    public void exibirDados(){
        System.out.println("A quantidade de eixos do seu veículo é: " + eixos + "A sua placa é: " + placa + "E o ano do seu veículo é: " + ano);
    }
    
}
