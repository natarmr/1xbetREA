package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sz40 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zj2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz40(zj2 zj2Var, yje yjeVar) {
        super(yjeVar);
        this.j = zj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.c(null, this);
        return wne.f39444a;
    }
}
