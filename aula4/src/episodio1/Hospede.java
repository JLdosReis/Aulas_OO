package episodio1;

public class Hospede {
    private String nome; //campo, variavel de instancia, atributo
    private String sobrenome; //campo, variavel de instancia, atributo

    //combo para campo nome
    public String getNome() { //metodo que retorna conteudo da variavel
        return nome;
    }

    public void setNome(String nome) { //metodo que recebe variavel como parametro e atribui valor para ela
        this.nome = nome; //resolve a ambiguidade da palavra nome da linha 12 e linha 4
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //é possivel realizar isso automaticamente selecionando os campos e indo em refactoring -> encapsulate fields

}
