package coreJava;

class Address1 implements Cloneable {
    private String street;

    public Address1(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public Address1 clone() {
        try {
            return (Address1) super.clone(); // Shallow copy, fine for primitives & Strings
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    @Override
    public String toString() {
        return street;
    }
}

class Person1 implements Cloneable {
    private String name;
    private Address1 address;

    public Person1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }

    // Override clone() for deep copy
    @Override
    public Person1 clone() {
        try {
            Person1 cloned = (Person1) super.clone(); // Shallow copy first
            cloned.address = address.clone();       // Then deep copy Address
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

public class DeepCopyWithCloneable {
    public static void main(String[] args) {
        // Original object
        Person1 originalPerson = new Person1("John", new Address1("123 Main St"));

        // Deep copy using clone()
        Person1 deepCopyPerson = originalPerson.clone();

        // Modify the deep copy
        deepCopyPerson.setName("Jane");
        deepCopyPerson.getAddress().setStreet("456 Side St");

        // Print results
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Deep Copy Person: " + deepCopyPerson);
    }
}