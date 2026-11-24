package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xg2 extends zje {
    public eat i;
    public eat j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hh2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg2(hh2 hh2Var, zje zjeVar) {
        super(zjeVar);
        this.l = hh2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(this);
    }
}
