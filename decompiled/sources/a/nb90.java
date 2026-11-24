package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nb90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f23230a;

    static {
        int[] iArr = new int[256];
        int i = 0;
        while (i < 256) {
            int i2 = 2;
            if (i < 2) {
                i2 = 0;
            } else if (i < 4) {
                i2 = 1;
            } else if (i >= 8) {
                if (i < 16) {
                    i2 = 3;
                } else if (i < 32) {
                    i2 = 4;
                } else if (i < 64) {
                    i2 = 5;
                } else {
                    i2 = i < 128 ? 6 : 7;
                }
            }
            iArr[i] = i2;
            i++;
        }
        f23230a = iArr;
    }
}
