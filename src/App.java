import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
      
        /*SomTrovao som = new SomTrovao();

        JOptionPane.showMessageDialog(null,
                       "A distância aproximadamente é: "+som.calcularDistancia());

        Pessoa p = new Pessoa();
        String nome =JOptionPane.showInputDialog(null,
           "Qual o seu nome?");

        p.setNome(nome);

        JOptionPane.showMessageDialog(null,
                 p.verificarNome(),
                 "Senai Tagua" , 
                 JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"estudo sobre tipos");
        //Tipos primitivos
        //int   - Integer
        //double - Double
        

        Double resposta = Double.parseDouble(JOptionPane.showInputDialog(null,"Salário"));
        JOptionPane.showMessageDialog(null,resposta.SIZE,"SENAI é Top", JOptionPane.INFORMATION_MESSAGE);
        
        //Tipo de ponto flutuante
        //float e double
        //float: 32 bits
        //double: 64
        //Ele não é indicado para trabalhar com money ($$$$$  R$$$$$$$$)
        //0,00107 - ele não é indicado para trabalhar com precisão
        //Para trabalhar com dinheiro temos que usar o Decimal - referência

        double side1, side2 ,hypot;

        side1= 3;
        side2=4;

        hypot = Math.sqrt(side1*side1 + side2*side2);
        JOptionPane.showMessageDialog(null,hypot,"Senai é Top",JOptionPane.INFORMATION_MESSAGE);
        
        boolean b;

        b=false;
        //George Boole - Discípulo
      
        //Aristoteles - Lógica Aristotélica
          //George Boole
        //true e false
        //teoremas - tabelas verdades
        String titulo = "Senai é Top";
        if(!b){
            JOptionPane.showMessageDialog(null,"Senai Taguatinga",titulo,JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Booleano OK", "Senai é Top",JOptionPane.INFORMATION_MESSAGE);
        }
*/
        /*
         * 
         * Qual a diferença entre as seguintes estruturas de repetição:
         * 
         * while   - teste no ínicio
         * 
         * 
         * for -   é a mesma coisa que o while (a diferença é que ele é mais compacto.)
         * 
         * 
         * do while  - executa pelo uma vez. Faz o teste no final
         * 
         * 
         */
        //Banco de Dados
        //É o fim da tabela
        int cont=1;
        while(cont<=3){//enquanto a condição for true
            Janelinha.jShow();
            cont++; //cont= cont+1
        }
        //sai do looping quando condição for false.
        
        int opcao=0;

        do{
            Janelinha.jMenuSenai();
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor"));
            switch(opcao){
                case 1:Janelinha.jShowIf();break;
                case 2:Janelinha.jShowSwitch();break;
                case 3:Janelinha.jShowFor();break;
                default:
                if(opcao==4){
                    break;
                }
                JOptionPane.showMessageDialog(null,"Dado inválido", "Senai",JOptionPane.INFORMATION_MESSAGE);
            }
        }while(opcao != 4);
        JOptionPane.showMessageDialog(null,"Vai sextar","tchau", JOptionPane.ERROR_MESSAGE);
        // tipo[] nome-array = new tipo[tamanho]

        int[] exemplo = new int[3];//vetor estático
        exemplo[0] = 2;
        exemplo[1] = 3;
        exemplo[2] = 45;
        for(int i=0;i<3;i++){
            JOptionPane.showMessageDialog(null,
                            "indice 0:"+exemplo[i], 
                             "senai",
                             JOptionPane.INFORMATION_MESSAGE);
        }
        

        
     
        

    }
}
