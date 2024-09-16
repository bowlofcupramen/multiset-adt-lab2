import java.util.ArrayList;

public class Tree {
    private Integer _root;
    private ArrayList<Tree> _subtrees = new ArrayList<Tree>();

    public Tree(
        Integer root,
        ArrayList<Tree> subtrees
    ) {
        _root = root;

        if (subtrees != null) {
            _subtrees = subtrees;
        }

    }

    public boolean is_empty() {
        return _root == null;
    }

    public int length () {
        if (is_empty()) return 0;

        int size = 1;

        for (Tree subtree : _subtrees) {
            size += subtree.length();
        }

        return size;
    }

    public int count(int item) {
        if (is_empty()) return 0;
        int count = 0;

        if (_root == item) count++;

        for (Tree subtree : _subtrees) {
            count += subtree.count(item);
        }

        return count;
    }



}
