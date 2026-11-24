package a;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g1e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y50 f10509a = new y50((byte) 10);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f10509a.get()).nextBytes(bArr);
        return bArr;
    }
}
