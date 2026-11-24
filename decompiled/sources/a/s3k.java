package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class s3k extends cyj0 implements efn0 {
    public final lfn0 n;

    public s3k(lfn0 lfn0Var) {
        super(new hfn0[2], new t8b[2]);
        int i = this.g;
        wkj[] wkjVarArr = this.e;
        x0x.K(i == wkjVarArr.length);
        for (wkj wkjVar : wkjVarArr) {
            wkjVar.x(1024);
        }
        this.n = lfn0Var;
    }

    @Override // a.cyj0
    public final wkj f() {
        return new hfn0(1);
    }

    @Override // a.cyj0
    public final xkj g() {
        return new t8b(this);
    }

    @Override // a.cyj0
    public final ypc h(Throwable th) {
        return new ffn0("Unexpected decode error", th);
    }

    @Override // a.cyj0
    public final ypc i(wkj wkjVar, xkj xkjVar, boolean z) {
        hfn0 hfn0Var = (hfn0) wkjVar;
        t8b t8bVar = (t8b) xkjVar;
        try {
            ByteBuffer byteBuffer = hfn0Var.g;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            lfn0 lfn0Var = this.n;
            if (z) {
                lfn0Var.reset();
            }
            dfn0 dfn0VarF = lfn0Var.f(bArrArray, 0, iLimit);
            long j = hfn0Var.i;
            long j2 = hfn0Var.l;
            t8bVar.e = j;
            t8bVar.g = dfn0VarF;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            t8bVar.h = j;
            t8bVar.f = false;
            return null;
        } catch (ffn0 e) {
            return e;
        }
    }

    @Override // a.efn0
    public final void a(long j) {
    }
}
