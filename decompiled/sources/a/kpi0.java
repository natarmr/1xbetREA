package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kpi0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lpi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpi0(lpi0 lpi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = lpi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
