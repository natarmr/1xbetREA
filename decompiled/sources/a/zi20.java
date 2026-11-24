package a;

/* JADX INFO: loaded from: classes.dex */
public final class zi20 extends zje {
    public hxu i;
    public txu j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ on20 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.m = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.N(null, null, 0.0d, 0.0d, null, this);
    }
}
