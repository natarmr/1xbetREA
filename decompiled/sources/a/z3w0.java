package a;

/* JADX INFO: loaded from: classes5.dex */
public final class z3w0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ a4w0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3w0(a4w0 a4w0Var, zje zjeVar) {
        super(zjeVar);
        this.j = a4w0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
