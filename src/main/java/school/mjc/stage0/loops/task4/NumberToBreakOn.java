package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int last = toBreakWith < numberToGoUntil ? toBreakWith : numberToGoUntil;
        if(last == numberToGoUntil){
            System.out.println("iterating till the end");
        }
        for (int i = 1; i <= last; i++) {
            System.out.println(i);
        }
    }
}
