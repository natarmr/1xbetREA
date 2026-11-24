package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pjl0 extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sjl0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjl0(sjl0 sjl0Var, zje zjeVar) {
        super(zjeVar);
        this.l = sjl0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(0L, 0L, this);
    }
}
