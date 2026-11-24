package a;

/* JADX INFO: loaded from: classes.dex */
public final class bud extends zje {
    public lvj0 i;
    public qu6 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gud l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bud(gud gudVar, zje zjeVar) {
        super(zjeVar);
        this.l = gudVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
