public class Quadrado
{
    // atributos da classe:
    public double altura; // public: o atributo pode ser utilizado em outros arquivos
    public double largura;

    public double area () { // não precisa passar parâmetros, porque os atributos já estão presentes nessa mesma classe
        return altura * largura;
    }
}
