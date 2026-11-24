package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t8b extends xkj implements dfn0 {
    public dfn0 g;
    public long h;
    public final /* synthetic */ byte i = 0;
    public Object j;

    public t8b(s3k s3kVar) {
        super((byte) 1);
        this.j = s3kVar;
    }

    @Override // a.dfn0
    public final int a(long j) {
        dfn0 dfn0Var = this.g;
        dfn0Var.getClass();
        return dfn0Var.a(j - this.h);
    }

    @Override // a.dfn0
    public final List e(long j) {
        dfn0 dfn0Var = this.g;
        dfn0Var.getClass();
        return dfn0Var.e(j - this.h);
    }

    @Override // a.dfn0
    public final long j(int i) {
        dfn0 dfn0Var = this.g;
        dfn0Var.getClass();
        return dfn0Var.j(i) + this.h;
    }

    @Override // a.dfn0
    public final int l() {
        dfn0 dfn0Var = this.g;
        dfn0Var.getClass();
        return dfn0Var.l();
    }

    @Override // a.xkj
    public final void v() {
        this.b = 0;
        this.e = 0L;
        this.f = false;
        this.g = null;
    }

    @Override // a.xkj
    public final void w() {
        switch (this.i) {
            case 0:
                u8b u8bVar = (u8b) ((gne) this.j).b;
                v();
                u8bVar.b.add(this);
                break;
            default:
                ((s3k) this.j).m(this);
                break;
        }
    }

    public /* synthetic */ t8b() {
        super((byte) 1);
    }
}
