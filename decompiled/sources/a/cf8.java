package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cf8 extends zje {
    public long i;
    public String j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bbw0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf8(bbw0 bbw0Var, zje zjeVar) {
        super(zjeVar);
        this.m = bbw0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(0L, this, null, false);
    }
}
