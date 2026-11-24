package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jnp extends zje {
    public gmp i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nnp k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnp(nnp nnpVar, zje zjeVar) {
        super(zjeVar);
        this.k = nnpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.W(null, this);
    }
}
