package a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class iwn implements a50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z50 f15498a;
    public final gp10 b;
    public final int c;

    public iwn(z50 z50Var, gp10 gp10Var, int i) {
        this.f15498a = z50Var;
        this.b = gp10Var;
        this.c = i;
    }

    @Override // a.a50
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        z50 z50Var = this.f15498a;
        z50Var.getClass();
        int length = bArr.length;
        int i = z50Var.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(twn.m(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = g1e0.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        z50Var.a(bArr, 0, bArr.length, bArr3, z50Var.b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return nia0.b0(bArr3, this.b.b(nia0.b0(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // a.a50
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            hny.o("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, nia0.b0(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        z50 z50Var = this.f15498a;
        z50Var.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = z50Var.b;
        if (length2 < i2) {
            hny.o("ciphertext too short");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = z50Var.b;
        byte[] bArr4 = new byte[length3 - i3];
        z50Var.a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
