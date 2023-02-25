package devandroid.maddo.applistacurso.model;


// OrdemDePagamento - pascalCase - CamelCase
public class Pessoa {

    // Construtor
    // Atributos - Objetos - Molde - Modelo - Template
    // Métodos de Acesso - Getts and Setts

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(){}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {

        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }


    // To String - Para Textos - Para Strings de Caracteres


    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
