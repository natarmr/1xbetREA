package a;

/* JADX INFO: loaded from: classes.dex */
public final class pyn extends zje {
    public ngd i;
    public o1x j;
    public Object k;
    public a780 l;
    public gqw0 m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ryn p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyn(ryn rynVar, zje zjeVar) {
        super(zjeVar);
        this.p = rynVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, null, null, null, null, this);
    }
}
