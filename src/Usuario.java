public class Usuario {
    private  String authOld;
    private  String username;

    public Usuario() {
    }

    public Usuario(String authOld, String username) {
        this.authOld = authOld;
        this.username = username;
    }

    public String getAuthOld() {
        return authOld;
    }

    public void setAuthOld(String authOld) {
        this.authOld = authOld;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "authOld='" + authOld + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
