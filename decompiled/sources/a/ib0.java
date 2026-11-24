package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ib0 extends zje {
    public k7k i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kb0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib0(kb0 kb0Var, zje zjeVar) {
        super(zjeVar);
        this.l = kb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.r(null, null, null, this);
    }
}
