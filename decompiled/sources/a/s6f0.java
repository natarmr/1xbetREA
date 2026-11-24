package a;

/* JADX INFO: loaded from: classes5.dex */
public final class s6f0 extends zje {
    public mm4 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d7f0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6f0(d7f0 d7f0Var, zje zjeVar) {
        super(zjeVar);
        this.k = d7f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, null, this);
    }
}
