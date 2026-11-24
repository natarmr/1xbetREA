package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vmt extends zje {
    public tzi i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tzi l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmt(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.l = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, false, this);
    }
}
