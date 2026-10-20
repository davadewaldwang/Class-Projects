/// dava dewald-wang
/// LinkedBST.java

/// This file should look VERY similar to your AnimalList.java file. Open AnimalList in another tab and look at it before you get started
import java.util.ArrayList;
import java.util.List;



public class LinkedBST
{
    private TreeNode root;

    public LinkedBST() //constructor
    {
        root = null;
    }

    public boolean addNode(Comparable addMe)
    {
        if (root == null) //if tree is empty add as root
        {
            root = new TreeNode(addMe); 
            return true;
        }
        TreeNode current = root; //start at root
        return addHelper(addMe, current);
    }

    public List preOrder()
    {
        List result = new ArrayList<>(); //list to return with all values
        preOrderTraverse(root, result);
        return result;
    }

    public List inOrder()
    {
        List result = new ArrayList<>();
        inOrderTraverse(root, result);
        return result;
    }

    public List postOrder()
    {
        List result = new ArrayList<>();
        postOrderTraverse(root, result);
        return result;
    }

    public boolean deleteNode(Comparable find)
    {
        TreeNode delete = root;
        return deleteNode(find(delete, find),root,null);
    }

    public boolean search(Comparable key)
    {
        TreeNode current = root;
        return search(current,key);
    }

    public int countLeaf()
    {
        TreeNode current = root;
        return countLeaf(current);
    }

    public int pathLength(Comparable find)
    {
        TreeNode current = root;
        if (!search(find)) //-1 if find not in tree
            return -1;
        return pathLength(current, find);
    }

    public int countNode()
    {
        TreeNode current = root;
        return countNode(current);
    }



    //helper methods
    private boolean addHelper(Comparable addMe, TreeNode current)
    {
        if (current.getValue().equals(addMe)) //cant add duplicate value
            return false;
        if (addMe.compareTo(current.getValue()) < 0) //go to left if less than current
        {
            if (current.getLeft() != null) //keep recursing through until empty node
                return addHelper(addMe, current.getLeft());
            current.setLeft(new TreeNode(addMe));
            return true;
        } //go to right if not less ie greater
        if (current.getRight() != null)
            return addHelper(addMe, current.getRight());
        current.setRight(new TreeNode(addMe));
        return true;
    }

    private void preOrderTraverse(TreeNode current, List list)
    {
        if (current == null)
            return;
        list.add(current.getValue()); //root comes first
        preOrderTraverse(current.getLeft(), list);
        preOrderTraverse(current.getRight(), list);
        
    }

    private void inOrderTraverse(TreeNode current, List list)
    {
        if (current == null)
            return;
        inOrderTraverse(current.getLeft(), list);
        list.add(current.getValue()); //root in between
        inOrderTraverse(current.getRight(), list);

    }

    private void postOrderTraverse(TreeNode current, List list)
    {
        if (current == null)
            return;
        
        postOrderTraverse(current.getLeft(), list);
        postOrderTraverse(current.getRight(), list);
        list.add(current.getValue()); //root last
    }

    private boolean deleteNode(TreeNode delete, TreeNode prev, TreeNode big)
    {
        if (prev == null || delete == null) //stopping condition
            return false;
        if (delete.getRight() == null || delete.getLeft() == null) //one or zero children
        {
            if (delete == root) //deleting root node with one or no children
            {
                if (root.getLeft() != null) //sets root to whichever child exists or null
                    root = root.getLeft();
                else
                    root = root.getRight();
                return true;
            }
            if (prev.getLeft() == delete)
            {
                if (delete.getLeft() != null) //sets parent's left/right " "
                    prev.setLeft(delete.getLeft());
                else
                    prev.setLeft(delete.getRight());
                return true;
            }
            if (prev.getRight() == delete)
            {
                if (delete.getRight() != null)
                    prev.setRight(delete.getRight());
                else
                    prev.setRight(delete.getLeft());
                return true;
            }
        }
        //two children
        if (delete.getLeft() != null && delete.getRight() != null)
        {
            big = biggest(delete.getLeft()); //set big to node with largest value on left side
            delete.setValue(big.getValue()); //replace delete with big
            return deleteNode(big, prev, null); //delete biggest node
        }
        return deleteNode(delete, prev.getLeft(), null) || deleteNode(delete, prev.getRight(), null);//backtrack through to find correct placement for prev       
    }

    private TreeNode find(TreeNode current, Comparable value) //returns pointer to treenode value
    {
        if (current == null)
            return null;
        if (current.getValue().equals(value))
            return current;
        if (value.compareTo(current.getValue()) < 0)
            return find(current.getLeft(), value);
        return find(current.getRight(), value);
    }

    private TreeNode biggest(TreeNode current) //returns pointer to treenode w/ largest value
    {
        if (current == null)
            return null;
        if (current.getRight() == null)//must be largest value - nothing bigger
            return current;
        return biggest(current.getRight());
    }

    private boolean search(TreeNode current, Comparable key)
    {
        if (current == null)
            return false;
        if (key.equals(current.getValue())) //found
            return true;
        if (key.compareTo(current.getValue()) < 0) //left if smaller, right if bigger
            return search(current.getLeft(), key);
        return search(current.getRight(), key);
    }

    private int countLeaf(TreeNode current)
    {
        if (current == null)
            return 0;
        if (current.getLeft() == null && current.getRight() == null) //no children = leaf
            return 1;
        return countLeaf(current.getLeft()) + countLeaf(current.getRight()); //number of leaves to left and right
    }

    private int pathLength(TreeNode current, Comparable find)
    {
        if (current == null)
            return 0;
        if (find.equals(current.getValue())) //stopping point
            return 0;
        if (find.compareTo(current.getValue()) < 0) //1 step
            return 1 + pathLength(current.getLeft(), find);
        return 1 + pathLength(current.getRight(), find);
    }

    private int countNode(TreeNode current)
    {
        if (current == null)
            return 0;
        return 1 + countNode(current.getLeft()) + countNode(current.getRight()); //adding current and everything left and right to sum
    }
}