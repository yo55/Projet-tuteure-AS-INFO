package project.network;

/**
 *
 * @author Jimenez
 */
public class NodeNotConnectedError extends NetworkError{
    private final Node node;
    NodeNotConnectedError(Node n){
        super();
        node = n;
    }

    public Node getNode() {
        return node;
    }
}