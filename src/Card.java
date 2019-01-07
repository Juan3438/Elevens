public class Card {

    private String rank;
    private String suit;
    private int value;

    public Card (String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }
    /**
     * Checks if a Cards value is equal to another Cards value.
     * @param other Any other Card.
     * @return True if both values are equal. Otherwise false.
     */
    public boolean equals(Card other) {
        if (this.value == other.getPointValue()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() { return this.rank + "-" + this.suit + "-" + this.value; }

    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }

    public String getSuit() { return suit; }
    public void setSuit(String suit) { this.suit = suit; }

    public int getPointValue() { return value; }
    public void setPointValue(int pointValue) { this.value = pointValue; }
}