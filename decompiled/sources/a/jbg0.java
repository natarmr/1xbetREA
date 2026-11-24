package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jbg0 extends zje {
    public String i;
    public Object[] j;
    public Object[] k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gxu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbg0(gxu gxuVar, zje zjeVar) {
        super(zjeVar);
        this.m = gxuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(this);
    }
}
