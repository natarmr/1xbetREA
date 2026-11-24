package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n8c extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bbw0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8c(bbw0 bbw0Var, zje zjeVar) {
        super(zjeVar);
        this.k = bbw0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.q(null, this);
    }
}
