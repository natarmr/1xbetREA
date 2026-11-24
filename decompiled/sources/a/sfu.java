package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sfu extends zje {
    public Integer i;
    public b8u j;
    public /* synthetic */ Object k;
    public final /* synthetic */ edu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfu(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.l = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(null, this);
    }
}
