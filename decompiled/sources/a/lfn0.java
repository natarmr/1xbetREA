package a;

/* JADX INFO: loaded from: classes.dex */
public interface lfn0 {
    void d(byte[] bArr, int i, int i2, kfn0 kfn0Var, rbe rbeVar);

    default dfn0 f(byte[] bArr, int i, int i2) {
        u3x u3xVarL = b4x.l();
        d(bArr, 0, i2, kfn0.c, new b0l0(u3xVarL, (byte) 9));
        return new gtf(u3xVarL.g());
    }

    default void reset() {
    }
}
