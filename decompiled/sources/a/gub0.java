package a;

/* JADX INFO: loaded from: classes.dex */
public final class gub0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hub0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gub0(hub0 hub0Var, zje zjeVar) {
        super(zjeVar);
        this.j = hub0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
