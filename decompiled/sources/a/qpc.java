package a;

/* JADX INFO: loaded from: classes.dex */
public final class qpc extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wsf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpc(wsf0 wsf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = wsf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.n(this);
    }
}
