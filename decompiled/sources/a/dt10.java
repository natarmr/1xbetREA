package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dt10 extends zje {
    public ylq0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ot10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt10(ot10 ot10Var, zje zjeVar) {
        super(zjeVar);
        this.k = ot10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
