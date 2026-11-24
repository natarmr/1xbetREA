package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ls4 extends zje {
    public ynb0 i;
    public String j;
    public String k;
    public ws4 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ts4 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls4(ts4 ts4Var, zje zjeVar) {
        super(zjeVar);
        this.n = ts4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, null, null, this);
    }
}
