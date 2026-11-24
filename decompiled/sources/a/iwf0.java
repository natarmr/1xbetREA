package a;

/* JADX INFO: loaded from: classes5.dex */
public final class iwf0 extends zje {
    public mie0 i;
    public mie0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jwf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwf0(jwf0 jwf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = jwf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.w(this);
    }
}
