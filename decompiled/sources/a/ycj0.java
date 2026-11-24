package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ycj0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ odj0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycj0(odj0 odj0Var, zje zjeVar) {
        super(zjeVar);
        this.j = odj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
