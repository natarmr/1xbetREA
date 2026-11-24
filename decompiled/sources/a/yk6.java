package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yk6 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bl6 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk6(bl6 bl6Var, zje zjeVar) {
        super(zjeVar);
        this.j = bl6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objB = this.j.b(null, this);
        return objB == wne.f39444a ? objB : new j0g0(objB);
    }
}
