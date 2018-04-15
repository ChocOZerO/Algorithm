/**
 * @param {number[]} nums
 * @return {string}
 */
var optimalDivision = function(nums) {
    var result = "";
    result += nums[0];
    for (var i = 1; i < nums.length; i++) {
        if (i !== 1 || nums.length === 2) {
            result += ("/" + nums[i]);
        } else {
            result += ("/(" + nums[i]);
        }
    }
    if (nums.length > 2) {
        result += ")";
    }
    return result;
};
