package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pjb0 extends zje {
    public c5l0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tjb0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjb0(tjb0 tjb0Var, zje zjeVar) {
        super(zjeVar);
        this.k = tjb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
