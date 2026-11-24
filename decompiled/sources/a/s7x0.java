package a;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s7x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y50 f31774a = new y50((byte) 21);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f31774a.get()).nextBytes(bArr);
        return bArr;
    }
}
