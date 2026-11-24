package a;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b3x0 implements dnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnw0 f1929a;
    public final byte[] b;

    public b3x0(dnw0 dnw0Var, byte[] bArr) {
        this.f1929a = dnw0Var;
        this.b = bArr;
    }

    @Override // a.dnw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        dnw0 dnw0Var = this.f1929a;
        if (length == 0) {
            return dnw0Var.b(bArr, null);
        }
        if (x7x0.b(bArr3, bArr)) {
            return dnw0Var.b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), null);
        }
        hny.o("Invalid ciphertext (output prefix mismatch)");
        return null;
    }
}
