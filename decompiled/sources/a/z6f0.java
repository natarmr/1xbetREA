package a;

/* JADX INFO: loaded from: classes5.dex */
public final class z6f0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d7f0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6f0(d7f0 d7f0Var, zje zjeVar) {
        super(zjeVar);
        this.j = d7f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.U(this);
    }
}
