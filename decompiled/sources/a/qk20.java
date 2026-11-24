package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qk20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ln20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk20(ln20 ln20Var, zje zjeVar) {
        super(zjeVar);
        this.j = ln20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.S(null, this);
    }
}
