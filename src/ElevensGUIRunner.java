public class ElevensGUIRunner {

    /**
     * Plays the GUI version of Elevens.
     * @param args is not used.
     */
    public static void main(String[] args) {
        Board board = new ElevensBoard();
        CardGameGUI gui = new CardGameGUI(board);
        gui.displayGame();
        Board board1 = new ThirteensBoard();
        CardGameGUI gui1 = new CardGameGUI(board1);
        gui1.displayGame();
    }
}
