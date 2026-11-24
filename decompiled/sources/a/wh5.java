package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wh5 extends zje {
    public boolean i;
    public String j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kb0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh5(kb0 kb0Var, zje zjeVar) {
        super(zjeVar);
        this.m = kb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(this, null, false);
    }
}
