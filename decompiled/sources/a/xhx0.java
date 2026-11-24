package a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xhx0 implements ymw0 {
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final y50 f = new y50((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9x0 f40916a;
    public final byte[] b;
    public final byte[] c;

    public xhx0(byte[] bArr, icw0 icw0Var) throws GeneralSecurityException {
        if (!esw0.d(1)) {
            hny.o("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(ua80.e(bArr.length, "invalid key size: ", " bytes; key must have 32 or 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f40916a = idm0.A(q9x0.u(o9x0.b(bArrCopyOfRange.length), new rkt0(icw0.a(bArrCopyOfRange), (byte) 11)));
        this.c = icw0Var.b();
    }
}
