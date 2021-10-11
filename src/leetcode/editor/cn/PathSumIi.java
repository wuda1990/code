//<p>给你二叉树的根节点 <code>root</code> 和一个整数目标和 <code>targetSum</code> ，找出所有 <strong>从根节点到叶子节点</strong> 路径总和等于给定目标和的路径。</p>
//
//<p><strong>叶子节点</strong> 是指没有子节点的节点。</p>
//
//<div class="original__bRMd">
//<div>
//<p> </p>
//
//<p><strong>示例 1：</strong></p>
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsumii1.jpg" style="width: 500px; height: 356px;" />
//<pre>
//<strong>输入：</strong>root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//<strong>输出：</strong>[[5,4,11,2],[5,8,4,5]]
//</pre>
//
//<p><strong>示例 2：</strong></p>
//<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg" style="width: 212px; height: 181px;" />
//<pre>
//<strong>输入：</strong>root = [1,2,3], targetSum = 5
//<strong>输出：</strong>[]
//</pre>
//
//<p><strong>示例 3：</strong></p>
//
//<pre>
//<strong>输入：</strong>root = [1,2], targetSum = 0
//<strong>输出：</strong>[]
//</pre>
//
//<p> </p>
//
//<p><strong>提示：</strong></p>
//
//<ul>
//	<li>树中节点总数在范围 <code>[0, 5000]</code> 内</li>
//	<li><code>-1000 <= Node.val <= 1000</code></li>
//	<li><code>-1000 <= targetSum <= 1000</code></li>
//</ul>
//</div>
//</div>
//<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>回溯</li><li>二叉树</li></div></div><br><div><li>👍 598</li><li>👎 0</li></div>
  
package leetcode.editor.cn;
public class PathSumIi{
  public static void main(String[] args) {
       Solution solution = new PathSumIi().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}