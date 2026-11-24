package a;

/* JADX INFO: loaded from: classes4.dex */
public final class iig0 extends zje {
    public mkg0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jig0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iig0(jig0 jig0Var, zje zjeVar) {
        super(zjeVar);
        this.k = jig0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
