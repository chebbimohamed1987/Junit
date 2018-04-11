package com.formation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumainTest {
    private  Humain human =new Humain();

@Before
public void  init() throws MinException, MaxException, NameException, MajException {

    human.setMasse(70);
    human.setTaille(175);
    human.setNom("Alpha");


}


    @Test
    public void getTaille() {

    }

    @Test
    public void setTaille() throws MinException, MaxException {

        human.setTaille(70);

    }

    @Test(expected=MinException.class)
    public void setTailleMin() throws MinException, MaxException {
    human.setTaille(40);
    }

    @Test(expected=MaxException.class)
    public void setTailleMax()  throws MinException, MaxException {
        human.setTaille(500);
    }

    @Test
    public void getMasse() {
    }

    @Test
    public void setMasse() throws MinException, MaxException {
        human.setMasse(70);

    }

    @Test(expected=MinException.class)
    public void setMasseMin() throws MinException, MaxException {
        human.setMasse(30);
    }

    @Test(expected=MaxException.class)
    public void setMasseMax()  throws MinException, MaxException {
        human.setMasse(150);
    }

    @Test
    public void getNom() {
    }

    @Test(expected =NameException.class )
    public void setNomNumber() throws Exception {

        human.setNom("1542");
    }


    @Test(expected =MajException.class )
    public void setNomMaj() throws Exception {

        human.setNom("mohamed");
    }

    @Test
    public void setNom() throws Exception {

        human.setNom("Mohamed");

    }
}