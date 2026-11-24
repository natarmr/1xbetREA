package a;

/* JADX INFO: loaded from: classes.dex */
public final class oit extends zje {
    public cht i;
    public String j;
    public double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sit m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oit(sit sitVar, zje zjeVar) {
        super(zjeVar);
        this.m = sitVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.N(this);
    }
}
