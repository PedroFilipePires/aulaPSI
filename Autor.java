package ficha02_arraylist_m12;

import java.util.*;

public class Autor {

    protected Scanner sc = new Scanner(System.in);
    private int codAutor;
    private String nomeAutor;
    private String email;
    private ArrayList<Autor> autores = new ArrayList<Autor>();

    public Autor() {
        System.out.print("ola");
        System.out.println("sdfsdf"); 
        //sdfdfdf
    }

    
    
    public void cadastrar() {
        Autor autor = new Autor();
        System.out.print("CodAutor: ");
        autor.setCodAutor(sc.nextInt());
        System.out.print("NomeAutor: ");
        autor.setNomeAutor(sc.next());
        System.out.print("Email: ");
        autor.setEmail(sc.next());
        autores.add(autor);
        System.out.println("Autor cadastrado com sucesso!");
    }

    public void editar() {
        if (autores.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("NomeAutor: ");
            String id = sc.next();
            for (int i = 0; i < autores.size(); i++) {
                if (id.equals(autores.get(i).getNomeAutor())) {
                    Autor autor = new Autor();
                    System.out.print("CodAutor: ");
                    autor.setCodAutor(sc.nextInt());
                    System.out.print("NomeAutor: ");
                    autor.setNomeAutor(sc.next());
                    System.out.print("Email: ");
                    autor.setEmail(sc.next());
                    autores.remove(i);
                    autores.add(i, autor);
                    System.out.println("Autor editado!");
                }
            }
        }
    }

    public void pesquisar() {
        if (autores.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("NomeAutor: ");
            String id = sc.next();
            for (int i = 0; i < autores.size(); i++) {
                if (id.equals(autores.get(i).getNomeAutor())) {
                    System.out.println("Encontrado com sucesso!");
                    System.out.println("");
                    System.out.println("CodAutor: " + autores.get(i).getCodAutor());
                    System.out.println("NomeAuto: " + autores.get(i).getNomeAutor());
                    System.out.println("Emial: " + autores.get(i).getEmail());
                }
            }
        }
    }

    public void listar() {
        System.out.println("Autores:");
        System.out.println("");
        for (int i = 0; i < autores.size(); i++) {
            System.out.println("CodAutor: " + autores.get(i).getCodAutor());
            System.out.println("NomeAutor: " + autores.get(i).getNomeAutor());
            System.out.println("Email: " + autores.get(i).getEmail());
            System.out.println("");
        }
    }

    public void excluir() {
        if (autores.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("NomeAutor: ");
            String id = sc.next();
            for (int i = 0; i < autores.size(); i++) {
                if (id.equals(autores.get(i).getNomeAutor())) {
                    autores.remove(i);
                    System.out.println("Autor removido!");
                }
            }
        }

    }

    public void excluirTudo() {
        if (autores.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            autores.clear();
            System.out.println("Array apagado!");
        }
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{" + "codAutor=" + codAutor + ", nomeAutor=" + nomeAutor + ", email=" + email + '}';
    }

}
