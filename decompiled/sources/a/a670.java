package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a670 extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g670 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a670(g670 g670Var, zje zjeVar) {
        super(zjeVar);
        this.k = g670Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(this);
    }
}
