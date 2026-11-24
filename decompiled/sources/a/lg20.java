package a;

/* JADX INFO: loaded from: classes.dex */
public final class lg20 extends zje {
    public boolean i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qg20 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.l = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k0(0.0d, this, false);
    }
}
