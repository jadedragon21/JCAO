package com.tts.packthis.righthere;

public class Pet {
//Create a Pet Class with the following instance variables:
//name (PRIVATE)
//age (PRIVATE)
//location (PRIVATE)
//type (PRIVATE)
    class Pet {
        private String name;
        private int age;
        private String location;
        private String type;
//two constructors empty all attributes
        public Pet() {
            name = "";
            age = 0;
            location = "";
            type = "";
        }

        public Pet(String name, int age, String location, String type) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;
        }
//Code to be able to access the following (Get Methods):
//name, age, type
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getType() {
            return type;
        }
//Code to be able to change (Set Methods):
//name, age, location
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}