package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mdu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wdu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.j = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objB = this.j.B(false, false, false, false, this);
        return objB == wne.f39444a ? objB : new j0g0(objB);
    }
}
