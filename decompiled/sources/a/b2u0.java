package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b2u0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f2u0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2u0(f2u0 f2u0Var, zje zjeVar) {
        super(zjeVar);
        this.j = f2u0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
