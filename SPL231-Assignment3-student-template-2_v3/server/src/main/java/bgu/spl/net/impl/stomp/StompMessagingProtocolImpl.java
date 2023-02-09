public class StompMessagingProtocolImpl implements StompMessagingProtocol {
    // TODO: attributes: connectionID, connections
    /**
	 * Used to initiate the current client protocol with it's personal connection ID and the connections implementation
	**/
    void start(int connectionId, Connections<T> connections)
    {
        // TODO
    }
    
    void process(T message)
    {
        // TODO: BEFORE IMPLEMENTING, PAY ATTENTION TO FLOW + PDF ABOUT FRAME
        /*
         * CONNECT
         * If username doesn't exit, create one with this password, then skip to (<3)
         * Else, if password incorrect -> error
         * Else, if user already logged in (check in the DB field loggedin) -> error
         * Else, (<3):
         * Add handler to Connections
         * Return response frames CONNECTED + RECEIPT
         */

        /*
         * SUBSCRIBE
         * add user to topic only if doesn't already exist
         * Return response frame RECEIPT
         */

        /*
         * UNSUBSCRIBE
         * remove user from topic if exits
         * Return response frame RECEIPT
         */

        /*
         * SEND
         * distribute frame MESSAGE to all the clients who are subscribed to the topic (probaly with ConnectionsImpl: send with channel)
         * Return response frame RECEIPT
         */
        
        /*
         * DISCONNECT
         * removes user from all topics (according to connectionId)
         * remove connectionHandler from Connections
         */
    }
	
	/**
     * @return true if the connection should be terminated
     */
    boolean shouldTerminate()
    {
        // TODO
    }
    
}
