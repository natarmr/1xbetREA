package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z9u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ e1u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9u(e1u e1uVar, zje zjeVar) {
        super(zjeVar);
        this.j = e1uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objI = this.j.i(null, this);
        return objI == wne.f39444a ? objI : new j0g0(objI);
    }
}
