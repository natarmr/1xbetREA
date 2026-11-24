package a;

/* JADX INFO: loaded from: classes5.dex */
public final class u2c0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ eqx j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2c0(eqx eqxVar, zje zjeVar) {
        super(zjeVar);
        this.j = eqxVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
