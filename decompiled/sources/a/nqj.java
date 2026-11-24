package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nqj extends zje {
    public dpj i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ erj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.l = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.Q(null, false, this);
    }
}
