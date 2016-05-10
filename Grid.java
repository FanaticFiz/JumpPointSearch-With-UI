package algorithm;

import java.util.ArrayList;

/**
 *
 * @author Shane
 */
public class Grid {
    
    private GridNode[][] myNodes;
    private PathFinder pathFinder;

    /**
     * Set ups the resources to perform a JPS.
     * 
     * @param nodes node matrix
     * @param start starting GridNode
     * @param end ending GridNode
     */
    public Grid(GridNode nodes[][]){
    	
    	this.myNodes = nodes;
    	pathFinder = new PathFinder(this);    	
    }
    
    public ArrayList <GridNode> searchJPS(GridNode start, GridNode end){
    	return pathFinder.jumpPointSearch(start, end);
    }
    
    /**
     * Gets a node at the specified location in the grid
     * @param x
     * @param y
     * @return The node at the x,y coordinates
     */
    public GridNode getNode(int x, int y)
    {
        if(x >= this.myNodes.length || x < 0 || y >= this.myNodes[0].length || y < 0)
            return null;
        return this.myNodes[x][y];
    }//end getNode
    
    /**
     * Checks if a node is passable at the specified location in the grid
     * @param x
     * @param y
     * @return True if passable, false otherwise
     */
    public boolean isPassable(int x, int y)
    {
        if(x >= this.myNodes.length || x < 0 || y >= this.myNodes[0].length || y < 0)
            return false;
        return this.myNodes[x][y].isPassable();
    }//end isPassable
    
}//end Grid
