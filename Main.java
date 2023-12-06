// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

           enquanto ba = new enquanto();
           ba.enquanto(); //fazer assim para mostrar no código principal, criar um objeto e depois atribuir
        // no objeto igual está acima!
        //tipos primitivos!! Tem esse nome por conta que vieram antes do java, por isso primitivo.
        int a = 2; // numero inteiro
        char b = 'g'; //para armazenar caracteres
        long c = 400; //outra forma de guardar numeros inteiros
        double d = 3.4; //guarda numeros inteiros e quebrados.
        //Tudo que não estiver em laranja, são objetos e tudo em laranja são primitivos
        //tipos não primitivos
        String name = "Geovanna";
        System.out.println(name.toUpperCase()); // o "." pode decidir muitas coisas em java,
        // podendo dar metodos(são os caras com parenteses igual ai em cima) a cada objeto apenas com um ponto!
        //------------------------------------------------------------------------------------------------------

        //para ativar o metodo,vamos dar chamar

        adicionarexclamcao("hotdogs");
        //aqui estamos usando o metodo e isso me ajudou bastante pq consegui entender agora!
      String interro = interrogacao("o que vai fazer hoje");
      System.out.println(interro);
    }

    //Para criar um metodo precisamos utilizar palavras chaves e o nome do nosso metodo, como abaixo
    // o void significa o que irá retornar(caso use o codigo "return"), e nesse caso é nada.
    //mas se for para usar o codigo e retornar algo, terá que usar o tipo da variavel no lugar do void
    // (o tipo que vai retornar)
    // vou mostrar um exemplo
     public static String interrogacao( String i){
      return i + "?";
     }

    public static void adicionarexclamcao(String s){
        System.out.println(s + "!");
    }

}