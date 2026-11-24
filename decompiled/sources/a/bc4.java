package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bc4 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kc4 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc4(kc4 kc4Var, zje zjeVar) {
        super(zjeVar);
        this.j = kc4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.P(this);
    }
}
