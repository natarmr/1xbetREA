package a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class l70 implements igk {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywu f19533a;
    public final byte[] b;

    public l70(byte[] bArr) throws GeneralSecurityException {
        if (!brm0.a(1)) {
            hny.o("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(rz4.j(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f19533a = new ywu(bArrCopyOfRange);
    }

    @Override // a.igk
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            hny.o("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) lyn.b.f20870a.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return nia0.b0(bArrC, cipher.doFinal(bArr));
    }

    @Override // a.igk
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            hny.o("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) lyn.b.f20870a.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrJ0;
        int length = bArr.length;
        ywu ywuVar = this.f19533a;
        if (length == 0) {
            return ywuVar.f(e, 16);
        }
        byte[] bArrF = ywuVar.f(d, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrF = nia0.j0(uc9.R(bArrF), ywuVar.f(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrF.length) {
                jf4.o("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrF.length;
            bArrJ0 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrF.length; i2++) {
                int i3 = length2 + i2;
                bArrJ0[i3] = (byte) (bArrJ0[i3] ^ bArrF[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                jf4.o("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrJ0 = nia0.j0(bArrCopyOf, uc9.R(bArrF));
        }
        return ywuVar.f(bArrJ0, 16);
    }
}
