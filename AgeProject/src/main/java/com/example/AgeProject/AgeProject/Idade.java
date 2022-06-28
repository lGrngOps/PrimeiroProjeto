package com.example.AgeProject.AgeProject;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class Idade {

       public User idadeTeste(User user){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        user.setBirthDate(sdf.format(user.getBirthDate()));

        return user;
    }


    public static int calculaIdade(Date aniversario){

        Calendar dataNascimento = new GregorianCalendar();
        dataNascimento.setTime(aniversario);

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        dataNascimento.add(Calendar.YEAR,idade);

        if (hoje.before(dataNascimento)){
            idade--;
        }
        return idade;
    }

}
