package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bw8 extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gw8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw8(gw8 gw8Var, zje zjeVar) {
        super(zjeVar);
        this.k = gw8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
