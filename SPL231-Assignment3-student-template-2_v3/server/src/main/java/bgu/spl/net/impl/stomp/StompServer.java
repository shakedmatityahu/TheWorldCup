package bgu.spl.net.impl.stomp;

public class StompServer {

    public static void main(String[] args) {
        // TODO: implement this 
        // identify the server pattern according to args[1]

        /* TPC
         * create a TPC server using class server
         * call BaseServer::serve()
         * (serve() : creates a handler and assign it as a task to the thread, for each connection request + calls execute(handler))
         */

        /* Reactor
         * create a Reactor server using class server
         * call Reactor::serve()
         */
    }
}
