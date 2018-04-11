package com.formation;

import jdk.Exported;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class NourritureTest {
/*    static Nourriture food= new Nourriture();

    @BeforeClass
    public static void init() throws Exception {

        food.setNom("chocolat");
        food.setCalories(500);

    }*/
Nourriture food = new Nourriture();

@Before
public void init() throws Exception {
    food.setNom("biscuit");
    food.setCalories(400);


}

    @Test
    public void getNom() {


    }

    @Test(expected =NameException.class )
    public void setNomNumber() throws Exception {

        food.setNom("1542");
    }


    @Test(expected =MajException.class )
    public void setNomMaj() throws Exception {

        food.setNom("lait");
    }

    @Test
    public void setNom() throws Exception {
        food.setNom("Alpha");

    }

    @Test
    public void getCalories() {
    }




    @Test(expected = MaxException.class)
    public void setCaloriesMax() throws Exception {
        food.setCalories(6000);


    }

    @Test(expected = MinException.class)
    public void setCaloriesMin() throws Exception {
        food.setCalories(-5);
    }


    @Test
    public void setCaloriesPositive() throws Exception {
        food.setCalories(5);

        Assert.assertTrue(food.getCalories()>0);
    }

 /*   @Test
    public void setCaloriesNegative() throws Exception {
        Nourriture food = new Nourriture("biscuit",400);
        food.setCalories(-5);

        Assert.assertTrue(food.getCalories()>0);

    }*/





}