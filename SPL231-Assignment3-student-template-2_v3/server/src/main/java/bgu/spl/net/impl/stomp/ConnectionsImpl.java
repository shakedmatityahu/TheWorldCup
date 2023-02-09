public class ConnectionsImpl {
    //  TODO
    // private:
    // HashMap: key=connectionId (static counter), value=connectionHandler
    // topics = HashMap with key=topicName, value=HashMap(key=connectionId, value=subscriptionId)

    /* 3 functions that you must implement (You may add more if needed):

    - boolean send(int connectionId, T msg);
    sends a message T to client represented by the given connectionId.

    - void send(String channel, T msg);
    Sends a message T to clients subscribed to channel.

    - void disconnect(int connectionId);
    Removes an active client connectionId from the map
     */

    /*
     * The Connections object should be the used for sending messages to different clients from the protocol.
     * We tasked you with implementing the send() method in the connection handlers.
     * This method should be called from the send() methods of the Connection objects in order to use the connection handler
     to send messages to the clients they represent.
     */

}
