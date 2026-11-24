package a;

/* JADX INFO: loaded from: classes.dex */
public final class o7e extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g45 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7e(g45 g45Var, zje zjeVar) {
        super(zjeVar);
        this.j = g45Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.s(this);
    }
}
