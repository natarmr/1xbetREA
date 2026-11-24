package a;

/* JADX INFO: loaded from: classes.dex */
public final class ev2 extends zje {
    public jie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hv2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev2(hv2 hv2Var, zje zjeVar) {
        super(zjeVar);
        this.k = hv2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u1(0.0f, this);
    }
}
