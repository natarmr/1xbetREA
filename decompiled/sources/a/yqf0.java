package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yqf0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ drf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqf0(drf0 drf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = drf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this, null);
    }
}
