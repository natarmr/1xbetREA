package a;

/* JADX INFO: loaded from: classes5.dex */
public final class s2v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ svu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2v(svu svuVar, zje zjeVar) {
        super(zjeVar);
        this.j = svuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objM = this.j.m(0, 0, 0L, this, null);
        return objM == wne.f39444a ? objM : new j0g0(objM);
    }
}
