package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sv70 extends zje {
    public kr5 i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wv70 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv70(wv70 wv70Var, zje zjeVar) {
        super(zjeVar);
        this.m = wv70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, 0, 0, this);
    }
}
