package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z4j extends zje {
    public long i;
    public Long j;
    public kki k;
    public kki l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ kki p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4j(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.p = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(0L, this, null);
    }
}
