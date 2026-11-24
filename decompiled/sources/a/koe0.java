package a;

/* JADX INFO: loaded from: classes4.dex */
public final class koe0 extends zje {
    public cge0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z220 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koe0(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.k = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r(0, 0, this);
    }
}
