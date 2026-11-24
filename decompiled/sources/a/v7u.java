package a;

/* JADX INFO: loaded from: classes3.dex */
public final class v7u extends zje {
    public String i;
    public String j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7u(cu cuVar, zje zjeVar) {
        super(zjeVar);
        this.m = cuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(null, 0L, null, null, this);
    }
}
