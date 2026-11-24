package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n4s0 extends zje {
    public long i;
    public long j;
    public long k;
    public afm0 l;
    public afm0 m;
    public n4s0 n;
    public Throwable o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ afm0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4s0(afm0 afm0Var, zje zjeVar) {
        super(zjeVar);
        this.t = afm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Object objK = this.t.k(0L, this);
        return objK == wne.f39444a ? objK : new j0g0(objK);
    }
}
