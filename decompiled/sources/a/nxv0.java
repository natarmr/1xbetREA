package a;

/* JADX INFO: loaded from: classes6.dex */
public final class nxv0 extends zje {
    public lxv0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oxv0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxv0(oxv0 oxv0Var, zje zjeVar) {
        super(zjeVar);
        this.k = oxv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(0.0f, this);
    }
}
