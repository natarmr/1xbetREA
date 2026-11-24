package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ms4 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ts4 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms4(ts4 ts4Var, zje zjeVar) {
        super(zjeVar);
        this.j = ts4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(null, null, null, null, this);
    }
}
