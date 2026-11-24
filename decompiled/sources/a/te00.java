package a;

/* JADX INFO: loaded from: classes5.dex */
public final class te00 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ef00 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te00(ef00 ef00Var, zje zjeVar) {
        super(zjeVar);
        this.j = ef00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
