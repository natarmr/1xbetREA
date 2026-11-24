package a;

/* JADX INFO: loaded from: classes.dex */
public final class j7q0 extends zje {
    public k7q0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k7q0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7q0(k7q0 k7q0Var, zje zjeVar) {
        super(zjeVar);
        this.k = k7q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.t(this);
    }
}
