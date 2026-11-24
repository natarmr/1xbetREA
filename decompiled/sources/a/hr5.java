package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hr5 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jr5 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr5(jr5 jr5Var, zje zjeVar) {
        super(zjeVar);
        this.j = jr5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
