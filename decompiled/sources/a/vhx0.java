package a;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class vhx0 implements tmw0 {
    public static final y50 e = new y50((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37451a;
    public final r9x0 b;
    public final SecretKeySpec c;
    public final int d;

    public vhx0(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!esw0.d(1)) {
            hny.o("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            jf4.o("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.d = i;
        cem0.x(bArr.length);
        this.c = new SecretKeySpec(bArr, "AES");
        this.b = idm0.A(q9x0.u(o9x0.b(bArr.length), new rkt0(icw0.a(bArr), (byte) 11)));
        this.f37451a = bArr2;
    }

    public static vhx0 a(crw0 crw0Var) throws GeneralSecurityException {
        if (!esw0.d(1)) {
            hny.o("Can not use AES-EAX in FIPS-mode.");
            return null;
        }
        jrw0 jrw0Var = crw0Var.f4865a;
        if (jrw0Var.c != 16) {
            throw new GeneralSecurityException(twn.m(jrw0Var.c, "AesEaxJce only supports 16 byte tag size, not "));
        }
        return new vhx0(jrw0Var.b, ((icw0) crw0Var.b.b).b(), crw0Var.c.b());
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f37451a;
        int length2 = length - bArr3.length;
        int i = this.d;
        int i2 = (length2 - i) - 16;
        if (i2 < 0) {
            hny.o("ciphertext too short");
            return null;
        }
        if (!x7x0.b(bArr3, bArr)) {
            hny.o("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrD = d(0, bArr, bArr3.length, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrD2 = d(1, bArr2, 0, bArr2.length);
        byte[] bArrD3 = d(2, bArr, bArr3.length + i, i2);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length3 + i3] ^ bArrD2[i3]) ^ bArrD[i3]) ^ bArrD3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(bArrD));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f37451a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i = this.d;
        if (length > (length2 - i) - 16) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] bArrA = s7x0.a(i);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, i);
        byte[] bArrD = d(0, bArrA, 0, bArrA.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrD2 = d(1, bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(bArrD));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + i);
        byte[] bArrD3 = d(2, bArrCopyOf, bArr3.length + i, bArr.length);
        int length3 = bArr3.length + bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArrCopyOf[length3 + i2] = (byte) ((bArrD2[i2] ^ bArrD[i2]) ^ bArrD3[i2]);
        }
        return bArrCopyOf;
    }

    public final byte[] d(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.b.e(bArr2, 16);
    }
}
