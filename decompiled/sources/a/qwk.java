package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qwk extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yj2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwk(yj2 yj2Var, yje yjeVar) {
        super(yjeVar);
        this.j = yj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
