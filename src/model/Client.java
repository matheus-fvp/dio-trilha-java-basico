package model;

import java.util.Objects;

public class Client {

    private String CPF;
    private String clientName;

    public Client() {
    }

    public Client(String CPF, String clientName) {
        this.CPF = CPF;
        this.clientName = clientName;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(CPF, client.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    @Override
    public String toString() {
        return String.format("{cpf: %s,\n, clientName: %s}", getCPF(), getClientName());
    }
}
