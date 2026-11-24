package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojw0 {
    protected transient int zza;

    public final vjw0 a() {
        try {
            int iB = ((jkw0) this).b(null);
            vjw0 vjw0Var = sjw0.b;
            byte[] bArr = new byte[iB];
            yjw0 yjw0Var = new yjw0(bArr, iB);
            ((jkw0) this).k(yjw0Var);
            yjw0Var.f1();
            return new vjw0(bArr);
        } catch (IOException e) {
            e9d0.m(kng0.l("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int b(dlw0 dlw0Var);

    public final byte[] c() {
        try {
            int iB = ((jkw0) this).b(null);
            byte[] bArr = new byte[iB];
            yjw0 yjw0Var = new yjw0(bArr, iB);
            ((jkw0) this).k(yjw0Var);
            yjw0Var.f1();
            return bArr;
        } catch (IOException e) {
            e9d0.m(kng0.l("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
