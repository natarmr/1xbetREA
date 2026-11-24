package a;

/* JADX INFO: loaded from: classes.dex */
public final class pj20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ on20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.j = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Y(null, 0L, 0.0d, 0.0d, false, false, null, null, null, this);
    }
}
