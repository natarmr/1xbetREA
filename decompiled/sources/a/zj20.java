package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zj20 extends zje {
    public double i;
    public double j;
    public double k;
    public double l;
    public hru m;
    public qvo0 n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ln20 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj20(ln20 ln20Var, zje zjeVar) {
        super(zjeVar);
        this.r = ln20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.Q(0.0d, 0.0d, this);
    }
}
