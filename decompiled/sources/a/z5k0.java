package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z5k0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ a6k0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5k0(a6k0 a6k0Var, zje zjeVar) {
        super(zjeVar);
        this.j = a6k0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
