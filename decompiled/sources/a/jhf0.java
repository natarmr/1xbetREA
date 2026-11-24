package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jhf0 extends zje {
    public long i;
    public long j;
    public int k;
    public boolean l;
    public q4f m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wdu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhf0(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.o = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.u(0, 0L, this, false);
    }
}
