package a;

/* JADX INFO: loaded from: classes3.dex */
public final class z980 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ aa80 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z980(aa80 aa80Var, zje zjeVar) {
        super(zjeVar);
        this.j = aa80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.C(null, null, this);
    }
}
