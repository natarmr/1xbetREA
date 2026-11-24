package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mru extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ a6u o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mru(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.o = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.y(0L, 0L, 0L, 0L, false, this);
    }
}
