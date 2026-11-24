package a;

/* JADX INFO: loaded from: classes3.dex */
public final class x41 extends zje {
    public String i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z41 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(z41 z41Var, zje zjeVar) {
        super(zjeVar);
        this.l = z41Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, null, 0, null, this);
    }
}
