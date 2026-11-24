package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qs4 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ts4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs4(ts4 ts4Var, zje zjeVar) {
        super(zjeVar);
        this.k = ts4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(null, this);
    }
}
