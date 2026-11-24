package a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class cyw0 implements tmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5197a;
    public final byte[] b;
    public final Provider c;

    public cyw0(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!esw0.d(1)) {
            hny.o("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5197a = bArr;
        this.b = bArr2;
        this.c = provider;
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            hny.u("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 40) {
            hny.o("ciphertext too short");
            return null;
        }
        if (!x7x0.b(bArr3, bArr)) {
            hny.o("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(xww0.c(this.f5197a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = lww0.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            hny.u("plaintext is null");
            return null;
        }
        byte[] bArrA = s7x0.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(xww0.c(this.f5197a, bArrA), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrA, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        byte[] bArr4 = lww0.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr5 = this.b;
        if (outputSize > 2147483623 - bArr5.length) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr5.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr5.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        hny.o("not enough data written");
        return null;
    }
}
