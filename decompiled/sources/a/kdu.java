package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kdu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wdu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.j = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objZ = this.j.z(false, false, false, 0, false, false, this);
        return objZ == wne.f39444a ? objZ : new j0g0(objZ);
    }
}
