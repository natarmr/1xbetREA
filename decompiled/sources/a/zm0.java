package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zm0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dn0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm0(dn0 dn0Var, yje yjeVar) {
        super(yjeVar);
        this.j = dn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.q(0L, 0, null, this);
    }
}
