package request;

public class CartRequest {
    private int pdtSeq;
    private int count;
    private int userSeq;

    // Constructors, getters, and setters

    public int getPdtSeq() {
        return pdtSeq;
    }

    public void setPdtSeq(int pdtSeq) {
        this.pdtSeq = pdtSeq;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(int userSeq) {
        this.userSeq = userSeq;
    }
}

