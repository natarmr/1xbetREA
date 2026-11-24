package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pdg extends zje {
    public long i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ udg l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdg(udg udgVar, zje zjeVar) {
        super(zjeVar);
        this.l = udgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object objA = this.l.a(0L, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
