package a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class hix0 implements tmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final shx0 f13137a;
    public final acw0 b;
    public final int c;
    public final byte[] d;

    public hix0(shx0 shx0Var, acw0 acw0Var, int i, byte[] bArr) {
        this.f13137a = shx0Var;
        this.b = acw0Var;
        this.c = i;
        this.d = bArr;
    }

    public static hix0 a(uqw0 uqw0Var) {
        byte[] bArrB = ((icw0) uqw0Var.b.b).b();
        brw0 brw0Var = uqw0Var.f36138a;
        shx0 shx0Var = new shx0(bArrB, brw0Var.c);
        lvb0 lvb0Var = new lvb0("HMAC".concat(String.valueOf(brw0Var.f)), new SecretKeySpec(((icw0) uqw0Var.c.b).b(), "HMAC"), (byte) 1);
        int i = brw0Var.d;
        return new hix0(shx0Var, new acw0(lvb0Var, i), i, uqw0Var.d.b());
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length < length2 + i) {
            hny.o("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!x7x0.b(bArr3, bArr)) {
            hny.o("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.b.a(egm0.B(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            hny.o("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        shx0 shx0Var = this.f13137a;
        int i2 = shx0Var.b;
        if (length3 < i2) {
            hny.o("ciphertext too short");
            return null;
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i2);
        int length4 = bArrCopyOfRange.length;
        int i3 = shx0Var.b;
        byte[] bArr5 = new byte[length4 - i3];
        shx0Var.a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr5, 0, bArr4, false);
        return bArr5;
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        shx0 shx0Var = this.f13137a;
        int i = shx0Var.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(twn.m(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = s7x0.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        shx0Var.a(bArr, 0, bArr.length, bArr3, shx0Var.b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return egm0.B(this.d, bArr3, this.b.a(egm0.B(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
