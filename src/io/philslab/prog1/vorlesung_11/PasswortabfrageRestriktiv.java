package io.philslab.prog1.vorlesung_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswortabfrageRestriktiv {
    private String password;
    private List<String> forbiddenPasswords = new ArrayList<>() {
        {
            add("SouthKorea");
            add("2ndBestKorea");
            add("Democracy");
            add("Freedom");
        }
    };

    public static void main(String[] args) {
        PasswortabfrageRestriktiv mgr = new PasswortabfrageRestriktiv();

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a password: ");
        String inputPassword = sc.nextLine();

        // close scanner
        sc.close();

        // set password
        try {
            mgr.setPassword(inputPassword);
        } catch (IllegalPasswordException e) {
            System.out.format("Illegal password: %s", inputPassword);
        }
    }

    public void setPassword(String password) throws IllegalPasswordException {
        if (forbiddenPasswords.contains(password)) {
            throw new IllegalPasswordException();
        }

        this.password = password;
    }
}

