package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        Zerg owl = new Zerg();
        owl.name = "Owl";
        Zerg panda = new Zerg();
        panda.name = "Panda";
        Zerg otter = new Zerg();
        otter.name = "Otter";
        Zerg duck = new Zerg();
        duck.name = "Duck";
        Zerg mouse = new Zerg();
        mouse.name = "Mouse";

        Protoss peach = new Protoss();
        peach.name = "Peach";
        Protoss pear = new Protoss();
        pear.name = "Pear";
        Protoss pineapple = new Protoss();
        pineapple.name = "Pineapple";

        Terran mountain = new Terran();
        mountain.name = "Mountain";
        Terran cloud = new Terran();
        cloud.name = "Cloud";
        Terran ocean = new Terran();
        ocean.name = "Ocean";
        Terran tree = new Terran();
        tree.name = "Tree";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
