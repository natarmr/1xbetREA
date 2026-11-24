package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p2u extends zje {
    public long i;
    public int j;
    public cmt k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cmt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2u(cmt cmtVar, zje zjeVar) {
        super(zjeVar);
        this.m = cmtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object objH = this.m.h(0, 0L, this);
        return objH == wne.f39444a ? objH : new j0g0(objH);
    }
}
