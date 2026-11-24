package a;

/* JADX INFO: loaded from: classes3.dex */
public final class j87 extends zje {
    public boolean i;
    public ql5 j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ f97 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j87(f97 f97Var, zje zjeVar) {
        super(zjeVar);
        this.m = f97Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.N(false, this);
    }
}
