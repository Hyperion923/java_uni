package lösungen.t4;

public class NumberDisplay {
    private int limit;
    private int value;
    private NumberDisplay parent;

    public NumberDisplay(int rollOverLimit) {
        this.limit = rollOverLimit;
        this.value = 0;
    }

    public NumberDisplay(int rollOverLimit, NumberDisplay parent) {
        this.limit = rollOverLimit;
        this.parent = parent;
    }

    public static void main(String[] args) throws InterruptedException {
        NumberDisplay p = new NumberDisplay(2);
        NumberDisplay n = new NumberDisplay(2, p);
        while (true) {
            n.increment();
            Thread.sleep(1000);
            n.increment();
            Thread.sleep(1000);
        }

    }

    public int getValue() {
        return value;
    }

    public void setValue(int replacementValue) {
        if ((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public void increment() {
        if (parent == null) {
            value = (value + 1) % limit;
        } else {
            if (value + 1 >= limit){
                parent.value = (parent.value + 1) % parent.limit;
                value = (value + 1) % limit;
            }else{
                value = (value + 1) % limit;
            }
        }
    }


}