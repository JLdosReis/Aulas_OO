package episodio1;
//é possivel criar estes metodos dentro da classe Hospede
public class TesteHospede {

    public static void main(String[] args) { //pvsm escreve essa linha automaticamente
        Hospede jose = new Hospede();
        jose.setNome("José");
        jose.setSobrenome("Luiz dos Reis Neto");

        //exibindo o estado (refere-se ao conteudo das variaveis que o objeto tera) do objeto

        System.out.println("Nome: " + jose.getNome()); //sout escreve essa linha automaticamente
        System.out.println("Sobrenome: " + jose.getSobrenome());

        //criando segundo hospede

        Hospede maria = new Hospede();
        maria.setNome("Maria");
        maria.setSobrenome("do Carmo Bon Alves");

        System.out.println("Nome: " + maria.getNome());
        System.out.println("Sobrenome: " + maria.getSobrenome());

    }

}
