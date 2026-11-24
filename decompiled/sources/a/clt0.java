package a;

/* JADX INFO: loaded from: classes6.dex */
public final class clt0 extends zje {
    public kka i;
    public krt0 j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ h0q0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clt0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.n = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.u(null, false, false, this);
    }
}
