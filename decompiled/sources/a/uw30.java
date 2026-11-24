package a;

/* JADX INFO: loaded from: classes3.dex */
public final class uw30 extends zje {
    public f8w i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xw30 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw30(xw30 xw30Var, zje zjeVar) {
        super(zjeVar);
        this.k = xw30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(null, this);
    }
}
