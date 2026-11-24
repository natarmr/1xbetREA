package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xjv extends zje {
    public bkv i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yjv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjv(yjv yjvVar, zje zjeVar) {
        super(zjeVar);
        this.k = yjvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
