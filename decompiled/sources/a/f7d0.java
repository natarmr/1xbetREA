package a;

/* JADX INFO: loaded from: classes.dex */
public final class f7d0 extends zje {
    public fmf0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k7d0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7d0(k7d0 k7d0Var, zje zjeVar) {
        super(zjeVar);
        this.k = k7d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
