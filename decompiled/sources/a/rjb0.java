package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rjb0 extends zje {
    public rbb i;
    public ygs j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tjb0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjb0(tjb0 tjb0Var, zje zjeVar) {
        super(zjeVar);
        this.l = tjb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(null, this);
    }
}
