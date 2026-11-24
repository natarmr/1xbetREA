package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l5r0 extends zje {
    public d0t i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m5r0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5r0(m5r0 m5r0Var, zje zjeVar) {
        super(zjeVar);
        this.k = m5r0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.P(null, this);
    }
}
