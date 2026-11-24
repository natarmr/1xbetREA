package a;

/* JADX INFO: loaded from: classes.dex */
public final class j52 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ k52 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(k52 k52Var, zje zjeVar) {
        super(zjeVar);
        this.j = k52Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, this);
    }
}
