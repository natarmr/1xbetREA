package a;

/* JADX INFO: loaded from: classes4.dex */
public final class x4z extends zje {
    public lbu i;
    public ljg j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ lbu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4z(lbu lbuVar, zje zjeVar) {
        super(zjeVar);
        this.m = lbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object objL = this.m.l(0L, this, null);
        return objL == wne.f39444a ? objL : new j0g0(objL);
    }
}
