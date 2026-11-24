package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qm20 extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public ms2 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nn20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.o = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.A0(0L, null, 0L, 0L, 0L, this);
    }
}
