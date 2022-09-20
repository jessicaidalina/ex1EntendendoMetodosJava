public class Main {
    public static void main (String[] args){

            //Calculadora
            Calculadora.soma(9, 5);
            Calculadora.subtracao(8, 3);
            Calculadora.multiplicacao(3, 5);
            Calculadora.divisao(20, 2);

            //Mensagem
            Mensagem.obterMensagem(9);
            Mensagem.obterMensagem(13);
            Mensagem.obterMensagem(21);

            //Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasPrcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
