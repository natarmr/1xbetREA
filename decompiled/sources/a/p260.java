package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p260 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ s260 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p260(s260 s260Var, yje yjeVar) {
        super(yjeVar);
        this.k = s260Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
