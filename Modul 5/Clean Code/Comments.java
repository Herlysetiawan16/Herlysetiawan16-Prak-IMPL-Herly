// Copyright (C) 2011 by Osoco. All rights reserved.
// Released under the terms of the GNU General Public License
// version 2 or later.

// Returns an instance of the Responder being tested.
protected abstract Responder responderInstance();

// Renaming the function: responderBeingTested

// Format matched: kk:mm:ss EEE, MMM dd, yyyy
Pattern timeMatcher = Pattern.compile(
    "\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*"
);

// Assertions to test comparison logic
assertTrue(a.compareTo(b) == -1); // a < b
assertTrue(b.compareTo(a) == 1);  // b > a
