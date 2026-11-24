package a;

/* JADX INFO: loaded from: classes3.dex */
public final class z2z extends zje {
    public u3z i;
    public Long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wdu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2z(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.l = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.w(null, null, this);
    }
}
