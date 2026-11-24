package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h3v extends zje {
    public long i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zpu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3v(zpu zpuVar, zje zjeVar) {
        super(zjeVar);
        this.l = zpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object objM = this.l.m(0, 0L, this);
        return objM == wne.f39444a ? objM : new j0g0(objM);
    }
}
