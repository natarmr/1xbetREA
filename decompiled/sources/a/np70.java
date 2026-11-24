package a;

/* JADX INFO: loaded from: classes3.dex */
public final class np70 extends zje {
    public hle i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sp70 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np70(sp70 sp70Var, yje yjeVar) {
        super(yjeVar);
        this.k = sp70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.D(null, this);
    }
}
