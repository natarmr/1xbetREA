package a;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends c2 {
    public static v6 c;

    @Override // a.c2
    public final int[] D(int i) {
        int length = r().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && r().charAt(i - 1) == '\n' && !Q(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (r().charAt(i2) == '\n' || (i2 != 0 && r().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return n(i2, i);
    }

    public final boolean Q(int i) {
        if (i <= 0 || r().charAt(i - 1) == '\n') {
            return false;
        }
        return i == r().length() || r().charAt(i) == '\n';
    }

    @Override // a.c2
    public final int[] j(int i) {
        int length = r().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && r().charAt(i) == '\n' && (r().charAt(i) == '\n' || (i != 0 && r().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !Q(i2)) {
            i2++;
        }
        return n(i, i2);
    }
}
