package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wzb0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nqs j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzb0(nqs nqsVar, zje zjeVar) {
        super(zjeVar);
        this.j = nqsVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
