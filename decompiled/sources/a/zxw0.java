package a;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zxw0 implements tmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45179a;
    public final int b;
    public final r9x0 c;

    public zxw0(byte[] bArr, icw0 icw0Var, int i) {
        this.c = idm0.A(q9x0.u(o9x0.b(bArr.length), new rkt0(icw0.a(bArr), (byte) 11)));
        this.f45179a = icw0Var.b();
        this.b = i;
    }

    public static zxw0 a(qtw0 qtw0Var) throws GeneralSecurityException {
        xtw0 xtw0Var = qtw0Var.f29320a;
        int i = xtw0Var.b;
        if (i >= 8 && i <= 12) {
            return new zxw0(((icw0) qtw0Var.b.b).b(), qtw0Var.c, xtw0Var.b);
        }
        hny.o("invalid salt size");
        return null;
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            hny.u("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.f45179a;
        int length2 = bArr3.length;
        int i = this.b;
        if (length < length2 + i + 28) {
            hny.o("ciphertext too short");
            return null;
        }
        if (!x7x0.b(bArr3, bArr)) {
            hny.o("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        int length3 = bArr3.length + i;
        byte[] bArrD = d(Arrays.copyOfRange(bArr, bArr3.length, length3));
        if (!esw0.b(2)) {
            hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecC = kvw0.c(bArrD);
        int i2 = length3 + 12;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, i2);
        if (bArrCopyOfRange.length != 12) {
            hny.o("iv is wrong size");
            return null;
        }
        if (bArr.length < length3 + 28) {
            hny.o("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = kvw0.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipherB = kvw0.b();
        cipherB.init(2, secretKeySpecC, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, i2, bArr.length - i2);
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            hny.u("plaintext is null");
            return null;
        }
        int i = this.b;
        int i2 = i + 12;
        byte[] bArrA = s7x0.a(i2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i, i2);
        byte[] bArrD = d(bArrCopyOf);
        if (!esw0.b(2)) {
            hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecC = kvw0.c(bArrD);
        byte[] bArr3 = this.f45179a;
        int length = bArr3.length + i + bArrCopyOfRange.length;
        if (bArrCopyOfRange.length != 12) {
            hny.o("iv is wrong size");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = kvw0.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipherB = kvw0.b();
        cipherB.init(1, secretKeySpecC, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        int outputSize = cipherB.getOutputSize(bArr.length);
        if (outputSize > Integer.MAX_VALUE - length) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArr4 = new byte[length + outputSize];
        if (cipherB.doFinal(bArr, 0, bArr.length, bArr4, length) != outputSize) {
            hny.o("not enough data written");
            return null;
        }
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArr4, bArr3.length, bArrA.length);
        return bArr4;
    }

    public final byte[] d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            hny.o("invalid salt size");
            return null;
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        r9x0 r9x0Var = this.c;
        System.arraycopy(r9x0Var.e(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(r9x0Var.e(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
