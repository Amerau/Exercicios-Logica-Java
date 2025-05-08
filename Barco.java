public class Barco extends Veiculo{

    private String tipoCasco;

    public String getTipoCasco(){

        return tipoCasco;

    }

    public void setTipoCasco(String tipoCasco){

        this.tipoCasco = tipoCasco;

    }

    public Barco(String marca, String modelo, int ano, double combustivel, String tipoCasco){

        super(marca, modelo, ano, combustivel);
        this.tipoCasco = tipoCasco;

    }

    public void ancorar(){

        System.out.println("Barco ancorado!");

    }

    public void soltarAncora(){

        System.out.println("Ancora solta!");

    }
    
    
}
