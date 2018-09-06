#### Unity Text Analyzer Exercise

[![Build Status](https://travis-ci.org/mrisney/unity-text-exercise.svg?branch=master)](https://travis-ci.org/mrisney/unity-text-exercise)
[![codecov](https://codecov.io/gh/mrisney/unity-text-exercise/branch/master/graph/badge.svg)](https://codecov.io/gh/mrisney/unity-text-exercise)

This is a simple algorithm using Java 8 that is essentially a text analyzer that processes text and provides information about its word contents.  The report can be sorted, with a primary sort of word length, and a secondary ASCII sort. The code is a 1.0, there is an implementation within a Microservice that can be run as a SpringBoot Fat jar or Docker

[SrpingBoot Docker Implementation](https://github.com/mrisney/unity-text-example)

There are two classes
[TextAnalyzer](https://github.com/mrisney/unity-text-exercise/blob/master/src/main/java/com/risney/unity/text/TextAnalyzer.java) and the model [Word](https://github.com/mrisney/unity-text-exercise/blob/master/src/main/java/com/risney/unity/text/Word.java)

The Tests are here :
[Tests](https://github.com/mrisney/unity-text-exercise/tree/master/src/test/java)

[Sample Input](https://github.com/mrisney/unity-text-exercise/tree/master/src/test/resources)

This does not rely on Java Collections.
Example:
Input:

```The quick brown fox jumped over the lazy brown dog’s back```

#### Which would result in the following output:
```
    1 The
    1 fox
    1 the
    1 back
    1 lazy
    1 over
    2 brown
    1 dog’s
    1 quick
    1 jumped
```    
