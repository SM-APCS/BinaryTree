package binarytree;

//********************************************************************
//  LetterTree.java     
//
//  Creates a binary tree storing letters at each node, then
//  prints the letters using a postorder traversal.
//********************************************************************


public class LetterTree
{
   public static void main (String[] args)
   {
      TreeNode h = new TreeNode("h", null, null);
      TreeNode e = new TreeNode("e", null, null);
      TreeNode l1 = new TreeNode("l", h, e);
      TreeNode l2 = new TreeNode("l", null, null);
      TreeNode o = new TreeNode("o", l1, l2);

      postorder(o);
   }

   //-----------------------------------------------------------------
   //  Prints each item in the tree with the given root using
   //  a postorder traversal.
   //-----------------------------------------------------------------
   private static void postorder (TreeNode current)
   {
      if (current.getLeft() != null)
         postorder(current.getLeft());

      if (current.getRight() != null)
         postorder(current.getRight());

      System.out.println(current.getValue());
   }
}
