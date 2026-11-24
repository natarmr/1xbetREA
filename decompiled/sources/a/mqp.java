package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mqp extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ocl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqp(ocl oclVar, zje zjeVar) {
        super(zjeVar);
        this.j = oclVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objN = this.j.n(0L, this);
        return objN == wne.f39444a ? objN : new j0g0(objN);
    }
}
