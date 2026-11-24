package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fto0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ gto0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fto0(gto0 gto0Var, zje zjeVar) {
        super(zjeVar);
        this.j = gto0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, null, this);
    }
}
