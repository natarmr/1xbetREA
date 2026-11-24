package a;

/* JADX INFO: loaded from: classes.dex */
public final class mqv0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nqv0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqv0(nqv0 nqv0Var, zje zjeVar) {
        super(zjeVar);
        this.j = nqv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
