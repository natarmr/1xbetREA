package a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class t9x0 implements r9x0 {
    public static final y50 d = new y50((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f33589a;
    public final byte[] b;
    public final byte[] c;

    public t9x0(byte[] bArr) throws GeneralSecurityException {
        cem0.x(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f33589a = secretKeySpec;
        if (!esw0.d(1)) {
            hny.o("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = idm0.B(cipher.doFinal(new byte[16]));
        this.b = bArrB;
        this.c = idm0.B(bArrB);
    }

    @Override // a.r9x0
    public final byte[] e(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrA;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!esw0.d(1)) {
            hny.o("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, this.f33589a);
        int length = bArr.length;
        int iD = length == 0 ? 1 : hne.d(length, 1, 16, 1);
        if ((iD << 4) == bArr.length) {
            bArrA = egm0.z(bArr, (iD - 1) << 4, 16, this.b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iD - 1) << 4, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                jf4.o("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrA = egm0.A(bArrCopyOf, this.c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < iD - 1; i2++) {
            int i3 = i2 << 4;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i4] = (byte) (bArr2[i4] ^ bArr[i4 + i3]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                jf4.n("Cipher didn't write full block");
                return null;
            }
        }
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr2[i5] ^ bArrA[i5]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        jf4.n("Cipher didn't write full block");
        return null;
    }
}
