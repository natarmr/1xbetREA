package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h5m0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ i5m0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5m0(i5m0 i5m0Var, yje yjeVar) {
        super(yjeVar);
        this.j = i5m0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
