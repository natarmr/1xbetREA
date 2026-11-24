package a;

/* JADX INFO: loaded from: classes2.dex */
public final class byu0 extends zje {
    public String i;
    public axu0 j;
    public double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dyu0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byu0(dyu0 dyu0Var, zje zjeVar) {
        super(zjeVar);
        this.m = dyu0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.R(null, 0.0d, null, this);
    }
}
