package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lap extends zje {
    public long i;
    public long j;
    public long k;
    public boolean l;
    public p7m0 m;
    public k050 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ abp p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lap(abp abpVar, zje zjeVar) {
        super(zjeVar);
        this.p = abpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(0L, this, false);
    }
}
