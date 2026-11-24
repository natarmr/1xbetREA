package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qn4 extends zje {
    public fzs0 i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rn4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn4(rn4 rn4Var, zje zjeVar) {
        super(zjeVar);
        this.l = rn4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
