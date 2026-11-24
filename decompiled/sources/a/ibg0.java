package a;

/* JADX INFO: loaded from: classes.dex */
public final class ibg0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jw20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibg0(jw20 jw20Var, zje zjeVar) {
        super(zjeVar);
        this.j = jw20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objG = this.j.g(null, this);
        return objG == wne.f39444a ? objG : new ebg0((String) objG);
    }
}
