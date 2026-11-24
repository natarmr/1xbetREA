package a;

/* JADX INFO: loaded from: classes5.dex */
public final class q3k0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lef0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3k0(lef0 lef0Var, yje yjeVar) {
        super(yjeVar);
        this.j = lef0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(null, this);
    }
}
