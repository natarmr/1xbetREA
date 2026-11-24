package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xwu extends zje {
    public long i;
    public long j;
    public double k;
    public double l;
    public vyu0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ lbu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwu(lbu lbuVar, zje zjeVar) {
        super(zjeVar);
        this.o = lbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(0.0d, 0L, 0L, this);
    }
}
