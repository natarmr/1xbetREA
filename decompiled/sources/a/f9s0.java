package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f9s0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ j9s0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9s0(j9s0 j9s0Var, zje zjeVar) {
        super(zjeVar);
        this.j = j9s0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, 0, 0, false, this);
    }
}
