package a;

/* JADX INFO: loaded from: classes4.dex */
public final class at10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ot10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at10(ot10 ot10Var, zje zjeVar) {
        super(zjeVar);
        this.j = ot10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(this);
    }
}
