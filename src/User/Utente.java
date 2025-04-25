package User;

public class Utente {
    public enum Tipo { ORGANIZZATORE, GIUDICE, PARTECIPANTE }

    private Long id;
    private String nickname, nome, cognome, email, password;
    private Tipo tipo;

    public Utente(Long id, String nickname, String nome, String cognome, String email, String password, Tipo tipo) {
            this.id = id;
            this.nickname = nickname;
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.password = password;
            this.tipo = tipo;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    private void setPassword(String password) {
        this.password = password;
    }
    private void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }
    public String getNickname() {
        return nickname;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Tipo getTipo() {
        return tipo;
    }

    public String toString(){
        return String.format("");
    }
}


