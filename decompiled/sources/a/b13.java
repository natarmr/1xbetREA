package a;

/* JADX INFO: loaded from: classes.dex */
public final class b13 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ c13 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b13(c13 c13Var, zje zjeVar) {
        super(zjeVar);
        this.j = c13Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.a(null, this);
        return wne.f39444a;
    }
}
