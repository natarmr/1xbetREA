package a;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class b70 implements a50 {
    public static final y50 b = new y50((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f2080a;

    public b70(byte[] bArr) {
        twt0.a(bArr.length);
        this.f2080a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            hny.o("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            return null;
        }
    }

    @Override // a.a50
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = g1e0.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA, bArrA.length);
        y50 y50Var = b;
        ((Cipher) y50Var.get()).init(1, this.f2080a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) y50Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) y50Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(ua80.e(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // a.a50
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            hny.o("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 12);
        y50 y50Var = b;
        ((Cipher) y50Var.get()).init(2, this.f2080a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) y50Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) y50Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
