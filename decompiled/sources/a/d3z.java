package a;

/* JADX INFO: loaded from: classes3.dex */
public final class d3z extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ieu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3z(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.j = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objA = this.j.a(0L, 0L, null, false, null, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
