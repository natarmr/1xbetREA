package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ym20 extends zje {
    public ql5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nn20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.k = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.H0(null, this);
    }
}
