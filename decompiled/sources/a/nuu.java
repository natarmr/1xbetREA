package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nuu extends zje {
    public boolean i;
    public long j;
    public Long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ouu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuu(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.n = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.F(false, 0L, null, this);
    }
}
