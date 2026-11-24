package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vs6 extends zje {
    public ql5 i;
    public tg20 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dt6 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs6(dt6 dt6Var, zje zjeVar) {
        super(zjeVar);
        this.m = dt6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.R(null, this);
    }
}
