package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z710 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f43896a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f43896a = bArr;
    }
}
