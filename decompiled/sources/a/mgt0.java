package a;

/* JADX INFO: loaded from: classes.dex */
public final class mgt0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ trm0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgt0(trm0 trm0Var, zje zjeVar) {
        super(zjeVar);
        this.j = trm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(0, this, null, null);
    }
}
