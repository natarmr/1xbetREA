package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jqn extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ khf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqn(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this, null, null);
    }
}
