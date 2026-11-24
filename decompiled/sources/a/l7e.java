package a;

/* JADX INFO: loaded from: classes.dex */
public final class l7e extends zje {
    public rcl i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g45 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7e(g45 g45Var, zje zjeVar) {
        super(zjeVar);
        this.k = g45Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(null, this);
    }
}
