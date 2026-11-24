package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xy60 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ uw50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy60(uw50 uw50Var, zje zjeVar) {
        super(zjeVar);
        this.j = uw50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
