package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ev60 extends zje {
    public long i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hv60 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev60(hv60 hv60Var, zje zjeVar) {
        super(zjeVar);
        this.m = hv60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.U(0L, this, null, false);
    }
}
