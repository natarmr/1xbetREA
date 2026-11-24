package a;

/* JADX INFO: loaded from: classes4.dex */
public final class i5k extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ phf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5k(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(null, this);
    }
}
