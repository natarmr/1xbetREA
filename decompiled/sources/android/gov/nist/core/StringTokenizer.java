package android.gov.nist.core;

import a.hny;
import java.text.ParseException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class StringTokenizer {
    protected char[] buffer;
    protected int bufferLen;
    protected int ptr;
    protected int savedPtr;

    public StringTokenizer(String str) {
        this.buffer = str.toCharArray();
        this.bufferLen = str.length();
        this.ptr = 0;
    }

    public static String getSDPFieldName(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf("="));
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static boolean isAlpha(char c) {
        if (c <= 127) {
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        }
        return Character.isLowerCase(c) || Character.isUpperCase(c);
    }

    public static boolean isAlphaDigit(char c) {
        if (c <= 127) {
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c <= '9' && c >= '0');
        }
        return Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isDigit(c);
    }

    public static boolean isDigit(char c) {
        if (c <= 127) {
            return c <= '9' && c >= '0';
        }
        return Character.isDigit(c);
    }

    public static boolean isHexDigit(char c) {
        if (c < 'A' || c > 'F') {
            return (c >= 'a' && c <= 'f') || isDigit(c);
        }
        return true;
    }

    public void consume(int i) {
        this.ptr += i;
    }

    public String getLine() {
        int i;
        int i2;
        int i3 = this.ptr;
        while (true) {
            i = this.ptr;
            i2 = this.bufferLen;
            if (i >= i2 || this.buffer[i] == '\n') {
                break;
            }
            this.ptr = i + 1;
        }
        if (i < i2 && this.buffer[i] == '\n') {
            i++;
            this.ptr = i;
        }
        return String.valueOf(this.buffer, i3, i - i3);
    }

    public Vector<String> getLines() {
        Vector<String> vector = new Vector<>();
        while (hasMoreChars()) {
            vector.addElement(getLine());
        }
        return vector;
    }

    public char getNextChar() {
        int i = this.ptr;
        int i2 = this.bufferLen;
        char[] cArr = this.buffer;
        if (i < i2) {
            this.ptr = i + 1;
            return cArr[i];
        }
        hny.j(this.ptr, ((Object) cArr) + " getNextChar: End of buffer");
        return (char) 0;
    }

    public String getNextToken(char c) throws ParseException {
        int i = this.ptr;
        while (true) {
            char cLookAhead = lookAhead(0);
            if (cLookAhead == c) {
                return String.valueOf(this.buffer, i, this.ptr - i);
            }
            if (cLookAhead == 0) {
                hny.j(0, "EOL reached");
                return null;
            }
            consume(1);
        }
    }

    public boolean hasMoreChars() {
        return this.ptr < this.bufferLen;
    }

    public char lookAhead(int i) {
        try {
            return this.buffer[this.ptr + i];
        } catch (IndexOutOfBoundsException unused) {
            return (char) 0;
        }
    }

    public String nextToken() {
        int i;
        char c;
        int i2 = this.ptr;
        do {
            i = this.ptr;
            if (i >= this.bufferLen) {
                break;
            }
            c = this.buffer[i];
            i++;
            this.ptr = i;
        } while (c != '\n');
        return String.valueOf(this.buffer, i2, i - i2);
    }

    public String peekLine() {
        int i = this.ptr;
        String line = getLine();
        this.ptr = i;
        return line;
    }

    public void consume() {
        this.ptr = this.savedPtr;
    }

    public char lookAhead() {
        return lookAhead(0);
    }

    public StringTokenizer() {
    }
}
