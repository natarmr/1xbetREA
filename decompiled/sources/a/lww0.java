package a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class lww0 implements tmw0 {
    public static final byte[] d = zcm0.t("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] e = zcm0.t("070000004041424344454647");
    public static final byte[] f = zcm0.t("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f20784a;
    public final byte[] b;
    public final Provider c;

    public lww0(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!esw0.d(1)) {
            hny.o("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f20784a = new SecretKeySpec(bArr, "ChaCha20");
        this.b = bArr2;
        this.c = provider;
    }

    public static Cipher a() {
        Cipher cipher = (Cipher) gix0.b.f11371a.zza("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(e);
            byte[] bArr = d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        hny.o("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    public static boolean d() {
        try {
            a();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            hny.u("ciphertext is null");
            return null;
        }
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
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, this.f20784a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            hny.u("plaintext is null");
            return null;
        }
        byte[] bArrA = s7x0.a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(1, this.f20784a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.b;
        if (outputSize > 2147483635 - bArr3.length) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        hny.o("not enough data written");
        return null;
    }
}
