def longestCommonPrefix(strs: list[str]) -> str:

    for word in strs:
        word_len = len(word)
        word_mid = round(word_len / 2)
        print(word_mid)



#longestCommonPrefix(["aaa", "bbb"])