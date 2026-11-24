package a;

/* JADX INFO: loaded from: classes5.dex */
public final class q3z extends zje {
    public u3z i;
    public Long j;
    public boolean k;
    public boolean l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tzi o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3z(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.o = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.o(null, false, null, 0, false, this);
    }
}
