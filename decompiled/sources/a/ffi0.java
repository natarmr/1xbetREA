package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ffi0 extends zje {
    public String i;
    public rei0 j;
    public g45 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gfi0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffi0(gfi0 gfi0Var, zje zjeVar) {
        super(zjeVar);
        this.m = gfi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return gfi0.a(this.m, null, null, null, this);
    }
}
