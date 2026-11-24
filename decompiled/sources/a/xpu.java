package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xpu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ oif0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpu(oif0 oif0Var, zje zjeVar) {
        super(zjeVar);
        this.j = oif0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}
