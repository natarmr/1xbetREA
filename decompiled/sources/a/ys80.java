package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ys80 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jt80 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys80(jt80 jt80Var, zje zjeVar) {
        super(zjeVar);
        this.j = jt80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.W(this);
    }
}
