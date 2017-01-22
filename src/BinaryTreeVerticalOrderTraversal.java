/**
 * @author 李智
 * @date 2017/1/22
 *
 * Given a binary tree, print it vertically. The following example illustrates vertical order traversal.
 *      1
 *   /    \
 *  2      3
 *  / \    / \
 *  4   5  6   7
 *  \   \
 *   8   9
 *  The output of print this tree vertically will be:
 *  4
 *  2
 *  1 5 6
 *  3 8
 *  7
 *  9
 *
 *  这里垂直访问的意思是，每一列给它一个列号，左孩子比父节点的列号减1，右孩子比父节点的加1.列号相同的打印在同一行。
 */
public class BinaryTreeVerticalOrderTraversal {
}
