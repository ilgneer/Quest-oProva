
package exemplo;


public class Onibus extends Veiculo{
    
     int assentos;

    public Onibus(int assentos, String placa, int ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    
    @Override
    public void exibirDados(){
        System.out.println("O seu assento é: " + assentos + "A sua placa é: " + placa + "E o ano do seu veículo é: " + ano);
    }
    
}
