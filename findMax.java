public int findMax(TreeNode root) {
    int max = 0;
    if (root == null){
        return Integer.MIN_VALUE;
    }
    if (root.right == null || root.left == null){
       max = root.data;
    }
    max = root.data;
    int ld = findMax(root.left);
    int rd = findMax(root.right);

   if (ld > rd && ld > max){
       max = ld;
   }
   if (rd > ld && rd > max){
       max = rd;
   }
   return max;
}
