public abstract class Veiculo{

    public String placa;
    public String marca;
    public String modelo;
    public int ano;
    public double valor;

    public Veiculo(String placa, String marca, String modelo, int ano){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String toString(){
        return "Placa: "+getPlaca()+", Marca: "+getMarca()+", Modelo: "+getModelo()+", Ano: "+getAno();
    }
}