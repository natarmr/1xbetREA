package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fqj extends zje {
    public boolean i;
    public xad0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ erj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.l = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(false, null, this);
    }
}
