package a;

/* JADX INFO: loaded from: classes.dex */
public final class iw90 extends zje {
    public Object i;
    public Object j;
    public k050 k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lw90 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw90(lw90 lw90Var, zje zjeVar) {
        super(zjeVar);
        this.n = lw90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, 0L, null, this);
    }
}
