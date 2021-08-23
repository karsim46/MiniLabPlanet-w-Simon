public class Runner {

    public static void main(String[] args) {
        // We've created a planet object, called it ourPlanet and given it the String "Earth" to be used as name, and the Integer 90000 to be used as size
        Planet ourPlanet = new Planet("Earth", 90000);

        // We want to check that the name has been set to Earth as expected
        // So we set up a String name variable here and assign it to the return value of the getName method when called on ourPlanet
        String name = ourPlanet.getName(); // the value of name within Runner should now be 'Earth'

        // We want to check that the size has been set to 90000 as expected
        // So we set up a Integer size variable here and assign it to the return value of the getSize method when called on ourPlanet
        Integer size = ourPlanet.getSize(); // the value of size within Runner should now be '90000'

        //We want to print the value of the name variable (which was defined as the result of outPlanet.getName() on line 9
        System.out.println(name); // So we do the print command and give it (name), so when runner is run 'Earth' should be printed to the console

        //We want to print the value of the size variable (which was defined as the result of outPlanet.getSize() on line 13
        System.out.println(size); // So we do the print command and give it (size), so when runner is run '90000' should be printed to the console

        //We want to change the name of ourPlanet to be Mars using the setName method we created in Planet.java
        ourPlanet.setName("Mars"); // We call setName on ourPlanet and give it the string "Mars", so the name value of ourPlanet should now be "Mars"

        // Our explode method returns a string and uses the current name and size variables to fill in some gaps
            // Before we changed the name value of ourPlanet() to be Mars, we'd have expected the ourPlanet.explode to return "Boom! Earth has exploded! It was 90000 in size!"
                // However on line 22 we changed the name value of ourPlanet to be "Mars"
        String message = ourPlanet.explode(); //We create a String message variable within the runner file and assign it to the returned value of ourPlanet.explode()

        // Now we actually want to print the message from line 27, so we use the print command and give it message as an argument
        System.out.println(message); //When the runner file is run, the console should print the String value of message, which should be "Boom! Mars has exploded! It was 90000 in size!"
    }
}
