package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ayu0 extends zje {
    public long i;
    public ql5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dyu0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayu0(dyu0 dyu0Var, zje zjeVar) {
        super(zjeVar);
        this.l = dyu0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.O(0L, this);
    }
}
