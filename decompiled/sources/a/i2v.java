package a;

/* JADX INFO: loaded from: classes6.dex */
public final class i2v extends zje {
    public long i;
    public long j;
    public boolean k;
    public u8u l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ dgu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2v(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.o = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.r(0L, this);
    }
}
