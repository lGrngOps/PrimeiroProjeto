package com.example.AgeProject.AgeProject;

import jdk.jfr.DataAmount;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class User {

    //@DateTimeFormat (pattern = "dd/MM/yyyy")

    private String name;
    private String lastName;
    private Date birthDate;
    //private LocalDate aniversario;
    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthDate(String format) {
    }

    //public LocalDate getAniversario() { return aniversario;}

    /*public void setAniversario(String birthDate) {

        //String date ;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(birthDate,formatter);
        //date = formatter.format(aniversario);

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.format(aniversario);

        System.out.println(sdf);

        this.aniversario = aniversario;
    }*/

}

        //LocalDate aniversario = LocalDate.parse(birthDate);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //formatter.format(aniversario);

        //String aniversario = "05/10/1990";

        //LocalDate data = LocalDate.parse(birthDate,formato);


        //this.birthDate = birthDate;


    /* public void setaniversario(String birthDate){

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(birthDate,formato);

       /* Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance();

        Date data2 = f.parse(birthDate);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sdf.format(birthDate);
        sdf.parse(birthDate);

        DateFormat formatData = DateFormat.getDateInstance();
        formatData.format(birthDate);



        //this.birthDate = birthDate;
        this.aniversario = ;
     */

    /*public static int calculaIdade(String birthDate) throws ParseException {

        Calendar dataNascimento = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sdf.parse(birthDate);
        sdf.format(birthDate);

        dataNascimento.setTime(birthDate);

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        dataNascimento.add(Calendar.YEAR,idade);

        if (hoje.before(dataNascimento)){
            idade--;
        }
        return idade;
    }*/
