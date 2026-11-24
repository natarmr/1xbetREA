package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mr extends zje {
    public long i;
    public long j;
    public boolean k;
    public sgb l;
    public /* synthetic */ Object m;
    public final /* synthetic */ nr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.n = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.u(0L, false, null, this);
    }
}
