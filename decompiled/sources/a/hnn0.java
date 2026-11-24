package a;

/* JADX INFO: loaded from: classes.dex */
public final class hnn0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ inn0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnn0(inn0 inn0Var, zje zjeVar) {
        super(zjeVar);
        this.j = inn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(0L, null, this);
    }
}
