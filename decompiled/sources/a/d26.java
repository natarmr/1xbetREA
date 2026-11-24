package a;

/* JADX INFO: loaded from: classes.dex */
public final class d26 extends zje {
    public qpg0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tdg0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d26(tdg0 tdg0Var, zje zjeVar) {
        super(zjeVar);
        this.k = tdg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(null, this);
    }
}
