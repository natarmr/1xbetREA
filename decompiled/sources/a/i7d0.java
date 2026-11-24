package a;

/* JADX INFO: loaded from: classes.dex */
public final class i7d0 extends zje {
    public jnf0 i;
    public String j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k7d0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7d0(k7d0 k7d0Var, zje zjeVar) {
        super(zjeVar);
        this.m = k7d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, this);
    }
}
