package a;

/* JADX INFO: loaded from: classes3.dex */
public final class udu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wdu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.j = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objG = this.j.G(0, false, false, this);
        return objG == wne.f39444a ? objG : new j0g0(objG);
    }
}
