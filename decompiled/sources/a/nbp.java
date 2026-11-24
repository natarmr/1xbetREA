package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nbp extends zje {
    public ccp i;
    public a1t j;
    public a1t k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ccp m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbp(ccp ccpVar, zje zjeVar) {
        super(zjeVar);
        this.m = ccpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.P(this);
    }
}
