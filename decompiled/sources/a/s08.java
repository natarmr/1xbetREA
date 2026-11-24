package a;

/* JADX INFO: loaded from: classes4.dex */
public final class s08 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ w08 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s08(w08 w08Var, zje zjeVar) {
        super(zjeVar);
        this.j = w08Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
