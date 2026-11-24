package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fni0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ gni0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fni0(gni0 gni0Var, zje zjeVar) {
        super(zjeVar);
        this.j = gni0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
