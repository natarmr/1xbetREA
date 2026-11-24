package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class rtt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ltt0 f31092a;

    static {
        f31092a = (jft0.e && jft0.d && !dw2.a()) ? new ltt0((byte) 1) : new ltt0((byte) 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new ott0(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        itt0.i(((long) i2) + 4294967296L);
        return 0;
    }
}
