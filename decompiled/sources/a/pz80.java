package a;

/* JADX INFO: loaded from: classes.dex */
public final class pz80 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qz80 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz80(qz80 qz80Var, zje zjeVar) {
        super(zjeVar);
        this.k = qz80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
