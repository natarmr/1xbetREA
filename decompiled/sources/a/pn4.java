package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pn4 extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rn4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn4(rn4 rn4Var, zje zjeVar) {
        super(zjeVar);
        this.k = rn4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
