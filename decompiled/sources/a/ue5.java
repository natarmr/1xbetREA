package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ue5 extends zje {
    public long i;
    public String j;
    public String k;
    public rwn l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ze5 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue5(ze5 ze5Var, zje zjeVar) {
        super(zjeVar);
        this.n = ze5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.x(0L, null, null, null, this);
    }
}
