package a;

/* JADX INFO: loaded from: classes2.dex */
public final class izf extends zje {
    public String i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jzf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izf(jzf jzfVar, zje zjeVar) {
        super(zjeVar);
        this.l = jzfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(0L, this, null);
    }
}
