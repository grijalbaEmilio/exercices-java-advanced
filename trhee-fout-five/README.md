## aplicando 


se refactorizó la funcin `reverseStringRecursive` de la siguiente forma
```java
    public static String reverseString(String text, Integer textLength) {
        if (textLength == null) {
            textLength = text.length();
        }

        String character = text.split("")[textLength - 1];

        if (textLength == 1) {
            return character;
        }

        return character + reverseStringRecursive(text, textLength - 1);
    }

```


```java
     public static String reverseString(String text) {
        return Arrays
                .stream(text.split(""))
                .reduce("", (x, y) -> y + x);

    }
```
