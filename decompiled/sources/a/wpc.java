package a;

/* JADX INFO: loaded from: classes.dex */
public final class wpc extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ esg0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpc(esg0 esg0Var, zje zjeVar) {
        super(zjeVar);
        this.j = esg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Y(this);
    }
}
