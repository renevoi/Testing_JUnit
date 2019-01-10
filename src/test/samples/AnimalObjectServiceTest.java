package test.samples;

import org.junit.Assert;
import org.junit.Test;

public class AnimalObjectServiceTest {

    @Test
    public void shouldCreateAndAnimalAndReturnName(){
        //Given
        String name = "kitty";
        //When
        Animal animal = new Cat(name);

        //Then
        Assert.assertTrue(animal.getName().equals(name));
    }

    @Test
    public void shouldBeAbleToGetAndSetAnAnimalAge(){
        //Given
        int age = 5;

        //When
        Animal animal = new Cat("Ailia");
        animal.setAge(age);

        //Then
        Assert.assertTrue(animal.getAge() == age);
    }

}
