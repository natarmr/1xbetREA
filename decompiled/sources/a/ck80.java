package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ck80 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ek80 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck80(ek80 ek80Var, zje zjeVar) {
        super(zjeVar);
        this.k = ek80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(false, this);
    }
}
