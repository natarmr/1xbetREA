package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rs6 extends zje {
    public double i;
    public double j;
    public double k;
    public double l;
    public hru m;
    public qvo0 n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ dt6 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs6(dt6 dt6Var, zje zjeVar) {
        super(zjeVar);
        this.r = dt6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.P(0.0d, 0.0d, this);
    }
}
