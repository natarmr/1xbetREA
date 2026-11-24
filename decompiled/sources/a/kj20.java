package a;

/* JADX INFO: loaded from: classes.dex */
public final class kj20 extends zje {
    public double i;
    public double j;
    public String k;
    public xdr l;
    public hxu m;
    public txu n;
    public Object o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ on20 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.r = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.V(0.0d, 0.0d, null, null, false, null, this);
    }
}
