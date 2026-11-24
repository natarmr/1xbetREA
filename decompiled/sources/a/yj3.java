package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yj3 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lhf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj3(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.K(null, this);
    }
}
