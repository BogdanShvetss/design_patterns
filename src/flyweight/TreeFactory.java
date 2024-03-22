package flyweight;

public class TreeFactory {
    Tree deciduousTree, coniferTree = null;

    public TreeFactory() {
        this.deciduousTree = new DeciduousTree();
        this.coniferTree = new ConiferTree();
    }

    public Tree getTree(String type) throws Exception {
        if (type.equals("deciduous")) {
            return this.deciduousTree;
        } else if (type.equals("conifer")) {
            return this.coniferTree;
        } else {
            throw new Exception("Invalid kind of tree");
        }
    }
}