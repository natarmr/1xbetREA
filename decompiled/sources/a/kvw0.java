package a;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kvw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y50 f18975a = new y50(19);

    public static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        Integer numC = x7x0.c();
        return (numC == null || numC.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    public static Cipher b() {
        return (Cipher) f18975a.get();
    }

    public static SecretKeySpec c(byte[] bArr) {
        cem0.x(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
