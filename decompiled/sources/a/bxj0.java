package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bxj0 extends zje {
    public ql5 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yxj0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxj0(yxj0 yxj0Var, zje zjeVar) {
        super(zjeVar);
        this.l = yxj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.F(null, this);
    }
}
