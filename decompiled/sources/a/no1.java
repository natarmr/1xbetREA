package a;

/* JADX INFO: loaded from: classes3.dex */
public final class no1 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dp1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no1(dp1 dp1Var, zje zjeVar) {
        super(zjeVar);
        this.j = dp1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(false, this);
    }
}
