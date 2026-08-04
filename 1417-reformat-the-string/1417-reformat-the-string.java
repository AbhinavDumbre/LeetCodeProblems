class Solution {
    public String reformat(String s) {
		StringBuffer letter = new StringBuffer();
		StringBuffer digit = new StringBuffer();
		for (char i : s.toCharArray()) {
			if (Character.isLetter(i)) {
				letter.append(i);

			}
			if (Character.isDigit(i)) {
				digit.append(i);
			}

		}
		if (Math.abs(letter.length() - digit.length()) > 1) {
    return "";
}

      
		StringBuilder ans = new StringBuilder();

		int i = 0;
		int j = 0;
		if (digit.length() > letter.length()) {
			while (i < digit.length() || j < letter.length()) {
				if (i < digit.length()) {
					ans.append(digit.charAt(i));
					i++;
				}
				if (j < letter.length()) {
					ans.append(letter.charAt(j));
					j++;

				}
			}

		}
		else{
			while (i < letter.length() || j < digit.length()) {
				if (i < letter.length()) {
					ans.append(letter.charAt(i));
					i++;
				}
				if (j < digit.length()) {
					ans.append(digit.charAt(j));
					j++;

				}
			}

		}
        
		return ans.toString();
	}
}