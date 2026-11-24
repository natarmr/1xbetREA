package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hn10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pn10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn10(pn10 pn10Var, zje zjeVar) {
        super(zjeVar);
        this.j = pn10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.R(false, this);
    }
}
