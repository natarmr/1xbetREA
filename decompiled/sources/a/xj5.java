package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xj5 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ rj5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj5(rj5 rj5Var, yje yjeVar) {
        super(yjeVar);
        this.k = rj5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
