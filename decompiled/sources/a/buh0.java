package a;

/* JADX INFO: loaded from: classes5.dex */
public final class buh0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kd30 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buh0(kd30 kd30Var, zje zjeVar) {
        super(zjeVar);
        this.k = kd30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b0(null, this);
    }
}
