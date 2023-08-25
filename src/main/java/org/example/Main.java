package org.example;

public class Main {
    public static void main(String[] args) {
        getOutput(firstTask());
        getOutput(secondTask());
        getOutput(thirdTask());
    }

    public static StringBuilder firstTask() {
        return DataHandler.numList(DataHandler.correct(DataProvider.firstRecord()));
    }

    public static StringBuilder secondTask() {
        return DataHandler.numList(DataHandler.removeWord(DataProvider.secondRecord(), "onion"));
    }

    public static StringBuilder thirdTask() {
        return Util.searchName();
    }

    public static void getOutput(StringBuilder s) {
        System.out.println(s);
        System.out.println();
    }
}



