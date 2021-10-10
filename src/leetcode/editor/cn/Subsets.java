//<p>给你一个整数数组 <code>nums</code> ，数组中的元素 <strong>互不相同</strong> 。返回该数组所有可能的子集（幂集）。</p>
//
//<p>解集 <strong>不能</strong> 包含重复的子集。你可以按 <strong>任意顺序</strong> 返回解集。</p>
//
//<p> </p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>nums = [1,2,3]
//<strong>输出：</strong>[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>nums = [0]
//<strong>输出：</strong>[[],[0]]
//</pre>
//
//<p> </p>
//
//<p><strong>提示：</strong></p>
//
//<ul>
//	<li><code>1 <= nums.length <= 10</code></li>
//	<li><code>-10 <= nums[i] <= 10</code></li>
//	<li><code>nums</code> 中的所有元素 <strong>互不相同</strong></li>
//</ul>
//<div><div>Related Topics</div><div><li>位运算</li><li>数组</li><li>回溯</li></div></div><br><div><li>👍 1348</li><li>👎 0</li></div>
  
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Subsets{
  public static void main(String[] args) {
       Solution solution = new Subsets().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}