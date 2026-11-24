package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r6n0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ s6n0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6n0(s6n0 s6n0Var, yje yjeVar) {
        super(yjeVar);
        this.j = s6n0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.c(null, this);
        return wne.f39444a;
    }
}
