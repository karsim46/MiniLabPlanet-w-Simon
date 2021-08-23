public class Planet { //Planet Class

    private String name; //Planet class has a Private name variable which is string, Private means it can only be changed by interacting with the planet class
    private Integer size; //Planet class has a Private size variable which is an Integer, Private means it can only be changed by interacting with the planet class

    //Planet constructor (how a Planet object is made - what arguments does it need), We've decided it needs a name (which must be a string) and a size (which must be an Integer)
    public Planet(String name, Integer size){
        this.name = name; //When a planet object is created, it's name variable is set to the name String given as an argument
        this.size = size; //When a planet object is created, it's size variable is set to the size Integer given as an argument
    }

    public String getName(){ // We've created a method that can be used with a Planet object, it's called getName and it will return a string
        return this.name; // The return value of the getName method is the name string value of whichever planet the .getName() method was called on
    }

    public Integer getSize(){ // We've created a method that can be used with a Planet object, it's called getSize and it will return an Integer
        return this.size; // The return value of the getSize method is the size Integer value of whichever planet the .getSize() method was called on
    }

    public String explode(){ // We've created a method that can be used with a Planet object, it's called explode and it will return a String we've defined below
        return String.format("Boom! %s has exploded! It was %s in size!", this.name, this.size);
        //The above string is what will be returned when the explode method is called on a planet object
            // The .format() method is being used on this string so we can input variables into the String
                // Wherever a %s exists in the string, it will be replaced with the variable following the string
                    // so the first %s in the above will become whatever the value of this.name is
                    // and the second %s in the above will become whatever the value of this.size is
                    // so if we were using this on a planet that had this.name = Earth and this.size = 100000 the string would be
                        // Boom! Earth has exploded! It was 100000 in size!"
                            // This is the string that will be returned by the explode method
    }
    // We've created a method that can be used with a Planet object, it's called setName and it will be used to modify the name of the planet
    // we've used void because this method does not 'return' anything
    public void setName(String name){ // When setName is called on a planet object, it requires a string to be given as an argument, which will be treated as 'name'
        this.name = name; // When this method runs, it takes whatever String it was given when it was called and updates the name of the planet the method was called on to be the new name given
    }
}