package a;

/* JADX INFO: loaded from: classes5.dex */
public final class f3v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ reu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3v(reu reuVar, zje zjeVar) {
        super(zjeVar);
        this.j = reuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objH = this.j.h(null, this);
        return objH == wne.f39444a ? objH : new j0g0(objH);
    }
}
