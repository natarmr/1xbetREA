package a;

/* JADX INFO: loaded from: classes4.dex */
public final class g270 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ n270 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g270(n270 n270Var, zje zjeVar) {
        super(zjeVar);
        this.j = n270Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
