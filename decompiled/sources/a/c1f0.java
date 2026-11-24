package a;

/* JADX INFO: loaded from: classes5.dex */
public final class c1f0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ e1f0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1f0(e1f0 e1f0Var, zje zjeVar) {
        super(zjeVar);
        this.j = e1f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
