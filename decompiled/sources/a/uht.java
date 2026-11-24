package a;

/* JADX INFO: loaded from: classes4.dex */
public final class uht extends zje {
    public xgt i;
    public a7q j;
    public xgt k;
    public long l;
    public long m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ uii p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uht(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.p = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.A(null, this);
    }
}
