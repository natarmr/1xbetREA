package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w2v extends zje {
    public long i;
    public Long j;
    public zpu k;
    public edu l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ zpu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2v(zpu zpuVar, zje zjeVar) {
        super(zjeVar);
        this.p = zpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.i(0L, this, null);
    }
}
