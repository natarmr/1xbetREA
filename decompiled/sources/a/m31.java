package a;

/* JADX INFO: loaded from: classes3.dex */
public final class m31 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n31 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m31(n31 n31Var, zje zjeVar) {
        super(zjeVar);
        this.k = n31Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, null, null, null, null, false, null, null, null, 0, 0, false, false, this);
    }
}
