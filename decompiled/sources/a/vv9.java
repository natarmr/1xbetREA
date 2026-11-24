package a;

/* JADX INFO: loaded from: classes.dex */
public final class vv9 extends zje {
    public tz9 i;
    public ea0 j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wv9 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv9(wv9 wv9Var, zje zjeVar) {
        super(zjeVar);
        this.m = wv9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
