public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro (String marca, String modelo, int ano, double velocidadeAtual, boolean motorLigado, double combustivel){
        super(marca, modelo, ano, velocidadeAtual, motorLigado, combustivel);
        this.numeroPortas = numeroPortas;
    }
    
     
}