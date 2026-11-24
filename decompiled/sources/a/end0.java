package a;

/* JADX INFO: loaded from: classes5.dex */
public final class end0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fnd0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public end0(fnd0 fnd0Var, yje yjeVar) {
        super(yjeVar);
        this.k = fnd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(false, this);
    }
}
