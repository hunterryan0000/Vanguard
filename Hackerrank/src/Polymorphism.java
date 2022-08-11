 // Parent class
    class Animal {
        public void greeting() {
            System.out.println("The animal greets you.");
        }
    }

    // Child class
    class Cat extends Animal {
        public void greeting() {
            System.out.println("The cat meows.");
        }
    }

    class MainClass {
        public static void main(String[] args) {
            Animal animal1 = new Animal();  // Animal object
            Animal cat1 = new Cat();  // Cat object
            animal1.greeting(); // prints "The animal greets you."
            cat1.greeting(); // prints "The cat meows."
        }
    }

