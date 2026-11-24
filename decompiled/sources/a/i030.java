package a;

/* JADX INFO: loaded from: classes6.dex */
public final class i030 extends zje {
    public double i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o030 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i030(o030 o030Var, zje zjeVar) {
        super(zjeVar);
        this.l = o030Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.r(0.0d, 0.0d, null, this);
    }
}
