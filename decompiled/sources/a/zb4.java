package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zb4 extends zje {
    public elt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kc4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb4(kc4 kc4Var, zje zjeVar) {
        super(zjeVar);
        this.k = kc4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
