package a;

/* JADX INFO: loaded from: classes5.dex */
public final class chb0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ihb0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chb0(ihb0 ihb0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ihb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
