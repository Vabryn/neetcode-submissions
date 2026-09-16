class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        counts = dict()

        for char1 in s:
            counts[char1] = counts.get(char1, 0) + 1
        for char2 in t:
            if counts.get(char2, 0) == 0:
                return False
            counts[char2] = counts.get(char2, 0) - 1
        return True

