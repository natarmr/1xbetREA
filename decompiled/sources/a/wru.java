package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wru extends zje {
    public long i;
    public boolean j;
    public ql5 k;
    public bsu l;
    public bm5 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ jrt o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wru(jrt jrtVar, zje zjeVar) {
        super(zjeVar);
        this.o = jrtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(0L, this);
    }
}
