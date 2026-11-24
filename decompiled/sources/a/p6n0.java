package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p6n0 extends zje {
    public qsg0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ q6n0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6n0(q6n0 q6n0Var, zje zjeVar) {
        super(zjeVar);
        this.k = q6n0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
