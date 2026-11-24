package a;

/* JADX INFO: loaded from: classes3.dex */
public final class to1 extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dp1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to1(dp1 dp1Var, zje zjeVar) {
        super(zjeVar);
        this.m = dp1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.O(false, false, false, this);
    }
}
