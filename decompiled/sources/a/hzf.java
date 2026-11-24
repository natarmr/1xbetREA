package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hzf extends zje {
    public pzf i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jzf k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzf(jzf jzfVar, zje zjeVar) {
        super(zjeVar);
        this.k = jzfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
