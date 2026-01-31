package com;

// it is used to remove the repeated elements

//Alice is priting on a system that processos inputs frontiers. Ove of is that the text mugs hot contain the substring "ppp consecutae 'p mjected 1330 characters If this substring appears, the testi
//
//prasado make the input text acceptable, Alice needs to remove a way that the substring "ppp" does not exist. characters 123 in such
//
//1237
//
//akala
//
//JagatTour task is to help Alice find and return an integer value representing the minimum number of characters that need to be removed from the text to meet this requirement.
//
//Note:
//The string only contains lowercase alphabetic thatotters
//You can delete characters in Jandem positions (not necessarily consecutive).

public class SliceTask {
	public static int minRemovals(String text) {
		int n = text.length();
		int removalCount = 0;
		int consecutiveP = 0;

		// Iterate through the string
		for (int i = 0; i < n; i++) {
			// Check if the character is 'p'
			if (text.charAt(i) == 'p') {
				consecutiveP++;
			} else {
				// Reset the counter if the current character is not 'p'
				consecutiveP = 0;
			}

			// If we encounter 3 or more consecutive 'p's
			if (consecutiveP > 2) {
				removalCount++;
			}
		}

		return removalCount;
	}

	public static void main(String[] args) {
		// Test cases
		String input1 = "ppppapppppppppb";
		String input2 = "applepie";
		String input3 = "pppppppppp";

		System.out.println(minRemovals(input1)); // Output: 10
		System.out.println(minRemovals(input2)); // Output: 0
		System.out.println(minRemovals(input3)); // Output: 8
	}
}
