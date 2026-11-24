package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c9c extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ do20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9c(do20 do20Var, zje zjeVar) {
        super(zjeVar);
        this.j = do20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(this, null, null);
    }
}
