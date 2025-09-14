import java.util.Scanner;

class Animal {
  String nome;
  String raca;

  public Animal(String nome, String raca) {
    this.nome = nome;
    this.raca = raca;
  }

  public void comer() {
    System.out.println(nome + " está comendo.");
  }

  public void andar() {
    System.out.println(nome + " está andando.");
  }
}

class Ave extends Animal {
  public Ave(String nome, String raca) {
    super(nome, raca);
  }

  public void voar() {
    System.out.println(nome + " está voando: Flap Flap");
  }

  public void aterrissar() {
    System.out.println(nome + " está aterrissando: ksks");
  }
}

class Cachorro extends Animal {
  public Cachorro(String nome, String raca) {
    super(nome, raca);
  }

  public void latir() {
    System.out.println(nome + " está latindo: Au au!");
  }

  @Override
  public void andar() {
    System.out.println(nome + " está andando: tac tac");
  }
}

public class vaca {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do seu cachorro: ");
    String nomeCachorro = scanner.nextLine();

    System.out.print("Digite o raca do seu cachorro: ");
    String racaCachorro = scanner.nextLine();

    Cachorro meuCachorro = new Cachorro(nomeCachorro, racaCachorro);

    System.out.println("\n--- Informações do Cachorroo ---");
    System.out.println("Nome do cachorro é " + meuCachorro.nome + " e a raça dele é " + meuCachorro.raca + "\n");
    meuCachorro.comer();
    meuCachorro.latir();
    meuCachorro.andar();

    System.out.print("\nDigite o nome da Ave:");
    String nomeAve = scanner.nextLine();

    System.out.print("Digite o raca da ave:");
    String racaAve = scanner.nextLine();

    Ave minhaAve = new Ave(nomeAve, racaAve);

    System.out.println("\n---Informações da Ave ");
    System.out.println("Nome da Ave é " +minhaAve.nome + " e a é Raça " +minhaAve.raca);
    minhaAve.comer();
    minhaAve.voar();
    minhaAve.aterrissar();
  }
}
