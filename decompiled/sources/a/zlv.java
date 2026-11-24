package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zlv extends zje {
    public long i;
    public q5z j;
    public nc0 k;
    public k9s l;
    public /* synthetic */ Object m;
    public final /* synthetic */ nc0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlv(nc0 nc0Var, zje zjeVar) {
        super(zjeVar);
        this.n = nc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(0L, null, this);
    }
}
