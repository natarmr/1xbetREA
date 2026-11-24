package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l100 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ p100 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l100(p100 p100Var, zje zjeVar) {
        super(zjeVar);
        this.j = p100Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
