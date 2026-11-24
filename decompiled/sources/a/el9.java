package a;

/* JADX INFO: loaded from: classes3.dex */
public final class el9 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hl9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el9(hl9 hl9Var, zje zjeVar) {
        super(zjeVar);
        this.j = hl9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
