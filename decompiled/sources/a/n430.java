package a;

/* JADX INFO: loaded from: classes6.dex */
public final class n430 extends zje {
    public ut20 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p430 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n430(p430 p430Var, zje zjeVar) {
        super(zjeVar);
        this.k = p430Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
