package a;

/* JADX INFO: loaded from: classes.dex */
public final class icj extends zje {
    public boolean i;
    public g7m0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ncj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icj(ncj ncjVar, yje yjeVar) {
        super(yjeVar);
        this.l = ncjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(false, this);
    }
}
