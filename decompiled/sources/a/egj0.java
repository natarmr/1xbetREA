package a;

/* JADX INFO: loaded from: classes5.dex */
public final class egj0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ngj0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egj0(ngj0 ngj0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ngj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(this);
    }
}
