package a;

/* JADX INFO: loaded from: classes5.dex */
public final class iau extends zje {
    public gmq i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pwi l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iau(pwi pwiVar, zje zjeVar) {
        super(zjeVar);
        this.l = pwiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(null, this);
    }
}
