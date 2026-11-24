package a;

/* JADX INFO: loaded from: classes5.dex */
public final class o3z extends zje {
    public u3z i;
    public h4z j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tzi n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3z(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.n = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(null, null, this);
    }
}
