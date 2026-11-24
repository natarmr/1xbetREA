package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xgu extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ahu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgu(ahu ahuVar, zje zjeVar) {
        super(zjeVar);
        this.k = ahuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this);
    }
}
