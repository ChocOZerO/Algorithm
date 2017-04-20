/**
 * @param {string} s
 * @return {boolean}
 */
var checkRecord = function(s) {
    var absentCheck = 0;
    var result = true;
    for (var i = 0; i < s.length; i++) {
        if (s[i] === "A") {
            absentCheck++;
            if (absentCheck > 1) {
                result = false;
                break;
            }
        } else if (s[i] === "L" && s[i] === s[i-1]) {
            if ((i-2) >= 0) {
                if (s[i-1] === s[i-2]) {
                    result = false;
                    break;
                }
            }
        }
    }
    return result;
};
