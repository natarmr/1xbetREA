package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tj20 extends zje {
    public m97 i;
    public wbs0 j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ nn20 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.n = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c0(null, this);
    }
}
