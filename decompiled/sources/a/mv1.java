package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mv1 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ uv1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv1(uv1 uv1Var, zje zjeVar) {
        super(zjeVar);
        this.j = uv1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.P(this);
    }
}
