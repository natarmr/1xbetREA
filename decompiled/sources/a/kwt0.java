package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kwt0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ikt0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwt0(ikt0 ikt0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ikt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
