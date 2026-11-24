package a;

/* JADX INFO: loaded from: classes.dex */
public final class mf20 extends zje {
    public ytb0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qg20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.k = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.U(null, 0.0d, null, this);
    }
}
