package a;

/* JADX INFO: loaded from: classes3.dex */
public final class un20 extends zje {
    public nw40 i;
    public String j;
    public Object k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wdu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un20(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.o = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.J(null, 0L, this);
    }
}
