package a;

/* JADX INFO: loaded from: classes6.dex */
public final class amu extends zje {
    public long i;
    public uob0 j;
    public cit0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dgu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amu(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.m = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.s(0L, null, this);
    }
}
