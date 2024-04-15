import java.util.*;

public class Main {
  public static void main(String[] args) {
    String pal, pal2;
    Scanner sc = new Scanner(System.in);
    Stack<Character> par = new Stack<Character>();
    Stack<Character> par2 = new Stack<Character>();
    Stack<Character> par3 = new Stack<Character>();

    par.push('c');
    par.push('o');
    par.push('c');
    par.push('a');

    par2.push('c');
    par2.push('o');
    par2.push('c');
    par2.push('a');

    // // recebe a primeira palvra
    // System.out.println("Entre com a primeira palavra");
    // while (sc.hasNext()){
    // par.push(sc.next());
    // }

    // // recebe a segunda palavra
    // System.out.println("Entre com a segunda palavra");
    // while (sc.hasNext()){
    // par2.push(sc.next());
    // }

    // compara o tamanho das palavras
    if (par.size() != par2.size()) {
      System.out.println("Não são iguais");
      System.exit(0);
    }

    // adiciona a pilha o parenteses
    while (!par.empty()) {
      if (par.peek() == par2.peek()) {
        par3.push(par.peek());
        par3.push(par2.peek());
        par.pop();
        par2.pop();
      } else {
        System.out.println("Não são iguais");
        System.exit(0);
      }
    }
    while (!par3.empty()) {
      par.push(par3.peek());
      par3.pop();
      par2.push(par3.peek());
      par3.pop();
    }
    System.out.println("São iguais");
    System.out.println("palavra 1: " + par);
    System.out.println("palavra 2: " + par2);
  }
}