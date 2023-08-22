package application;

import model.Account;
import model.Client;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Account number: ");
        Long accountNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Agency: ");
        String agency = scanner.nextLine();
        System.out.print("Client name: ");
        String clientName = scanner.nextLine();
        System.out.print("CPF of client: ");
        String clientCPF = scanner.nextLine();
        System.out.print("Account balance: ");
        BigDecimal balance = scanner.nextBigDecimal();

        Client client = new Client(clientCPF, clientName);
        Account account = new Account(accountNumber, agency, client, balance);

        System.out.println(account);


        scanner.close();
    }

}
