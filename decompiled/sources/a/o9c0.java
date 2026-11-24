package a;

/* JADX INFO: loaded from: classes4.dex */
public final class o9c0 extends zje {
    public long i;
    public String j;
    public cyu k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ cyu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9c0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.o = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.T(0L, this, null);
    }
}
