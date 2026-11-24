package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dt8 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ et8 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt8(et8 et8Var, zje zjeVar) {
        super(zjeVar);
        this.j = et8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0, false, false, this);
    }
}
