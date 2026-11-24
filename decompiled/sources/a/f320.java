package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f320 extends zje {
    public ouj0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g320 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f320(g320 g320Var, zje zjeVar) {
        super(zjeVar);
        this.k = g320Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
