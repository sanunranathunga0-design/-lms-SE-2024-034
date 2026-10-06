package lms.model;

public class Member {
    private String memberId;
    private String name;
    private int borrowedCount;
    private int maxBorrowLimit;

    public Member(String memberId, String name, int maxBorrowLimit) {
        setMemberId(memberId);
        setName(name);
        this.maxBorrowLimit = maxBorrowLimit;
        this.borrowedCount = 0;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member ID cannot be blank");
        }
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public void setBorrowedCount(int borrowedCount) {
        if (borrowedCount < 0) {
            throw new IllegalArgumentException("Borrowed count cannot be negative");
        }
        this.borrowedCount = borrowedCount;
    }

    public void incrementBorrowedCount() {
        setBorrowedCount(this.borrowedCount + 1);
    }

    public int getMaxBorrowLimit() {
        return maxBorrowLimit;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", borrowedCount=" + borrowedCount +
                ", limit=" + maxBorrowLimit +
                '}';
    }
}