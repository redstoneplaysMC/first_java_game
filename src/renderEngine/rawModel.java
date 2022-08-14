package renderEngine;


/*
* Brief Explanation of VAO's and VBO's
* VAO:
*   Vertex array object.
*   An array of vertex objects
* VBO:
*   Vertex "Buffer" object
*   Stores a "State"
*/

public class rawModel {
    private int vaoID;
    private int vertexCount;
    public rawModel(int vaoID, int vertexCount){
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }
    public int getVertexCount() {
        return vertexCount;
    }
    public int getVaoID() {
        return vaoID;
    }
}
