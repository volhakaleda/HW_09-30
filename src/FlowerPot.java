public class FlowerPot {

    private int numOfFlowers;
    private int maxFlowers;

    public FlowerPot(int maxFlowers) {
        this.maxFlowers = maxFlowers;
    }

    public int getNumOfFlowers() {
        return numOfFlowers;
    }

    public int getMaxFlowers() {
        return maxFlowers;
    }

    public void setNumOfFlowers(int numOfFlowers) {
        this.numOfFlowers = numOfFlowers;
    }

    public void setMaxFlowers(int maxFlowers) {
        this.maxFlowers = maxFlowers;
    }

    public boolean isFull() {
        if (numOfFlowers == maxFlowers) {
            return true;
        }
        return false;
    }

    public int addOne() {
        if (!isFull()) {
            numOfFlowers++;
        }
        return numOfFlowers;
    }

}

