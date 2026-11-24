package a;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class bww0 implements tmw0 {
    public static final byte[] c = zcm0.t("7a806c");
    public static final byte[] d = zcm0.t("46bb91c3c5");
    public static final byte[] e = zcm0.t("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] f = zcm0.t("bae8e37fc83441b16034566b");
    public static final byte[] g = zcm0.t("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f3348a;
    public final byte[] b;

    public bww0(byte[] bArr, byte[] bArr2, vow0 vow0Var) {
        this.b = bArr2;
        cem0.x(bArr.length);
        this.f3348a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = f;
            cipher.init(2, new SecretKeySpec(e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(d);
            byte[] bArr2 = g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 28) {
            hny.o("ciphertext too short");
            return null;
        }
        if (!x7x0.b(bArr3, bArr)) {
            hny.o("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        Cipher cipherB = vow0.b();
        cipherB.init(2, this.f3348a, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherB = vow0.b();
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length > 2147483619 - bArr3.length) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrA = s7x0.a(12);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        cipherB.init(1, this.f3348a, new GCMParameterSpec(128, bArrA, 0, bArrA.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        int iDoFinal = cipherB.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(ua80.e(iDoFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
    }
}
