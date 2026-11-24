package a;

/* JADX INFO: loaded from: classes.dex */
public final class r8m0 extends zje {
    public gbi0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x68 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8m0(x68 x68Var, zje zjeVar) {
        super(zjeVar);
        this.k = x68Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
