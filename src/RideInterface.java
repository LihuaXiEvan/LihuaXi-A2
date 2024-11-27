public interface RideInterface {

    /**
     Add visitor to the queue.  *
     * @param visitor
     */
    void addVisitorToQueue(Visitor visitor);

    /**
     * Remove visitor from the queue.
     * @param visitor
     */
    void removeVisitorFromQueue(Visitor visitor);

    /**
     * Print the queue.
     */
    void printQueue();

    /**
     * Run one cycle of the ride.
     */
    void runOneCycle();

    /**
     * Add visitor to the history.
     * @param visitor
     */
    void addVisitorToHistory(Visitor visitor);

    /**
     * Check visitor from history.
     * @param visitor
     */
    void checkVisitorFromHistory(Visitor visitor);

    /**
     * Print the history.
     */
    void numberOfVisitors();

    /**
     * Print the ride history.
     */
    void printRideHistory();
}
