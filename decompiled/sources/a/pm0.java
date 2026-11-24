package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pm0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dn0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm0(dn0 dn0Var, zje zjeVar) {
        super(zjeVar);
        this.k = dn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, null, null, this);
    }
}
