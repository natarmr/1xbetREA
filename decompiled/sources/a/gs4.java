package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gs4 extends zje {
    public boolean i;
    public String j;
    public ynb0 k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ts4 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs4(ts4 ts4Var, zje zjeVar) {
        super(zjeVar);
        this.n = ts4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(false, null, null, null, this);
    }
}
