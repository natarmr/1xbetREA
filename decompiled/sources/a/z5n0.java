package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z5n0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ y5n0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5n0(y5n0 y5n0Var, yje yjeVar) {
        super(yjeVar);
        this.k = y5n0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
