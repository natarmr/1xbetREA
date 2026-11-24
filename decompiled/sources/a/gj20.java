package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gj20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ mn20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj20(mn20 mn20Var, zje zjeVar) {
        super(zjeVar);
        this.j = mn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(this);
    }
}
