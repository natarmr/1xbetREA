package a;

/* JADX INFO: loaded from: classes5.dex */
public final class u240 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ j340 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u240(j340 j340Var, zje zjeVar) {
        super(zjeVar);
        this.j = j340Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(this);
    }
}
