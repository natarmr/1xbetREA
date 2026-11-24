package a;

/* JADX INFO: loaded from: classes3.dex */
public final class em7 extends zje {
    public lsn i;
    public String j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fm7 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em7(fm7 fm7Var, zje zjeVar) {
        super(zjeVar);
        this.m = fm7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Y(null, this);
    }
}
