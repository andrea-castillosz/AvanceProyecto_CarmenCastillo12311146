
package banca_online;

public class Usuario {

    private String user, password;
    private double estadoCuenta;


    public Usuario(String user, String password, double estadoCuenta) {
        this.user = user;
        this.password = password;
        this.estadoCuenta = estadoCuenta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(double estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }


}
