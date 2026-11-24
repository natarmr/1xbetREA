package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w2z extends zje {
    public u3z i;
    public Long j;
    public long k;
    public boolean l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wdu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2z(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.o = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, this);
    }
}
