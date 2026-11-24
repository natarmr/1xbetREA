package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xm20 extends zje {
    public ql5 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ln20 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm20(ln20 ln20Var, zje zjeVar) {
        super(zjeVar);
        this.l = ln20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.Z(null, this);
    }
}
