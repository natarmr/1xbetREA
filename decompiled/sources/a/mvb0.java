package a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class mvb0 implements gp10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvb0 f22450a;
    public final int b;

    public mvb0(jvb0 jvb0Var, int i) throws InvalidAlgorithmParameterException {
        this.f22450a = jvb0Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        jvb0Var.f(new byte[0], i);
    }

    @Override // a.gp10
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        hny.o("invalid MAC");
    }

    @Override // a.gp10
    public final byte[] b(byte[] bArr) {
        return this.f22450a.f(bArr, this.b);
    }
}
