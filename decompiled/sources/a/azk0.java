package a;

/* JADX INFO: loaded from: classes5.dex */
public final class azk0 extends zje {
    public lme0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bzk0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azk0(bzk0 bzk0Var, zje zjeVar) {
        super(zjeVar);
        this.k = bzk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0.0d, 0L, null, null, this);
    }
}
