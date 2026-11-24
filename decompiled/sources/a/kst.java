package a;

/* JADX INFO: loaded from: classes6.dex */
public final class kst extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ nst k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kst(nst nstVar, yje yjeVar) {
        super(yjeVar);
        this.k = nstVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
