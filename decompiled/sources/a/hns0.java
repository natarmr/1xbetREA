package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hns0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ins0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hns0(ins0 ins0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ins0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objA = this.j.a(0L, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
