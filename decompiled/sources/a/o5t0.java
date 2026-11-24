package a;

/* JADX INFO: loaded from: classes6.dex */
public final class o5t0 extends zje {
    public String i;
    public p5t0 j;
    public o5t0 k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ p5t0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5t0(p5t0 p5t0Var, zje zjeVar) {
        super(zjeVar);
        this.s = p5t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objA = this.s.a(null, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
