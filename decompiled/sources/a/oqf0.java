package a;

/* JADX INFO: loaded from: classes5.dex */
public final class oqf0 extends zje {
    public double i;
    public String j;
    public drf0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pqf0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqf0(pqf0 pqf0Var, zje zjeVar) {
        super(zjeVar);
        this.m = pqf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0.0d, null, this);
    }
}
