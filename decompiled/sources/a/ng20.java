package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ng20 extends zje {
    public ql5 i;
    public tg20 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rg20 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng20(rg20 rg20Var, zje zjeVar) {
        super(zjeVar);
        this.l = rg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.z(null, this);
    }
}
