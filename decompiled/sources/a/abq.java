package a;

/* JADX INFO: loaded from: classes4.dex */
public final class abq extends zje {
    public double i;
    public boolean j;
    public g9q k;
    public gcq l;
    public yh7 m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ebq p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abq(ebq ebqVar, zje zjeVar) {
        super(zjeVar);
        this.p = ebqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.R(0.0d, this, false);
    }
}
