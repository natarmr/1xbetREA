package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dga0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fga0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dga0(fga0 fga0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fga0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this, false);
    }
}
