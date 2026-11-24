package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ndj0 extends zje {
    public m2c0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ odj0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndj0(odj0 odj0Var, zje zjeVar) {
        super(zjeVar);
        this.k = odj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.W(this);
    }
}
