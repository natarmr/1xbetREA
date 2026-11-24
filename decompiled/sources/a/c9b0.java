package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c9b0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g9b0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9b0(g9b0 g9b0Var, zje zjeVar) {
        super(zjeVar);
        this.j = g9b0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.C(this);
    }
}
